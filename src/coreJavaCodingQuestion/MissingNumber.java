package coreJavaCodingQuestion;
//find the missing no from the array 
public class MissingNumber {

	public static void main(String[] args) {
		
		int [] arr = {1,2,4,5,6,7,9,8} ; 
		  
		 int totalSum = 0 ; 
		 int currentSum  = 0 ; 
		 
		 
		 for (int x : arr) {
			 currentSum += x ; 
 
		 }
		 
		 for (int i = 0 ; i<= arr.length+1 ; i++) {		 
			 totalSum += i ; 

		 }
		 
		 System.out.println("the missing  number is = " + ( totalSum-currentSum ) );

	}

}
