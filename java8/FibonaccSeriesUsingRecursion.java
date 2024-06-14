package com.demo.java8;

public class FibonaccSeriesUsingRecursion {

	
	public static Integer fibanacc(int num) {
		
		if(num<=1) {
			return num;
		}
		return fibanacc(num-1)+fibanacc(num-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =10;
		
		for(int i=0; i<=number;i++) {
			System.out.println("fibonacc series is ==>"+fibanacc(i));
		}

	}

}
