package coreJavaCodingQuestion;

public class palidrome2 {
	
	//palindrome using recursion 
	public static boolean  isPalindrome (String s) {
		if (s.length()<=1) {
			return true  ; 
		}
		else {
			if (s.charAt(0) == s.charAt(s.length()-1)) {
				return isPalindrome(s.substring(1, s.length()-1)) ; 
				
			} else {return false; }

		}
		
		
	}

	public static void main(String[] args) {
	String str = "sumit" ; 
	if (isPalindrome(str)) {
	System.out.println("yes ");
		
	}else {
		System.out.println("false");
	}

	}

}
