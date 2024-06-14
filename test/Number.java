package com.demo.test;

public class Number {
	
	Integer count;
	
	public void increment() {
		count++;
	}

	public static void main(String[] args) {
		
		Number nymberObj=new Number();
		nymberObj.increment();
		System.out.println(nymberObj.count);
	}

}
