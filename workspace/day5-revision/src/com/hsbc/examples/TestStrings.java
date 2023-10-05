package com.hsbc.examples;

public class TestStrings {
	public static void main(String[] args) {
		// StringBuffer is mutable
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		System.out.println(sb1+ " "+sb2);
		sb1.append("123");
		System.out.println(sb1+ " "+sb2);
	}
}
