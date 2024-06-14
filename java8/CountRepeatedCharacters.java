package com.demo.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountRepeatedCharacters {

	public static void main(String[] args) {
		 // given input string
        String input = "welcomeme";

        // convert string into stream
Arrays.stream(input.split("")).
        		collect(Collectors.groupingBy(str->str,LinkedHashMap::new,Collectors.counting()))
        		.entrySet().stream().filter(entry-> entry.getValue() == 1).forEach(System.out::println);	
}               
}