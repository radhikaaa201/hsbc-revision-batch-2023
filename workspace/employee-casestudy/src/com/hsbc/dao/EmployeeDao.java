package com.hsbc.dao;

import com.hsbc.beans.Employee;

public interface EmployeeDao {
	public int save(Employee employee);
	public Employee[] findAll();
	public Employee findById(int id);
}
