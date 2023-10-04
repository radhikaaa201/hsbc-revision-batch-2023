package com.hsbc.basics;

public class TestSimpleArrays {
	public static void main(String[] args) {
		String[] fruits = {"Apple", "Orange", "Grapes", "Mango"};
		String[] names = new String[3];
//		names[0] = "Virat";
//		names[1] = "Rohith";
//		names[2] = "Yuvraj";
		fruits[0] = "Pineapple";
		for(String fruit : fruits) {
			System.out.print(fruit.toUpperCase()+" ");
		}
		System.out.println();
		for(String name : names) {
			if(name != null)
				System.out.print(name.toUpperCase()+" ");
			System.out.println("---------");
		}
	}
}
