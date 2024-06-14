package com.demo.test;

public class containsOnlySubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String validStringTwo = "cabcb";
		
System.out.println("=================>"+containsOnlySubstrings(validStringTwo));
	}
	
	public static boolean containsOnlySubstrings(String string) {

	    if (string.length() < 2) {
	        return false;
	    }

	    StringBuilder substr = new StringBuilder();
	    for (int i = 0; i < string.length() / 2; i++) {
	        substr.append(string.charAt(i));
	        System.out.println("before===========substr.toString()=====>"+substr.toString());
	        String clearedFromSubstrings 
	          = string.replaceAll(substr.toString(), "");
	        System.out.println("===========clearedFromSubstrings=====>"+clearedFromSubstrings);
	        System.out.println("After===========substr.toString()=====>"+substr.toString());

	        if (clearedFromSubstrings.length() == 0) {
	            return true;
	        }
	    }

	    return false;
	}

}
