package coreJavaCodingQuestion;

//write a program to print the fibbonaci for a given no : the method using is the normal itertation 
 

public class Fibbonaci1 {
	
	public static void main(String[] args) {
		 
		int first = 0 ; 
		int secound =  1; 
		int n = 10  ; //input for fibbonaci 
		 
		 for (int i = 0 ; i <= n ; i ++ ) {
			 
			 int next = first + secound  ; 
			 
			 System.out.println(next);
			 
			 
			 first =  secound  ; 
			 secound  =  next  ; 
			 
			 
			 
		 }
		
		
		
		
	}
	
	
	

}
