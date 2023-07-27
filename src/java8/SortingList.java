package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingList {

	public static void main(String[] args) {

		/*
		 * Sorting a list using a normal method vs java 8
		 */
		
		//primitives
		
		List<Integer> list =  new ArrayList<>() ; 
		list.add(1) ; 
		list.add(2) ; 
		list.add(3) ; 
		list.add(4) ; 
		list.add(5) ; 
		list.add(6) ; 
		
		Collections.sort(list);
		Collections.reverse(list);		

	
		//objects example  
		
		List<Employee> empList =  Database.getEmp() ; 
		
		Collections.sort(empList, new myComparator());
		
		System.out.println(empList);
		
		
		
		
		//now see the difference of java 8  for custom and normal sorting 
		
	
		//primitives or normal 
		list.stream().sorted().forEach(System.out::println ) ; 
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //descending 
		
		
		
		//objects -------------------->
		
		empList.stream().sorted((o1,o2)->o1.getSalary()-o2.getSalary()).forEach(System.out::println);
		
		empList.stream().sorted(Comparator.comparing(o->o.getSalary())).forEach(System.out::println);
		
		
		//if we want to use any different parameter for the comparing we can do this also 
		 
		empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		
		
	}
	
	
	}
class myComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
	
		
		return o1.getSalary()- o2.getSalary() ; //ascending order 
	}
	
}
