package coreJavaCodingQuestion;
//using recursion 
public class factorial2 {
	
	public static int factorial (int i) {
		
		if (i<=1) {return 1 ; }
		
		else {
			 return i * factorial(i-1) ; 
			
		}
		
	}

	public static void main(String[] args) {
		System.out.println(factorial (4));
		 
	}

}
