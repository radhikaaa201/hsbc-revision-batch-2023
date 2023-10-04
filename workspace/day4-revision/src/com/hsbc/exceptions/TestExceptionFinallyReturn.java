package com.hsbc.exceptions;


public class TestExceptionFinallyReturn {
	public static void main(String[] args) {
		String s = greet(0);
		System.out.println(s);
	}
	public static String greet(int id) {
		try {
			if(id == 0) {
				throw new NullPointerException();
			}
			return "Hello";
		}
		catch (NullPointerException e) {
			return "Welcome";
		} finally {
			return "Thankyou";
		}
		//System.out.println("the last line");
		//return "Done";
	}
}
/*
 * Output1: Hello
 * Output2: Welcome
 * Output3: Thankyou
 * Output4: Compilation error
 * Output5: Exception
 */

