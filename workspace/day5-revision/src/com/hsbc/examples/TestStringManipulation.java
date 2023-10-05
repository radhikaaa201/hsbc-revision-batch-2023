package com.hsbc.examples;

public class TestStringManipulation {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = "Java";
		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3); // false
 		System.out.println(s2 == s4); // true
		
		System.out.println("____________________");
		System.out.println(s1.equals(s2)); // true
		System.out.println(s2.equals(s4)); // true
	}
}
