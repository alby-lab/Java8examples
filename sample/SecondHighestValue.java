package com.demo.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SecondHighestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,8,10,20,50,30,45};
		int secondHihestNumber=Arrays.stream(arr).sorted().skip(arr.length-2).findFirst().getAsInt();
		ArrayList<Integer>list=(ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
		int leastNumber=list.stream().sorted(Collections.reverseOrder()).skip(list.size()-2).findFirst().get();
		System.out.println("second hoghst number is =>"+secondHihestNumber);
		System.out.println("second hoghst number is =>"+leastNumber);
	}

}
