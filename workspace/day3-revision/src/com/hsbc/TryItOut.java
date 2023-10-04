package com.hsbc;

class Outer {
	class InnerOne {
		void m1() {
			System.out.println("m1() inside InnerOne");
		}
	}
	static class InnerTwo {
		void m2() {
			System.out.println("m2() inside static class InnerTwo");
		}
	}
}

public class TryItOut {
	public static void main(String[] args) {
		// create object of InnerOne & InnerTwo to call m1() & m2
		Outer.InnerOne innerOne = new Outer().new InnerOne();
		innerOne.m1();
		Outer.InnerTwo innerTwo = new Outer.InnerTwo();
		innerTwo.m2();
	}
}
