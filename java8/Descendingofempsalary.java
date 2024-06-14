package com.demo.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Descendingofempsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Employee> empList = new ArrayList<>();
	        empList.add(new Employee("Nataraja G", "Accounts", 8000));
	        empList.add(new Employee("Nagesh Y", "Admin", 15000));
	        empList.add(new Employee("Vasu V", "Security", 2500));
	        empList.add(new Employee("Amar", "Entertinment", 12500));
	        //decending order
	        empList.stream().sorted().forEach(System.out::println);
	        empList.stream().filter(emp->emp.getSalary()>2500).collect(Collectors.toList());
	        System.out.print("====================================================="+System.lineSeparator());
	        empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
	}

}
