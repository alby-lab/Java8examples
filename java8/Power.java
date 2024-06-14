package com.demo.java8;

public class Power{
	
	
	public synchronized void printPower(int number) throws InterruptedException {
		   int temp = 1;
		   for(int i=1;i<=number;i++){ 
		        System.out.println(Thread.currentThread().getName() + ":- " +number + "^"+ i + " value: " + number*temp);
		     temp = number*temp;
		     try{  
		      Thread.sleep(500);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		 }  
		
	}
	
