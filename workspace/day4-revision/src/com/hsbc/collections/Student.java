package com.hsbc.collections;

import java.time.LocalDate;
import java.util.Objects;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	private LocalDate dob;
	public Student(int rollNo, String name, LocalDate dob) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dob=" + dob + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public int compareTo(Student o) {
		return rollNo - o.getRollNo(); // +ve or 0 or -ve
		//return name.compareTo(o.getName()); // sorting based on name
	}
	
}
