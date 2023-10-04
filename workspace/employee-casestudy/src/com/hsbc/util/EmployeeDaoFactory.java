package com.hsbc.util;

import com.hsbc.dao.EmployeeArrayDao;
import com.hsbc.dao.EmployeeDao;

public class EmployeeDaoFactory {
	private static EmployeeDao employeeDao = null;
	private static int counterForArrayDao = 0;
	
	public static EmployeeDao getInstance(String name) {
		switch(name) {
		case "array": 
			if(counterForArrayDao == 0) {
				employeeDao = new EmployeeArrayDao();
				counterForArrayDao++;
			}
			return employeeDao;
		}
		throw new RuntimeException("Invalid object name to create!");
	}
}
