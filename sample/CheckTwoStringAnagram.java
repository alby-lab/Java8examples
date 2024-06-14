package com.demo.sample;

import java.util.Arrays;

public class CheckTwoStringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Hello";
		String str2="ohell" ;
		String str3 = "Hello" ;
		String str4 ="oHell"; 
		boolean status=false;
		if(str3.length()!=str4.length()) {
			status= false ;
		}
		else {
		char ch[]=str3.toCharArray();
		char ch1[]=str4.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		status =Arrays.equals(ch, ch1);
		if(status) {
			
			System.out.println("==============Angram");
		}else {
			
			System.out.println("==============not angram");	
		}

	}

}
}