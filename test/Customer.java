package com.demo.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Customer {
	int Id;
	private String name;
	private String lastName;
	private int age;
	
	

	public Customer(int id, String name, int age, String lastName) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.lastName=lastName;
	}



	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public static void main(String[] args) {
	List<Customer>customerList=new ArrayList<Customer>();
    customerList.add(new Customer(1, "Alby", 30,"David"));
    customerList.add(new Customer(2, "Jishma", 20,"Paul"));
    customerList.add(new Customer(4, "Beno", 28,"Bennet"));
    customerList.add(new Customer(3, "Anuja", 18,"Aravind"));
    customerList.add(new Customer(5, "Boby", 38,"Seeba"));
    customerList.add(new Customer(6, "Baby", 38,"Bennet"));
    customerList.add(new Customer(6, "Boby", 38,"Bennet"));
    customerList.add(new Customer(4, "Beno", 28,"Seeba"));
   List<String>stringList= customerList.stream().filter(emp->emp.getAge() >21).map(emp->emp.getName().toUpperCase()).collect(Collectors.toList());
  
   List<String>stringList1= customerList.stream().map(cu->cu.getName()+" "+ cu.getLastName()).collect(Collectors.toList());
   Set<String>set=new HashSet<>();
   customerList.stream().filter(cust->(set.add(cust.getName()))).forEach(System.out::println);
   //System.out.println("============>"+stringList2);
   }

}
