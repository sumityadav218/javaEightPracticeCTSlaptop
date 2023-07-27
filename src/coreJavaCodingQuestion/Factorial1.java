package coreJavaCodingQuestion;
//using iteartion 
public class Factorial1 {
	
	public static int factorial (int n ) {
		
		int op =1 ; 
		for  (int i = 1 ; i <= n  ; i++) {
			op  = op* i  ; 			
			
			
		}
		return op ; 
		
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
		  
	}
}
