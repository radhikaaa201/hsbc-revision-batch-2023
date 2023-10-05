package com.hsbc;

interface Calculator { 
	int operation(int x, int y);
}

public class TestFunctionalProgramming {
	public static void main(String[] args) {
		
		Calculator calculator = (x, y) -> { 
			return x - y;
		};
		performCalculation(calculator);
		// lambda expression can be written in one line without { } 
		Calculator calculator2 = (x, y) -> x * y;
		performCalculation(calculator2);
		// passing lambda expression as a parameter - function as a parameter
		performCalculation((x, y) -> x / y);
	}
	public static void performCalculation(Calculator calci) {
		int result = calci.operation(20, 10);
		System.out.println("Result = "+result);
	}
}
