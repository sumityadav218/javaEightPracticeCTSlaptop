
//nth highest salary using java 8 

package java8;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MyntraInterview {

	public static void main(String[] args) {
	
		
		
		Map<String,Integer> salary =  new HashMap<>() ; 
		salary.put("sumit",2000000 ) ; 
		salary.put("Amit",3000000 ) ; 
		salary.put("Papa",5000000 ) ; 
		salary.put("Charu",200000) ; 
		salary.put("Renu",3000000 ) ; 
		salary.put("Mummy",4000000 ) ; 
		
		//1st approach 
		System.out.println(
				salary.entrySet().stream().sorted(Collections.reverseOrder(	
						Map.Entry.comparingByValue())
					).collect(Collectors.toList()).get(1))
		 ; 
	
		
		//but suppose there are multiple people having the same salary , if you the past approach it will give totally wrong answers so below is the 
		//more opztimize approach .
		
		
		 salary.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList()))).
		 entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(1);

	}

}
