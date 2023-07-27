package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingMap {
	
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();  
		
		map.put("ten",10); 
		map.put("seven",7); 
		map.put("two",2); 
		map.put("four",4); 
	
		
		//trying to sort using traditional approach 

		List<Entry<String, Integer>> entries  = new ArrayList <>(map.entrySet());


		Collections.sort(entries,new Comparator<Entry<String,Integer>>() {



			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				return o1.getKey().compareTo(o2.getKey()); 
			}
		}) ; 
		
		
		for (Entry<String,Integer> entry : entries) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
			
			
		}

		//now using the java 8 approach  --  > 
		
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		
		
	//using object data types  	
		
		Map<Employee,Integer> empMap =  new HashMap<Employee, Integer>() ; 
		
		empMap.put(new Employee("ROHAN", 18, 25000, "Testing"), 23) ; 
		empMap.put(new Employee("MOHIT", 19, 27000, "Marketing"),12) ; 
		empMap.put(new Employee("RAHUL", 18, 20000, "Support"),67) ; 
		empMap.put(new Employee("PEEHU", 19, 21000, "QA"),89) ; 
		
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println) ; 
		
	
	
		
		
		
		
//	/map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println) ;
		System.out.println("****************************************************");
		
		
Map<Employee,Integer> empMap1 =  new HashMap<Employee, Integer>() ; 
		
empMap1.put(new Employee("ROHAN", 18, 25000, "Testing"), 23) ; 
empMap1.put(new Employee("MOHIT", 19, 27000, "Marketing"),12) ; 
empMap1.put(new Employee("RAHUL", 18, 20000, "Support"),67) ; 
empMap1.put(new Employee("PEEHU", 19, 21000, "QA"),89) ; 


empMap1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed())).forEach(System.out::println);
		

empMap1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed())).forEach(System.out::println);
		
		
		
		
	}

}
