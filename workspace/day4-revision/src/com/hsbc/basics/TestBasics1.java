package com.hsbc.basics;

public class TestBasics1 {
	static int x; // 0
	static String y; // null
	static int z; // 0
	static int a; // 0
	public static void main(String[] args) {
		System.out.println(x+y+z+a); // 0null00
		System.out.println(a+x+y+z); // 0null0
	}
}
/*
	Output1: Compile Time Error
	Output2: NullPointer Exception
	Output3: 0
	Output4: 0null0
	Output5: 0null00
*/