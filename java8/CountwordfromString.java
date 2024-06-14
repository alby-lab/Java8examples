package com.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountwordfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<String>word=Arrays.asList("AA", "BB", "AA", "CC");
    Map<String, Long>wordCount=word.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    System.out.println(wordCount);
	}

	

}
