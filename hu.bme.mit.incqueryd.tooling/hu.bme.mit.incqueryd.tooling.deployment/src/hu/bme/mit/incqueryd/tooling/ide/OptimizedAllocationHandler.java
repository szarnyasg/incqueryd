package hu.bme.mit.incqueryd.tooling.ide;

import hu.bme.mit.incqueryd.csp.util.ReteAllocator;
import hu.bme.mit.incqueryd.tooling.ide.dialogs.OptimizationObjectiveFunctionDialog;
import hu.bme.mit.incqueryd.tooling.ide.util.ArchitectureSelector;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class OptimizedAllocationHandler extends AbstractHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		new Job("Allocating Rete (with optimization)") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				final IFile file = ArchitectureSelector.getSelection(event);
				String recipeFile = file.getLocation().toString();

				Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

				// Pop up a dialog to ask for an inventory file
				FileDialog fd = new FileDialog(activeShell, SWT.OPEN);
				fd.setText("Choose Inventory file");
				fd.setFilterPath(file.getProject().getLocation().toString());
				String[] filterExt = { "*.inventory" };
				fd.setFilterExtensions(filterExt);
				String inventoryFile = fd.open();

				// Pop up objective function selection dialog
				OptimizationObjectiveFunctionDialog ofDialog = new OptimizationObjectiveFunctionDialog(activeShell);
				ofDialog.open();
				boolean forCommunication = ofDialog.forCommunication();

				final String outputFile = file.getProject().getLocation().toString() + "/arch-opt/" + file.getName().replaceFirst("\\." + file.getFileExtension(), "") + ".arch";

				ReteAllocator reteAllocator = new ReteAllocator(forCommunication, recipeFile, inventoryFile, outputFile);
				try {
					boolean success = reteAllocator.allocate();

					if (success) {
						MessageDialog dialog = new MessageDialog(activeShell, "Allocation result", null, "Your arch file is ready in the arch-opt folder!", MessageDialog.INFORMATION, new String[] { "OK" }, 0);
						dialog.open();
					} else {
						MessageDialog dialog = new MessageDialog(activeShell, "Allocation result", null, "The problem can not be solved with the current resource set!", MessageDialog.ERROR, new String[] { "OK" }, 0);
						dialog.open();
					}
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				return Status.OK_STATUS;
			}
		}.schedule();
		return null;
	}

}
