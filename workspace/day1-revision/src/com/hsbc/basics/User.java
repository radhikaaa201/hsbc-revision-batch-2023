package com.hsbc.basics;

public class User {
	// make variables private and generate setters & getters
	private String name;
	private String gender;
	private int age;
	private long phone;
	
	public User(String name, String gender, int age, long phone) {
		this(name, gender, age);
		this.phone = phone;
		System.out.println("User(4 arguments)");
	}
	
	public User(String name, String gender, int age) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("User(3 arguments)");
	}
	// create another constructor that takes 3 parameters i.e., name, gender & age
	// from the main method create object on 3 parameter constructor & call the getDetails
	
	public String getDetails() {
		return "Name = "+name+", Gender = "+gender+", Age = "+age+", Phone = "+phone;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
}
/*
	Create a separate class named TestUser and create main method in it
	In main create 2 objects of User by providing values to all the properties
	then call getDetails() in System.out.println from both the objects and observe the output
*/