
//2nd highest no from the array
package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question2 {

	public static void main(String[] args) {
	int [] arr  = {1,3,5,6,72,24,54} ; 
	
	Integer secoundHighestNumber = 	Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get() ;
			
			
	
	System.out.println(secoundHighestNumber);
	
	
	
	//find the longest string from the given array 
	
	String [] family = {"sumit", "renu", "amit","charu","papa","mummy","chitti"} ; 
	
	
	//solution 1 //
	System.out.println(Arrays.stream(family).max(Comparator.comparing(String::length)).get()
	);
	
	//solution 2 usnig reduce 
	System.out.println(Arrays.stream(family).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get() 
	
);
	
	}

}
