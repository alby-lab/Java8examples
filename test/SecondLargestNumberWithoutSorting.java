package com.demo.test;

public class SecondLargestNumberWithoutSorting {
	
	public static int second(int[] arr) {
		  int largest = arr[0];
		    int secondLargest = 0;
		    for (int i = 1; i < arr.length; i++) {
		        if (arr[i] > largest) {
		            secondLargest = largest;
		            largest = arr[i];
		        } else if (arr[i] > secondLargest) {
		            secondLargest = arr[i];
		        }
		    }
		    return secondLargest;
	}

	public static void main(String[] args) {
		int[] arr = {17,1, 3, 2, 5, 3,10,15};
		int result = second(arr);
	    System.out.println(result);

	}

}
