package com.hsbc.basics;

public class TestInheritance2 {
	public static void main(String[] args) {
		Employee employee1 = new Employee(100, "Rajesh", "Male", 30, 9902939329L, 52000.0);
		Employee employee2 = new Employee(200, "Vijay", "Male", 32, 98823829L, 62000.0);
		
		System.out.println(employee1.getDetails());
		System.out.println(employee2.getDetails());
		
		
	}
}
