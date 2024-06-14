package com.demo.java8;

public class Synchronization_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power obj = new Power();//only one object  
		PowerThread p1=new PowerThread(obj);  
		PowerThreadOne p2=new PowerThreadOne(obj);  
		p1.start();  
		p2.start();
	}

}
