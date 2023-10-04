package com.hsbc.collections;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet2 {
	public static void main(String[] args) {
		Set<Student> set1 = new TreeSet<>();
		set1.add(new Student(111, "Alka", LocalDate.parse("2000-10-16")));
		set1.add(new Student(111, "Radika", LocalDate.parse("2000-10-16")));
		set1.add(new Student(151, "Anu", LocalDate.parse("2000-10-16")));
		set1.add(new Student(122, "Akilesh", LocalDate.parse("2000-10-16")));
		set1.add(new Student(131, "Manshi", LocalDate.parse("2000-10-16")));
		set1.add(new Student(141, "Karthik", LocalDate.parse("2000-10-16")));
		System.out.println("Size: "+set1.size());
		
		for(Student s : set1) {
			System.out.println(s);
		}
		
	}
}
