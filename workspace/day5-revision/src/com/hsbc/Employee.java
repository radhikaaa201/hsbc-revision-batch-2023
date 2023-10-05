package com.hsbc;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private LocalDate doj;
	// generate 2 constructors, getters, setters, 
	// toString, equals, hashCode, also implement Comparable - sort by id
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, LocalDate doj) {
		super();
		this.id = id;
		this.name = name;
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", doj=" + doj + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public int compareTo(Employee o) {
		return id - o.getId();
	}
}
