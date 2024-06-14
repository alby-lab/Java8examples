package com.demo.test;

import java.util.Date;

public class Employee {
	
	private int empId;
	private  String empName;
	private Date joiningDate;
	private String gender;  
    private int salary;
    
	public Employee(int empId, String empName, Date joiningDate, String gender, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.joiningDate = joiningDate;
		this.gender = gender;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", joiningDate=" + joiningDate + ", gender="
				+ gender + ", salary=" + salary + "]";
	}
	
	
}
