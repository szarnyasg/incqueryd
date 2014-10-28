package hu.bme.mit.incqueryd.tooling.ide;

import hu.bme.mit.incqueryd.arch.util.ArchUtil;
import hu.bme.mit.incqueryd.tooling.ide.httpclient.HttpClient;
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

import arch.Configuration;

public class CheckArchitectureHandler extends AbstractHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		new Job("Checking architecture") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				final IFile file = ArchitectureSelector.getSelection(event);
				String architectureFile = file.getLocation().toString();
				Configuration configuration;
				try {
					configuration = ArchUtil.loadConfiguration(architectureFile);
				} catch (IOException e) {
					throw new RuntimeException("Cannot process architecture file.", e);
				}

				String coordinatorIp = configuration.getCoordinatorMachine().getIp();

				try {
					String response = HttpClient.getURL("http://" + coordinatorIp +":9090/check");
					System.out.println(response);
				} catch (IOException e) {
					throw new RuntimeException("Coordinator actor did not respond.", e);
				}
				return Status.OK_STATUS;
			}
		}.schedule();
		return null;
	}

}
