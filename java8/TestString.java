package com.demo.java8;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String details = "Hello \"world\"!";
		
		String str= details.replaceAll("\'", "\\\\'");
		System.out.println("==================>"+str);
	}

}
