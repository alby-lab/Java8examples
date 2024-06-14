package com.demo.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BiggestSecondNumberfromArray {
	
	public static void main(String args[]) {
		int arr[] = {3,15,29,18,73,64,80};
		int secondNumber=Arrays.stream(arr).sorted().skip(arr.length-2).findFirst().getAsInt();
		System.out.println(secondNumber);
	}

}
