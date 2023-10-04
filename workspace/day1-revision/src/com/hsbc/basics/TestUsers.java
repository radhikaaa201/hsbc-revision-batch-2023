package com.hsbc.basics;

public class TestUsers {
	public static void main(String[] args) {
		User userOne = new User("Ajay", "Male", 42, 988293993L); 
		System.out.println("--------------------");
		User userTwo = new User("Charles", "Male", 43); 

		System.out.println(userOne.getDetails());
		System.out.println(userTwo.getDetails());
		
	}
}
