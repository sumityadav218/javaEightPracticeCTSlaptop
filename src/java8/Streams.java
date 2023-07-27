package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {

		List<Integer> list =  new ArrayList<Integer>() ;
				
		list.add(2) ; 
		list.add(3) ; 
		list.add(4) ; 
		list.add(5) ; 
		list.add(6) ; 
		list.add(7) ; 
		list.add(8) ; 
		
		//even nos 
		System.out.println(	list.stream().filter(o->o%2==0).collect(Collectors.toList()) 
				);
		
		System.out.println('b' + 'i' + 't');
	
		
	}

}
