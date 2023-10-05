package com.hsbc;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestSorting {
	public static void main(String[] args) {
		
		Comparator<Employee> comp1 = (a, b) -> b.getName().compareTo(a.getName());
		Comparator<Employee> comp2 = (a, b) -> a.getName().compareTo(b.getName());
		Comparator<Employee> comp3 = (a, b) -> a.getDoj().compareTo(b.getDoj());
		
		
		Set<Employee> set1 = new TreeSet<>(comp3); // uses Comparable to sort if no parameter
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter doj in yyyy-MM-dd format");
		String doj = scan.next();
		set1.add(new Employee(1, "Raj", LocalDate.of(2023, 5, 30)));
		set1.add(new Employee(3, "Vijay", LocalDate.parse(doj)));
		set1.add(new Employee(2, "Ajith", LocalDate.parse("2021-09-20")));
		set1.add(new Employee(4, "Roopa", LocalDate.parse("2020-05-15")));
		
		for(Employee e : set1) {
			System.out.println(e); // name = Ajith, Raj, Roopa, Vijay
		}
	}
}
