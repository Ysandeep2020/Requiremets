package com.sk.requrements;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Requirements {

	public static void main(String[] args) {
		addHyphen();
		countNumberWithDigit();
		abcxyz();
		zeroAndOneByCustom2();
		zeroAndoneByCustom1();
		zeroAndOne();

		System.out.println(addAA());

		int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		// countNumberWithDigit();
		System.out.println(findMissingNumber(arr));
	}

	private static void addHyphen() {
		String input = "123456789012345";
		char[] array = input.toCharArray();
		// with the help of while loop
		int i = 0;
		int count = 0;
		String newString = "";
		String add = "-";
		while (input.length() != i) {
			count++;
			newString += array[i];

			if (count == 3 && i != input.length() - 1) {
				newString += add;
				count = 0;
			}
			i++;
		}
		System.out.println(newString);

	}

	private static int findMissingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		int restSum = 0;
		for (int in : arr)
			restSum += in;
		return sum - restSum;
	}

	public static String addAA() {
		String input = "bc";
		// output=aabaacaa;
		String add = "aa";
		String newString = "";
		char[] array = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if (i == 0)
				newString += add;
			newString += array[i] + add;
		}
		return newString;
	}

	public static void zeroAndOne() {
		int arr[] = { 1, 1, 0, 1, 0, 1, 0 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void zeroAndOneByCustom2() {
		int arr[] = { 1, 1, 0, 1, 0, 1, 0 };
		int count = 0;
		for (int i : arr) {
			if (i == 0)
				count++;
		}
		for (int i = 0; i < count; i++) {
			arr[i] = 0;
		}
		for (int i = count; i < arr.length; i++) {
			arr[i] = 1;
		}
	}

	public static void zeroAndoneByCustom1() {
		int arr[] = { 1, 1, 0, 1, 0, 1, 0 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void abcxyz() {
		String s1 = "abc";
		String s2 = "xyz";
		// output= cxbyaz
		char[] array1 = s1.toCharArray();
		char[] array2 = s2.toCharArray();
		String newString = "";
		for (int i = 0; i < array2.length; i++) {
			newString += String.valueOf(array1[array1.length - 1 - i]) + String.valueOf(array2[i]);
		}
		System.out.println(newString);
	}

	public static void countNumberWithDigit() {
		String input = "HELLO I AM JAVA DEVELOPER";

		Map<Character, Integer> map = new TreeMap<>();
		for (char ch : input.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else
				map.put(ch, 1);
		}
		map.entrySet().stream().filter(inMap -> inMap.getKey() != ' ').forEach(inMap -> {
			System.out.print(inMap.getKey() + "" + inMap.getValue());
		});
		System.out.println();
	}
}
