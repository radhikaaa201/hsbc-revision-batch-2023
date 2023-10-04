package com.hsbc.basics;

public class TestRuntimePoly {
	public static void main(String[] args) {
		User user = new User("User1", "Male", 20, 939293L);
		Employee employee = new Employee(100, "Employee1", "Female", 40, 99944493L, 45000);
		Student student = new Student(888, "Student1", "Male", 18, 88899988L, "A");
		
		testPolymorphism(user);
		testPolymorphism(employee);
		testPolymorphism(student);
	}
	
	// you can pass User, Employee and Student object to the below method
	public static void testPolymorphism(User user) {
		System.out.println(user.getDetails()); // user.getDetails() is polymorphic
	}
}
