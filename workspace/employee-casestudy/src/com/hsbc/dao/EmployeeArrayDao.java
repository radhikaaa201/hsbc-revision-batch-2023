package com.hsbc.dao;

import com.hsbc.beans.Employee;

public class EmployeeArrayDao implements EmployeeDao {
	private static Employee[] employees = new Employee[5];
	private static int index = 0;

	@Override
	public int save(Employee employee) {
		// you can't add employee if the array is full
		if(index == employees.length) {
			return -1;
		}
		employees[index++] = employee;
		return 1;
	}

	@Override
	public Employee[] findAll() {
		// copy employees array to another array so that you can return only the array having elements
		// instead of array having null's
		Employee[] array = new Employee[index];
		for(int i = 0; i < index; i++) {
			array[i] = employees[i];
		}
		return array;
	}

	@Override
	public Employee findById(int id) {
		Employee[] array = findAll();
		for(Employee e : array) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
	}
}
