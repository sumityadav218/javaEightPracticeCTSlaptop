package coreJavaCodingQuestion;

import java.util.Arrays;

public class TargetWordInAsString {

	public static void main(String[] args) {
	
		
		String str = "welcome to the ghaziabad city "  ; 
		
		String target  = "city" ; 
		
		String [] arr  = str.split(" ") ; 
		
		
		//by using the java 8 feature 
		System.out.println(Arrays.asList(arr).stream().filter(o->o.equals(target)).count()
		);
		

	}

}
