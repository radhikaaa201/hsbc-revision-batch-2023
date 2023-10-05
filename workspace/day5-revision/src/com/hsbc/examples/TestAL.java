package com.hsbc.examples;

import java.util.ArrayList;
import java.util.List;

public class TestAL {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(20);
		
		list.remove(1);
		System.out.println(list);
	}
}
