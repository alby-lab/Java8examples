package com.demo.java8;

import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int vowels = 0;
		 int consonants = 0;
		String input = "Welcome";
		for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
                
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
           
        }
		System.out.println("vowels ===>"+vowels);  
		
}
}