package com.hsbc.basics;

class A { 
	A() {
		super(); // it is optional, calls the Object()
		System.out.println("A() constructor");
	}
	A(int x) {
		super(); // it is optional, calls the Object()
		System.out.println("A(int) constructor");
	}
}
class B extends A { 
	B() {
		super(); // it is optional because compiler anyways adds this if you don't
		System.out.println("B() constructor");
	}
	B(int x) {
		super(x);
		System.out.println("B(int) constructor");
	}
	B(int x, int y) {
		super(x);
		System.out.println("B(int, int) constructor");
	}
}
public class TestInheritanceDemo {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println("_______________________");
		B b1 = new B();
		System.out.println("________________________");
		B b2 = new B(30);
		System.out.println("________________________");
		B b3 = new B(30, 50);
	}
}
