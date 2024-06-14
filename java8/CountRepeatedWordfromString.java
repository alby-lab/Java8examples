package com.demo.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountRepeatedWordfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>words=Arrays.asList("AA", "BB", "AA", "CC");
		Map<String,Long>countMap=words.stream().filter(s->Collections.frequency(words, s)>1)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(countMap);
	}

}
