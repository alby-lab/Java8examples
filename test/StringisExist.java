package com.demo.test;

public class StringisExist {
	public static void main(String[] args) {
	      String str="hello";
	    
	      
	      /*  //  String str = "Hello World!";
	          String newStr = "";
	          int startFrom = 3, endBefore = 5;// test startFrom and endBefore indices
	          for (int i = 0; i < str.length(); i++) {
	        	  char ch=str.charAt(i);
	        	  newStr=ch+newStr;
	          System.out.println(newStr);
	          if(newStr.equals("ol")) {
	          System.out.println(newStr);
	          break;
	          }
	      }
	          System.out.println(newStr);       
	  }*/
	      
	     
	      System.out.println(veryfyString(str));        

		      
		    }     
	      
	public static boolean veryfyString(String str) {
		 StringBuilder substr = new StringBuilder();
		    for (int i = 0; i < str.length() ; i++) {
		        substr.append(str.charAt(i));
		        System.out.println("before===========substr.toString()=====>"+substr.toString());
		        if(substr.toString().length()>1) {
		        	System.out.println("enter");
		        	if(substr.toString().equalsIgnoreCase("lo")) {
		        		
		        	return true;	
		        	}
		        			
		        	substr.setLength(0);	        
		        	}
		        
		
	
	}
return false;
}

}