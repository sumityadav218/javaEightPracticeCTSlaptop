package coreJavaCodingQuestion;

public class Fibbonaci2 {

	public static int  fibbonaci (int n ) { 
		
		if(n <=1 ) {
			return n  ; 
		}
		return fibbonaci(n-1)+ fibbonaci(n-2) ; 
	
	}
	
	
	public static void main(String[] args) {
	
		System.out.println(	fibbonaci(7) );
	 
	}

}
