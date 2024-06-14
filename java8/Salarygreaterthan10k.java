package com.demo.java8;

import java.util.ArrayList;
import java.util.List;

public class Salarygreaterthan10k {

	public static void main(String[] args) {
		 List<Employee> empList = new ArrayList<>();
	        empList.add(new Employee("Nataraja G", "Accounts", 8000));
	        empList.add(new Employee("Nagesh Y", "Admin", 15000));
	        empList.add(new Employee("Vasu V", "Security", 2500));
	        empList.add(new Employee("Amar", "Entertinment", 12500));// TODO Auto-generated method stub
	        // find employees whose salaries are above 10000
	        empList.stream().filter(emp->emp.getSalary() > 10000).forEach(System.out::println);
	}

}
