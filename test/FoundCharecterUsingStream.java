package com.demo.test;

import java.util.Arrays;
import java.util.Optional;

public class FoundCharecterUsingStream {
	
	public static void main(String args[] ) {
		
		String input="hellow WoIrld";
		boolean retValue1=Arrays.stream(input.split("")).anyMatch(str->str.equalsIgnoreCase("I"));
		System.out.println("===========>"+retValue1);
		
	}

}
