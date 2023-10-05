package com.hsbc.examples;

public class TestOperators {
	public static void main(String[] args) {
		int a = 5;
		incr(a++); // incr(int a = a++)
		System.out.println("Main = "+a);
	}
	public static void incr(int a) {
		//a++;
		System.out.println("Incr = "+a);
		int b = 20;
		System.out.println("b = "+(b++));
		int c = b++; // c = 20
		System.out.println("c = "+c+", b = "+b);
	}
}
/* Output1: Main = 6, Incr = 6
 * Output2: Main = 6, Incr = 5
 * Output3: Main = 6, Incr = 7
 * Output4: Main = 6, Incr = 8
 */
