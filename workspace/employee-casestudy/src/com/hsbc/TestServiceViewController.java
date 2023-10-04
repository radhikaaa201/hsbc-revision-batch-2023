package com.hsbc;

import java.util.Scanner;


import com.hsbc.dao.EmployeeDao;
import com.hsbc.util.EmployeeDaoFactory;

public class TestServiceViewController {
	public static void main(String[] args) {
		// this must be treated as service layer
		// service needs dao object
		Scanner scan = new Scanner(System.in);
		System.out.println("Type of storage 1: array 2: list 3: set 4: database");
		String name = scan.next();
		EmployeeDao dao = EmployeeDaoFactory.getInstance(name);
		
		// below code must be in a separate class that acts like view layer
		// now you can call dao.save(), dao.findAll(), dao.findById through the menu
		// you can create menu as 1: Store 2: Find All 3: Find By Id -1: Exit
	}
}
