package com.hsbc.examples;

interface Test { 
	public void method();
}
abstract class TestImpl implements Test {
	public void method() {
		System.out.println("hi");
	}
}
public class TestInterface {
	public static void main(String[] args) {
		//Test t1 = new TestImpl();
	}
}
