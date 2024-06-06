package com.demo.adaptorpattern;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindfirstDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="google";
    Character result =str.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char) s)))
    		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
    		.entrySet().stream().filter(entry->entry.getValue()==1L).map(entry->entry.getKey()).findFirst().get();
    System.out.println(result);	
 
   	
   
	}

}
