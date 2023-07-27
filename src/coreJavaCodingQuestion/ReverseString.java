package coreJavaCodingQuestion;
//there are two possible solutions i found at that time ; the first is below and the secound is stringBuider 

public class ReverseString {
	
	public static String reverseStringByArray (String s) {

		int i = 0 ; 
		int j = s.length()-1 ; 
		char [] rev =  new char [s.length()] ; 

		while (i <= j) {
			rev[i] = s.charAt(j) ; 
			rev[j] = s.charAt(i) ; 

			i++ ; 
			j-- ; 
		}

		return String.valueOf(rev) ;


	}
	

	public static void main(String[] args) {
	
		System.out.println(reverseStringByArray("sumit" ));
		

	}

}
