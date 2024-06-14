package com.demo.test;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateelementfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,3,2,1,0,10,3,10};
		for(int i=0;i<=arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
			}
			
		}
		Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()>1).forEach(System.out::println);
		
	}

}
