package fr.inria.gag.k3dsa;

import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystemManager;



public class Console {

	// The plug-in ID
	
	public static MessagingSystem messaggingSystem = null;
		

	
	public static MessagingSystem getMessaggingSystem() {
		if (messaggingSystem == null) {
			MessagingSystemManager msManager = new MessagingSystemManager();
			// reuse messaging system from the Modeling Workbench Engine
			 messaggingSystem = msManager.createBestPlatformMessagingSystem("Gag", "Simple gag interpreter");
			//messaggingSystem = msm.getBestPlatformSharedMessaggingSystem();
		}
		return messaggingSystem;
	}

	public static void debug(String msg) {
		getMessaggingSystem().debug(msg, "");
	}
	public static void error(String msg) {
		getMessaggingSystem().error(msg, "");
	}
	public static void error(String msg, Exception e) {
		getMessaggingSystem().error(msg, "", e);
	}
	public static void warn(String msg) {
		getMessaggingSystem().warn(msg, "");
	}
	public static void warn(String msg, Exception e) {
		getMessaggingSystem().warn(msg, "", e);
	}
	
	public static String readConsoleLine(String msg) {
		return getMessaggingSystem().readLine(msg);
	}

}
