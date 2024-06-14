package com.demo.sample;

public class BinarySearch {
	
	public static int binarySearchIterative(int[] arr, int first, int last, int key)

	{

	     while(first <= last)

	     {

	         int middle = first + (last - first) / 2;
	         System.out.println("Tmiddle"+middle);
	            if(arr[middle] ==  key)

	         {

	             return middle;

	         }

	         else if(arr[middle] < key)

	         {

	             first = middle + 1;
	             System.out.println("first"+first);

	         }

	         else

	         {

	             last  = middle - 1;
	             System.out.println("last"+last);

	         }

	        

	     }

	     return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 14, 19, 26, 27, 31, 33, 35, 42, 44};

	     int element = 31;

	     int result = binarySearchIterative(arr, 0, arr.length - 1, element);

	     if(result == -1)

	     {

	            System.out.println("The element does not exist in the list");

	     }

	     else

	     {

	            System.out.println("The element found at index : " + result);

	     }

	}

}
