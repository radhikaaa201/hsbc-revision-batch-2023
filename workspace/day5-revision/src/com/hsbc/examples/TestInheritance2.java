package com.hsbc.examples;

class Person {
	private int id;
	private String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void printDetails() {
		System.out.println("id = "+id+", name = "+name);
	}
}
//class Employee extends Person { // line 1
//	private double salary;
//	public void printDetails() {
//		super.printDetails();
//		System.out.println("salary = "+salary);
//	}
//}
public class TestInheritance2 {

}
