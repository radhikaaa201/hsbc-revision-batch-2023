package com.hsbc.exceptions;

import java.sql.SQLException;

public class TestException3 {

	public static void main(String[] args) {
		try {
			search(0);
		} catch (SQLException e) {
			System.out.println("SQLE");
		}
		// calling search2
		search2(0); // program terminates abnormally if NPE occurs
		System.out.println("the last line");
	}
	
	public static void search(int id) throws SQLException {
		if(id == 0) {
			throw new SQLException();
		}
		System.out.println("---- search user ----");
	}
	public static void search2(int id) throws NullPointerException {
		if(id == 0) {
			throw new NullPointerException();
		}
		System.out.println("---- search2----");
	}
}
/*
 * Output1: search user, the last line
 * Output2: search user, SQLE, the last line
 * Output3: compilation error
 * Output4: SQLE, the last line
 * Output5: compilation error
 * Output5: SQLE, Nullpointer exception
 */

