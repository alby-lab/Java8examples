package com.demo.sample;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,15,29,18,73,64};
		int secondNumber=Arrays.stream(arr).sorted().skip(arr.length-2).findFirst().getAsInt();
		System.out.println(secondNumber);
		

	}

}

