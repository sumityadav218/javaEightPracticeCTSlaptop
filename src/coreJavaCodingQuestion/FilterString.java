package coreJavaCodingQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterString {

	public static void main(String[] args) {
	
		List<String> strings =  Arrays.asList("sumit","Abhishek","Shivendra","Himanshu","Kushagra") ; 
		
		
		System.out.println(strings.stream().filter(o->o.length()>5).count());
	 
		
		System.out.println(strings.stream().collect(Collectors.groupingBy(String::length)).entrySet().
				stream().filter(x->x.getKey()>6).collect(Collectors.toList()) ); 
				
				
				
				
				
				//find the duplicates character in the string 
				
				
				String str = "sumitkumaryadav" ; 
		
				char[] ch =  str.toCharArray() ; 
				List<Character> list =  new ArrayList<Character>()  ;
		
		Set<Character> unique  =  new HashSet<Character>() ; 
		
		for (char c : ch) {
			if (!unique.contains(c)) {
				unique.add(c) ;
			}
			else {
				list.add(c) ; 
	
			}
			
			
		}
		System.out.println(String.valueOf(list));
				
	
		
	}

}
