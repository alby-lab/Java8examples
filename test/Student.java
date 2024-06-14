package com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {
	
	private int Id;
	private String name;
	private int age ;
	
	private static int value=0;
	
	

	public static int getValue() {
		return value;
	}

	public static void setValue(int value) {
		Student.value = value;
	}

	public Student(int id, String name, int age) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
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



	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", age=" + age + "]";
	}



	/*
	 * @Override public int hashCode() { return Objects.hash(Id, age, name); }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Student other = (Student) obj; return Id == other.Id ; }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student stnt=new Student(1, "Alby", 10);
      Student stnt1=new Student(2, "Radha", 120);
      Student stnt2=new Student(1, "Alby", 10);
      stnt.setValue(10);
      System.out.println(stnt.getValue());
      Map<Student,Integer>stdntMap=new HashMap<Student,Integer>();
      stdntMap.put(stnt, 1);
      stdntMap.put(stnt1, 2);
     //stdntMap.put(stnt2,3);
      System.out.println(stdntMap.get(stnt2));
	}

}
