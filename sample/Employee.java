package com.demo.sample;

public class Employee {
	
	
	private int EmpId;
	private String EmpName;
	private int salary; 
	private int deptId;
	private String location;
	
	Employee(int EmpId,
	 String EmpName,
	 int salary, 
	 int deptId,
	 String location){
		
		this.EmpId =EmpId;
		this.EmpName=EmpName;
		this.salary=salary;
		this.deptId=deptId;
		this.location=location;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
     
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", salary=" + salary + ", deptId=" + deptId
				+ ", location=" + location + "]";
	}

	
	
	

}
