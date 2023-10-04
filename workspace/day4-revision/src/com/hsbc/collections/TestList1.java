package com.hsbc.collections;

import java.util.ArrayList;
import java.util.List;

public class TestList1 {
	public static void main(String[] args) {
		// Immutable List or Set can be created using List.of or Set.of
		// Immutable collection can't be modified doing so results in exception
		List<Integer> list = List.of(10, 50, 40, 20, 30, 20, 10);
		System.out.println("Size: "+list.size());
		//list.add(35); You can't modify Immutable List
		
		// Mutable list
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(50);
		list2.add(30);
		list2.add(20);
		System.out.println(list2);
		//list2.remove(20); removes by index 20
		list2.remove(Integer.valueOf(30)); // remove(30byValue)
		System.out.println("Size: "+list2.size());
		// create a List<String> and perform add & remove
		// In case of double & float you have Double.valueOf & Float.valueOf
		
	}
}
