package coreJavaCodingQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//find the duplicates in the list of string 

public class DuplicatesInList {
	public static void main(String[] args) {
		
		//first approach by using the set

		List<String> list =  Arrays.asList("apple","banana","apple","orange") ; 
		
		Set<String> unique = new HashSet<> ()  ; 
		
		Set<String> duplicates =  new HashSet<>() ; 
		
		for (String s :  list) {
			
			if (!unique.contains(s)) {
				unique.add(s) ; 	
			}
			else {
				duplicates.add(s) ; 
			}
			
		}
		
		System.out.println(duplicates);
	
		
		//secound approach by using the java 8 distinct feature 
		//On^2 
		
		System.out.println(list.stream().distinct().filter(s->list.stream().filter(x->x.equals(s)).count()>1).collect(Collectors.toList()) 
		);
		
		
		System.out.println("sumit");
	//	System.out.println(list.stream().filter(o->));
		
		
		
	
		
		
		
}
}
