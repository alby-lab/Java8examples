package com.demo.java8;

import java.util.Objects;

public class Company {
	
	Company(int companyId, String companyName){
		this .companyId=companyId;
		this.companyName=companyName;
		
	}
	private int companyId;
	private String companyName;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(companyId, companyName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return companyId == other.companyId && Objects.equals(companyName, other.companyName);
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + "]";
	}

	
}
