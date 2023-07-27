package java8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PracticeClass {

	public static void main(String[] args) {

		String str = "CognizantIsTheShittistCompanyIHaveEverWorkedWith" ; 
		/*
		 * Occurence of each character in the string using java 8
		 */

		Map<String,Long> output =Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) ; 
		System.out.println(output);
		
	
		
		/*
		 * occurence of duplicate character in string
		 */
		System.out.println(
				Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
				entrySet().stream().filter(o->o.getValue()>1).map(Map.Entry :: getKey).collect(Collectors.toList()) );
		/*
		 * occurence of first non repeating character in the string 
		 */
		
		System.out.println("***********************************");
		System.out.println(Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
				entrySet().stream().filter(o->o.getValue()>1).findFirst().get().getValue());

		/*
		 * Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(
		 * ), Collectors.counting())).
		 * entrySet().stream().filter(o->o.getValue()>1).findFirst().get().getValue();
		 */

		int [] arr = {1,2,3,4,5,6,7,8,9} ; 
	
		//find the secound highest no from the array   .  

		System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

		String[] array   = {"sumit","shivendra","abhishek"} ; 

		//find the longest string in the array. 
				

		System.out.println(Arrays.stream(array).max(Comparator.comparing(String::length)).get());


		//Accumulator->combiner
		Arrays.stream(array).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get() ; 

		String [] strArray  = {"1","2","3","4"}; 

		System.out.println(String.join("=", strArray));
		//String.join("=", strArray) ; 
		//IntStream.range(0, 10).skip(1).limit(9) );


		IntStream.range(0, 10).skip(2).limit(8).forEach(System.out::println); ; 

		ArrayList<Integer> list =  new ArrayList<>() ; 
		list.add(1) ; 
		list.add(2) ; 
		list.add(3) ; 
		list.add(4) ; 
		list.add(5) ; 


	}

}
