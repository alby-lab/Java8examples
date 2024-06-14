package com.demo.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MoveallZerotoEndofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Declare and initialize the array elements
	      int array[] = {128, 0, 99, 67, 50, 0, 29, 7, 0};
	      List<Integer>list=Arrays.stream(array).boxed().collect(Collectors.toList());
	      list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	      //getting length of an array
	      int n = array.length;
	      
	      //calling user defined function
	      func(array, n);
    
	}
	//user defined method
	   public static void func(int array[], int n) {
	   
	      //sorting the array elements
	      Arrays.sort(array);
	      System.out.println("Elements of array after moving all the zeros to the end of array: ");
	      
	      //prints array using the for loop
	      for (int i = n-1; i >= 0; i--) {
	         System.out.print(array[i] + " ");
	      }
	   }
}
