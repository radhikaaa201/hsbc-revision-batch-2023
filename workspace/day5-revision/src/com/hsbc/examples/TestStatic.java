package com.hsbc.examples;

class A {
	static int x;
	int y;
	// static block is executed only once when the class is loaded
	static {
		System.out.println("static block");
	}
	static void test() {
		System.out.println("test method");
	}
}

public class TestStatic {
	public static void main(String[] args) {
		A.test(); // class A loads first & then accesses the test()
		System.out.println(A.x); // class A will not be loaded as its already loaded and accesses x
		A a1 = new A(); // class A will not be loaded as its already loaded
		System.out.println(a1.y);
		A a2 = new A(); // class A will not be loaded
		System.out.println(a2.y);
	}
}
/*
 * static variables gets memory before any object is created
 * non-static variables gets memory when object is created
 */
