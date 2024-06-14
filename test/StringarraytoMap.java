package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringarraytoMap {

	public static void main(String args[]) {

		List<String> fruitsList = new ArrayList<>();
		fruitsList.add("Apple");
		fruitsList.add("Orange");
		fruitsList.add("Pappaya");
		Map<Object, Object> result = fruitsList.stream().collect(Collectors.toMap(s -> s.length(), m -> m));

		System.out.println(result.get(7));
		System.out.println(result);

	}

}
