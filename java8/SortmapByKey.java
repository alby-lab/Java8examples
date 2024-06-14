package com.demo.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortmapByKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // This map stores unsorted values
	    Map<String, Integer> unsortedmap = new HashMap<>();
	 // putting values in the Map
	    unsortedmap.put("Jayant", 80);
	    unsortedmap.put("Abhishek", 90);
	    unsortedmap.put("Anushka", 80);
	    unsortedmap.put("Amit", 75);
	    unsortedmap.put("Danish", 40);
	     
	    Map<String, Integer> sorted = unsortedmap .entrySet() .stream() 
	    		.sorted(Map.Entry.comparingByKey())
	    		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new)); 
	    System.out.println("Key = " + sorted);
	    
	}
	

	
}
