package com.demo.sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraywithAddition {

	public static void main(String args[]){
		
		
		//employeeList.stream().filter(epm->emp.getGeneder="Female" ).colletors.tolist().filter(emp->)
		
		//employeeList.stream().collect(collectitrs.groupingBy(Emplyeee:getGender).colletors.tolist().sorted (
		//		Comparator.comparingDouble(employee::saalry).reversed()).skip(1).findFirst());
		
	     
	      int[] myArray = {0,1,2,3,4,5,6,7,8,9};
	      int reqSum=7;
	      System.out.println("The array created is: "+Arrays.toString(myArray));
	      System.out.println("sub arrays whose sum is: "+reqSum);
	      for(int i=0; i<myArray.length; i++){
	         int sum = 0;
	         for (int j=i; j<myArray.length; j++){
	            sum = sum + myArray[j];
	            if(sum == reqSum){
	               System.out.println(Arrays.toString(Arrays.copyOfRange(myArray, i, j+1)));
	            }
	         }
	      }
	   }

}
