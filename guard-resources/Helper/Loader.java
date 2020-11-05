static Object instantiate(List<String> args, String className) throws Exception {
    Class<?> clazz = Class.forName(className);
	
    for (Constructor<?> ctor : clazz.getConstructors()) {
        Class<?>[] paramTypes = ctor.getParameterTypes();
		
        if (args.size() == paramTypes.length) {
            Object[] convertedArgs = new Object[args.size()];
            for (int i = 0; i < convertedArgs.length; i++) {
                convertedArgs[i] = convert(paramTypes[i], args.get(i));
            }
			
            return ctor.newInstance(convertedArgs);
        }
    }
    throw new IllegalArgumentException("Don't know how to instantiate " + className);
}