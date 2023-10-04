package com.hsbc.exceptions;

import java.util.Scanner;

public class TestException1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] items = {4, 1, 9};
		try {
			System.out.println("try block - enter value for a: ");
			int a = scan.nextInt(); // a = 4
			int result = 10/a; // result = 2
			System.out.println(items[a]); // a = 0, 1, 2, items[4] // AIOBE
			System.out.println("try block division statement result = "+result); // 5
		} 
		catch(ArithmeticException e) {
			System.out.println("ATE");
		} 
		catch(RuntimeException e) {
			System.out.println("RTE");
		} 
		finally {
			System.out.println("finally block");  // normal & abnormal termination
		}
		System.out.println("The last line."); // normal termination
	}
}
/*  Output1: try block, finally block, The last line
 *  Output2: try block, finally block
 *  Output3: try block, finally block, Exception occurs in the code
 *  Output4: try block, E, finally block, The last line
 */
