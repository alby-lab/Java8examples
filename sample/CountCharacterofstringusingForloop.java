package com.demo.sample;

public class CountCharacterofstringusingForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi how are you";
		char arr[]=str.toCharArray();
	    for(int i=0;i<arr.length;i++) {
	    	char ch=arr[i];
	    	 int count=0;
	    	for(int j=0;j<arr.length;j++) {
	    		
	    		if (ch == arr[j])  
	    			count++; 
	    	}
	    	boolean flag=false;
	    	for(int k=i-1;k>=0;k--) {
	    	if (ch == arr[k])  
	    		flag=true;	
    		}
	    	if (!flag)  {
	    		//prints occurrence of the character   
	    		System.out.println("Character :"+ch+" occurs "+count+" times "+"=====>:"+flag);
	    		}  	
	    	
	    	}
	    
	    }

	}

