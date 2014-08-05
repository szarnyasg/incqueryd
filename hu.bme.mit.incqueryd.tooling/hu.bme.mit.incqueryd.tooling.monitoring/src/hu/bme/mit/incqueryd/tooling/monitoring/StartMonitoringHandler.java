package hu.bme.mit.incqueryd.tooling.monitoring;

import hu.bme.mit.incqueryd.tooling.monitoring.preferences.PreferenceConstants;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IOConsoleOutputStream;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class StartMonitoringHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			File configFile = createMonitoringConfig();
			IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
			ProcessBuilder processBuilder = new ProcessBuilder("java", "-jar", preferenceStore.getString(PreferenceConstants.MONITORING_SERVER_JAR), "server", configFile.getAbsolutePath());
			IOConsole console = new IOConsole("IncQuery-D Monitoring", null);
			console.activate();
			ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[]{ console });
			IOConsoleOutputStream consoleStream = console.newOutputStream();
			Process process = processBuilder.start();
			StreamToConsoleRedirector errorGobbler = new StreamToConsoleRedirector(process.getErrorStream(), consoleStream);
			StreamToConsoleRedirector outputGobbler = new StreamToConsoleRedirector(process.getInputStream(), consoleStream);
			errorGobbler.start();
			outputGobbler.start();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	private File createMonitoringConfig() throws IOException, UnknownHostException {
		File tempDir = new File(System.getProperty("java.io.tmpdir"));
		File configFile = new File(tempDir, "temp.yaml");
		IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
		Files.write("collectorInterface: " + preferenceStore.getString(PreferenceConstants.COLLECTOR_INTERFACE), configFile, Charsets.UTF_8);
		return configFile;
	}

}