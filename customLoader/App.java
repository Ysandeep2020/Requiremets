package com.sk.requrements.customLoader;

/**
 * create Custom ClassLoader for better understanding ...
 * 
 * @author Sandeep yadav
 *
 */
public class App {
	public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
		// create .class file with any name
		String myClass = "my.class";
		// setInto any ClassLoader use only one at a time

		// BootStrapClassLoader.load(myClass);
		// ExtentionClassLoader.load(myClass);
		ApplicationClassLoader.load(myClass);

		ApplicationClassLoader ac = new ApplicationClassLoader(myClass);

	}
}
