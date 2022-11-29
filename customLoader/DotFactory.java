package com.sk.requrements.customLoader;

public class DotFactory {

	public static void print(int dots, int second) throws InterruptedException {
		for (int i = 1; i <= dots; i++) {
			Thread.sleep(1000 * second);
			System.out.print(".");
		}
	}
}
