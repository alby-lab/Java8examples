package com.demo.java8;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>numbers=Arrays.asList(10,15,8,49,25,98,32);
		numbers.stream().map(s -> s + "")// Convert integer to String
		.filter(s->s.startsWith("1"))
		.forEach(System.out::println);
		
	}

}
