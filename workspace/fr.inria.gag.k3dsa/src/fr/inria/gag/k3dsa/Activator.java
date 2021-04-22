package fr.inria.gag.k3dsa;

import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystemManager;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class Activator implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "fr.inria.gag.k3dsa"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	protected MessagingSystem messaggingSystem = null;
		
	@Override
	public void start(BundleContext context) throws Exception {
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
	}
	
	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	public MessagingSystem getMessaggingSystem() {
		if (messaggingSystem == null) {
			MessagingSystemManager msm = new MessagingSystemManager();
			// reuse messaging system from the Modeling Workbench Engine
			 messaggingSystem = msm.createBestPlatformMessagingSystem(
					org.eclipse.gemoc.executionframework.engine.Activator.PLUGIN_ID,
					org.eclipse.gemoc.executionframework.engine.Activator.CONSOLE_NAME);
			//messaggingSystem = msm.getBestPlatformSharedMessaggingSystem();
		}
		return messaggingSystem;
	}

	public static void debug(String msg) {
		getDefault().getMessaggingSystem().debug(msg, "");
	}
	public static void error(String msg) {
		getDefault().getMessaggingSystem().error(msg, "");
	}
	public static void error(String msg, Exception e) {
		getDefault().getMessaggingSystem().error(msg, "", e);
	}
	public static void warn(String msg) {
		getDefault().getMessaggingSystem().warn(msg, "");
	}
	public static void warn(String msg, Exception e) {
		getDefault().getMessaggingSystem().warn(msg, "", e);
	}
	
	public static String readConsoleLine(String msg) {
		return getDefault().getMessaggingSystem().readLine(msg);
	}

}
