package fr.inria.gag.k3dsa;

import java.io.File;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

import fr.inria.gag.guard.base.IGAGGuard;

public class GagGuardExecutor {
	public IGAGGuard loadGuard(String libLocation, String classPath) throws Exception {
		ClassLoader loader = URLClassLoader.newInstance(
            new URL[] { new File(libLocation).toURI().toURL() },
            getClass().getClassLoader()
        );
		Class<?> loadedClass = Class.forName(classPath, true, loader);
		Class<? extends IGAGGuard> guardClass = loadedClass.asSubclass(IGAGGuard.class);
		for (Constructor<?> ctor : guardClass.getConstructors()) {
			Class<?>[] paramTypes = ctor.getParameterTypes();
			if (paramTypes.length == 0) {
				return (IGAGGuard)ctor.newInstance();
			}
		}
		throw new Exception("Could not instanciate your Guard");
	}
	
	public boolean isRuleActivable(String libLocation, String classPath) throws Exception {
		IGAGGuard guard = this.loadGuard(libLocation, classPath);
		return guard.isRuleActivable();
	}
}
