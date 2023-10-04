package com.hsbc.exceptions;

import java.sql.SQLException;

public class TestExceptionMultiCatch {
	public static void main(String[] args) {
		try {
			String result = greet(0);
			System.out.println("Result = "+result);
		} catch(RuntimeException | SQLException e) {
			System.out.println("RTE or SQLE");
		} 
	}
	public static String greet(int id) throws SQLException {
		if(id == 0) {
			try {
				throw new SQLException();
			} catch(SQLException e) {
				System.out.println("SQLE");
			}
		}
		return "HELLO";
	}
}
/*
 * Output1: RTE or SQLE
 * Output2: Result=Hello, RTE or SQLE
 * Output3: Compilation error
 * Output4: SQLE, Result=Hello, RTE or SQLE
 * Output5: SQLE, Result=Hello
 */

