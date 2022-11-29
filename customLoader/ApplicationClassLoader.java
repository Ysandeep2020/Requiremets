package com.sk.requrements.customLoader;

public class ApplicationClassLoader {
	private static String clazz;

	public ApplicationClassLoader(String file) throws ClassNotFoundException, InterruptedException {
		System.out.print("Loading Start");
		DotFactory.print(3, 1);
		Thread.sleep(1000);
		System.out.println();
		System.out.print("request go to ApplicationClassLoader");
		System.out.println();
		new ExtentionClassLoader(file);
	}

	public static void checkFile(String file) throws ClassNotFoundException, InterruptedException {
		System.out.println();
		Thread.sleep(2000);
		System.out.print("Loading into ApplicationCLassLoader");
		DotFactory.print(3, 1);
		Thread.sleep(2000);
		if (file.equals(clazz)) {
			System.out.print(file + " Class is Loaded By -classpath");
		} else {
			System.out.print("Not Found");
			System.out.println();
			System.out.println();
			throw new ClassNotFoundException(file + " Not found In any ClassLoader");
		}
	}

	public static void load(String myClass) {
		clazz = myClass;
	}
}
