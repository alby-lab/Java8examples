package com.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {10,15,8,49,25,98,98,32,15};
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 myList.stream().collect(Collectors.toSet()).forEach(System.out::println); 
		 List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
	  
	}
}
