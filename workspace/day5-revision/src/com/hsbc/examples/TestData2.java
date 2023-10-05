package com.hsbc.examples;

class Data1 {
	
	public Data1() {
		System.out.println("B");
	}
	public Data1(int a) {
		System.out.println("A");
	}
	
}
public class TestData2 {
	public static void main(String[] args) {
		Data1 d1 = new Data1(10);
		
		
	}
}
