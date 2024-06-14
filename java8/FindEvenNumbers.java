package com.demo.java8;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEvenNumbers {

	public static void main(String[] args) {
		int arr[]= {10, 15, 8, 49, 25, 98, 32};
		List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
		Arrays.stream(arr).filter(i -> i % 2 == 0).forEach(System.out::println);
		Map<Boolean, List<Integer>>list=numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println("====>"+list);
	}

}
