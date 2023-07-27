package coreJavaCodingQuestion;

// strings as a anagram means that the character in the string are same but not be the order . 



import java.util.Arrays;

public class Anagrams {
	
	public static boolean isAnagrams (String s1 , String s2) {
		char[] chArray1  = s1.toCharArray() ; 
		char[] chArray2  = s2.toCharArray() ; 

		Arrays.sort(chArray1) ; 
		Arrays.sort(chArray2) ; 
	 
		return Arrays.equals(chArray1, chArray2) ; 
		
		
	}
	
public static void main(String[] args) {
	System.out.println(isAnagrams("sumit","imtus"));
	
	
}
}
