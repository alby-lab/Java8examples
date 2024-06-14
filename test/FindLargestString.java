package com.demo.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLargestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {
                "Bond",
                "Einstein",
                "Alice",
                "Whitman",
                "Bob",
                "Spider"
		};
		
		String maxString=Arrays.stream(names).max(Comparator.comparingInt(String::length)).get();
		System.out.println(maxString);
	}

}
