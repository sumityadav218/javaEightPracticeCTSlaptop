package java8;

import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsInList {

	
	public static void main(String[] args) {
		List<Integer> list =  new ArrayList<>() ; 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(6);
		
		Set<Integer> set = new LinkedHashSet<Integer>() ; 
		
		
		 List<Integer> duplicates=list.stream().filter(o->!set.add(o)).collect(Collectors.toList()) ;
		
		 System.out.println(duplicates);
		
		
		
		
		
		
	}
}
