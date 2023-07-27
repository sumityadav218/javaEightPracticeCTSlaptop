package coreJavaCodingQuestion;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		
		
		int [] arr1 = {1,2,4,5,5,3,2} ; 
		int [] arr2 = {2,4,2,5,3} ; 
		
		Set<Integer> set = new HashSet<>(); 
		
		for (int x : arr1) {
			set.add(x) ; 
	
		}
		
		for ( int y : arr2) {
			if (set.contains(y)) {
				set.remove(y) ; 
				System.out.println(y);
			}
			
		}
		

	}

}
