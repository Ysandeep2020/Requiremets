package com.sk.requrements.customLoader;

public class BootStrapClassLoader {
	private static String clazz;

	public BootStrapClassLoader(String file) throws ClassNotFoundException, InterruptedException {
		Thread.sleep(2000);
		System.out.println("Request will forword to BootStrapClassLoader");
		checkFile(file);
	}

	public void checkFile(String file) throws ClassNotFoundException, InterruptedException {
		Thread.sleep(2000);
		System.out.print("Loading into BootStrapCLassLoader");
		DotFactory.print(3, 1);
		Thread.sleep(2000);
		if (file.equals(clazz)) {
			System.out.print(file + " Class is Loaded By JRE/lib/rt.jar");
		} else {
			System.out.print("Not found");
			ExtentionClassLoader.checkFile(file);
		}
	}

	public static void load(String myClass) {
		clazz = myClass;
	}
}
