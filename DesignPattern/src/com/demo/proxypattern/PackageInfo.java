package com.demo.proxypattern;

public class PackageInfo {
	
	private String size;
	private Integer weight;
	public PackageInfo(String size, Integer weight) {
		super();
		this.size = size;
		this.weight = weight;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	

}
