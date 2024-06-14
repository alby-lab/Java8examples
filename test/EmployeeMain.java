package com.demo.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	List<Employee>employeeList=new ArrayList<Employee>();
    	
    	employeeList.add(new Employee(1, "Anoop", new Date(2000, 10, 21), "Male", 8000));
    	employeeList.add(new Employee(2, "Sneha", new Date(2011, 10, 11), "Female", 20000));
    	employeeList.add(new Employee(3, "Digina",  new Date(2015, 10, 21), "Female", 12000));
    	employeeList.add(new Employee(4, "Benny",  new Date(2020, 10, 21), "Male", 30000));
    	employeeList.add(new Employee(5, "Praveen",  new Date(2012, 10, 21), "Male", 25000));
    	employeeList.add(new Employee(6, "Neethu",  new Date(2011, 05, 21), "Female", 18000));
    	employeeList.add(new Employee(7, "Sreedevi",  new Date(2013, 10, 13), "Female", 45000));
    	employeeList.add(new Employee(8, "Abhi",  new Date(2011, 10, 21), "Male", 6000));
    	employeeList.add(new Employee(9, "Angappan",  new Date(2016, 10, 21), "Male",23000));
    	employeeList.add(new Employee(10, "Jishma",  new Date(2011, 11, 21), "Female", 2000));
    	employeeList.add(new Employee(11, "Jino",  new Date(2014, 10, 21), "Male", 17000));
    	employeeList.add(new Employee(12, "Karthi",  new Date(2018, 12, 13), "Male", 13000));
    	employeeList.add(new Employee(13, "Sujithra",  new Date(2011, 03, 21), "Female", 8000));
    	employeeList.add(new Employee(14, "Robin",  new Date(2011, 10, 21), "Male", 7000));
    	employeeList.add(new Employee(15, "Seeba",  new Date(2010, 10, 16), "Female",10000));
    	employeeList.add(new Employee(16, "Beno",  new Date(2022, 10, 10), "Male", 9000));
    	employeeList.add(new Employee(17, "Poppy",  new Date(2013, 10, 07), "Male", 45000));
    	employeeList.add(new Employee(18, "Dhaya",  new Date(2011, 12, 30), "Female", 50000));
    	employeeList.add(new Employee(19, "Prarthana",  new Date(2019, 06, 28), "Female", 70000));
    	employeeList.add(new Employee(20, "Swatha",  new Date(2011, 02, 23), "Female", 4500));
    	employeeList.add(new Employee(21, "Sajeesh",  new Date(2023, 10, 25), "Male", 4000));
    	employeeList.add(new Employee(22, "Rajeesh",  new Date(2024, 11, 20), "Male", 13500));
    	employeeList.add(new Employee(23, "Bethov",  new Date(2016, 10, 20), "Male", 72000));
    	employeeList.add(new Employee(24, "Rahul",  new Date(2017, 01, 17), "Male",80000));
    	employeeList.add(new Employee(25, "Nimmy",  new Date(2011, 02, 19), "Female",74500));
    	    	
    	//employeeList.stream().filter(emp -> emp.getGender().equals("Female") && emp.getJoiningDate().getYear()==2011).
    	//collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary));
    	Map<String, Optional<Employee>> map = employeeList.stream().filter(emp -> emp.getGender().equals("Female") && emp.getJoiningDate().getYear()==2011).collect(Collectors.groupingBy(Employee::getGender, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
    	map.entrySet().forEach(System.out::println);
    	Optional<Employee> second =employeeList.stream().filter(emp -> emp.getGender().equals("Female") && emp.getJoiningDate().getYear()==2011).sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
    	System.out.println("======>"+second.get());
    	//Map<Integer, Optional<Employee>> map = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
    	//Collectors.groupingBy(Employee::getDeptId, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))
    			//filtering(new GregorianCalendar(
        		//Employee::getJoiningDate).get(Calendar.YEAR)==2011)).collect(Collectors.toList());
    	
	}

}
