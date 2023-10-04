package com.hsbc.basics;

public class Student extends User {
	private int rollNo;
	private String grade;
	public Student(int rollNo, String name, String gender, int age, long phone, String grade) {
		super(name, gender, age, phone);
		this.rollNo = rollNo;
		this.grade = grade;
	}
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "RollNo = "+rollNo+", Name = "+getName()+", Grade = "+grade+", Phone = "+getPhone();
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
