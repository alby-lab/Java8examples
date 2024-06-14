package com.demo.java8;

public class ReverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="KANYAKUMARI";
		String reverseStr="";
		for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);
			
			reverseStr=ch+reverseStr;
		}
     System.out.println("Reverse String is ====>"+reverseStr);
	}

}
