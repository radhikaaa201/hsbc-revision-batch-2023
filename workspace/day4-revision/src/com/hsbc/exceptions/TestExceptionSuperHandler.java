package com.hsbc.exceptions;

import java.sql.SQLException;

public class TestExceptionSuperHandler {
	public static void main(String[] args) {
		try {
			String result = greet(0);
			System.out.println("Result = "+result);
		} catch(RuntimeException e) {
			System.out.println("RTE");
		} catch(Exception e) {
			System.out.println("E");
		} 
	}
	public static String greet(int id) throws SQLException {
		if(id == 0) {
			throw new SQLException();
		}
		return "HELLO";
	}
}
/*
 * Output1: RTE
 * Output2: Result=Hello, E
 * Output3:  Result=Hello, RTE
 * Output4: Compilation error
 * Output5: E
 */

