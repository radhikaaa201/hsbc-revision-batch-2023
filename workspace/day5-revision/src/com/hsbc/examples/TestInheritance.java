package com.hsbc.examples;

class First {
	public void method() {
		System.out.println("first");
	}
}
class Second extends First {
	public void method() {
		System.out.println("second");
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		First f1 = new Second();
		f1.method();
	}

}
