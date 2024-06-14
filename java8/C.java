package com.demo.java8;

public class C implements B, A{ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           C c=new C();
           c.printName();
	}



	@Override
	public void printName() {
		// TODO Auto-generated method stub
		A.super.printName();
		//B.super.printName();
	}

	

}
