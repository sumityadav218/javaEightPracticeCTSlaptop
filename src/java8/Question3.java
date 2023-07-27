
//find the nos in array which starts with 1
package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question3 {

	public static void main(String[] args) {
		int []  arr  = {11,4,2,5,3,21,34,1,54,13} ; 
		
	System.out.println(Arrays.stream(arr).boxed().map(o->o + "").filter(o->o.startsWith("1")).collect(Collectors.toList())
);	
	
	
	//example of string.join 
	
	
	List<String> list =  Arrays.asList("1","3","4","5") ;
	
	
	String op = String.join("-", list) ;
	System.out.println(op);
	
	//output: 1-3-4-5
	
	
	
	//example of skip and limit   //print nos from 2 to 9 
	IntStream.range(1, 10).skip(1).limit(8).forEach(System.out::println);;
	
	//map and flatmap example 
	//sort a list and map using java 8 
	
	
	}

}
