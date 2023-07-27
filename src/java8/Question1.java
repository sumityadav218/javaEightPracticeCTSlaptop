//find out occurence of each character in the given string using java 8 features 

package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question1 {

	public static void main(String[] args) {
	
	String a = "ilovejavaTechie" ; 
	
	/* occurence of each character */
	System.out.println(	Arrays.stream(a.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) );

		
	/* occurence of duplicate characters in the string */
	
		
	System.out.println(Arrays.stream(a.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(
			o->o.getValue()>1	).map(Map.Entry::getKey).collect(Collectors.toList())  	
	);
	
	//occurence of first non repeating character 
	
//	
//	
//	String ouput =  Arrays.stream(a.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(o->o.getValue()==1).
//			findFirst().get().getKey() ; 

    	String output =   Arrays.stream(a.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new  , 
    		Collectors.counting())).entrySet().stream().filter(o->o.getValue()==1).findFirst().get().getKey() ; 
    
    
	
		System.out.println(output);
	
	}

}
