package com.sk.requrements.customLoader;

public class ExtentionClassLoader {
	private static String clazz;

	public ExtentionClassLoader(String file) throws ClassNotFoundException, InterruptedException {
		Thread.sleep(2000);
		System.out.println("Request will forword to ExtentionClassLoader");
		new BootStrapClassLoader(file);
	}

	public static void checkFile(String file) throws ClassNotFoundException, InterruptedException {
		System.out.println();
		Thread.sleep(2000);
		System.out.print("Loading into ExtentionCLassLoader");
		DotFactory.print(3, 1);
		Thread.sleep(2000);
		if (file.equals(clazz)) {
			System.out.print(file + " Class is Loaded By JRE/lib/ext/ directory");
		} else {
			System.out.print("Not Found");
			ApplicationClassLoader.checkFile(file);
		}
	}

	public static void load(String myClass) {
		clazz = myClass;
	}

}
