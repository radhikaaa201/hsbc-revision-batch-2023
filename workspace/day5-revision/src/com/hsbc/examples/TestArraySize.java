package com.hsbc.examples;

public class TestArraySize {
	static int[] arr2;
	static int[] arr3 = {};
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 33;
		arr[2] = 44;
		
		System.out.println(arr.length);
		System.out.println(arr3.length);
		//System.out.println(arr2.length);
	}
}
