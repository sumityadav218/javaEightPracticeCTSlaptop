package coreJavaCodingQuestion;
//is the given string is palindrome or not for eg :  madam :true
public class Palindrome1 {
	
	//using two pointer algo  
	
	
	public static boolean isPalindrome (String s) {
		int left = 0 ; 
		int right =  s.length()-1  ; 
		
		while (left < right ) {
			if (s.charAt(left)!= s.charAt(right) ) {
				return false   ; 
				
			}
			left ++  ; 
			right -- ; 

			
		}
		return true  ; 	
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("sunny") );
		
		
	}
	
	
	
	
	
	
}
