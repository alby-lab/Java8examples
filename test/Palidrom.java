package com.demo.test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Palidrom {

	public static void main(String[] args) {
		
		
		String str="Malayalam";// TODO Auto-generated method stub
        String refrse="";
       	for(int i =0;i<str.length();i++) {
			char ch=str.charAt(i);
			refrse=refrse+ch;
			
		}
		if(str.equalsIgnoreCase(refrse)) {
			System.out.println("the given string is palindrom");
		}else {
			
			System.out.println("Not palindrom");
		}
	}
	

}
