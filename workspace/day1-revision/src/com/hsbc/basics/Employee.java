package com.hsbc.basics;

public class Employee extends User {
	private int id;
	private double salary;
	public Employee(int id, String name, String gender, int age, long phone, double salary) {
		super(name, gender, age, phone);
		this.id = id;
		this.salary = salary;
	}
	
	@Override
	public String getDetails() {
		//String details = "Id = "+id+", "+super.getDetails()+", Salary = "+salary;
		String details2 = "Name = "+getName()+", Id = "+id+", Salary = "+salary+", Phone = "+getPhone();
		return details2;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
