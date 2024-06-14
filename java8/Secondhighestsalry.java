package com.demo.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Secondhighestsalry {
	public static void main(String[] args) {
		 List<Employee> empList = new ArrayList<>();
	        empList.add(new Employee("Nataraja G", "Accounts", 8000));
	        empList.add(new Employee("Nagesh Y", "Admin", 15000));
	        empList.add(new Employee("Vasu V", "Security", 2500));
	        empList.add(new Employee("Amar", "Entertinment", 12500));// TODO Auto-generated method stub
	        Map.Entry<Integer, List<String>> getNthHighestSalary =   empList.stream()
            .collect(Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())
            ))
            .entrySet()
            .stream()
            .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
            .collect(Collectors.toList())
            .get(3 - 1);
	        System.out.println(getNthHighestSalary);
	        
	        Optional<Employee> emp = empList.stream()
	                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
	        System.out.println(emp.get());
	        
	}
}
