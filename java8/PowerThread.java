package com.demo.java8;

public class PowerThread extends Thread{
	
	Power sample;
	PowerThread(Power sample){
		
		this.sample=sample;
				
	}
	public void run(){  
		try {
			sample.printPower(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		}  
}
