package com.demo.java8;

public class PowerThreadOne extends Thread{
	Power sample;
	PowerThreadOne(Power sample){
		this.sample=sample;
	}
	
 public void run() {
	 try {
		sample.printPower(8);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
