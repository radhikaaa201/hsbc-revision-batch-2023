package com.hsbc.collections;

import java.util.Set;
import java.util.TreeSet;

public class TestSet1 {
	public static void main(String[] args) {
		//Set<String> set1 = new HashSet<>();
		Set<Integer> set2 = new TreeSet<>();
		set2.add(5);
		set2.add(1);
		set2.add(6);
		set2.add(4);
		System.out.println(set2);
		Set<String> set1 = new TreeSet<>(); // maintains elements sorted order
		set1.add("HELLO");
		set1.add("hello");
		set1.add("Hello");
		set1.add("hello");
		set1.add("test");
		set1.add("demo");
		set1.add("123");
		System.out.println("Size: "+set1.size());
		System.out.println(set1);
		
	}
}
/*
 *  Output: 123, HELLO, Hello, demo, hello, test
 */
