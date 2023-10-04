package com.hsbc.basics;

class A { 
	protected void demo() { 
		System.out.println("demo in A");
	}
	static void test() {
		System.out.println("test in A");
	}
}
class B extends A { 
	public void demo() { 
		System.out.println("demo in B");
	}
	static void test() {
			System.out.println("test in B");
	}
}

public class TestBasic3 {
	public static void main(String[] args) { 
		A a = new B();
		a.demo(); // demo in B
		a.test(); // a to its class name i.e., A.test()
	}
}
/* Output1: test in A, test in B
 * Output2: test in B
 * Output3: test in A
 * Output4: None of the above
 * 
 */
