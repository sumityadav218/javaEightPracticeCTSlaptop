package coreJavaCodingQuestion;


//palindrome using string builder 
public class palindrome3 {

	public static void main(String[] args) {
	
		String s  = "madam" ; 
		StringBuilder sb =  new StringBuilder(s) ; 
		System.out.println(sb.reverse().toString().equals(s));
		

} } 
