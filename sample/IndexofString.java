package com.demo.sample;

public class IndexofString {

	public static void main(String[] args) {
		// TODO Auto-generated me;thod stub
		String str="I love you";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			System.out.println("=======>"+ch+":"+str.indexOf(ch));
		}

	}

}
