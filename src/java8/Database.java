package java8;

import java.util.ArrayList;
import java.util.List;

//DAO lAYER
public class Database {
	
	public static List<Employee> getEmp(){
		List<Employee> empList =  new ArrayList<>() ; 
		
		empList.add(new Employee("ROHAN", 18, 25000, "Testing")) ; 
		empList.add(new Employee("MOHIT", 19, 27000, "Marketing")) ; 
		empList.add(new Employee("RAHUL", 18, 20000, "Support")) ; 
		empList.add(new Employee("PEEHU", 19, 21000, "QA")) ; 
		empList.add(new Employee("YASHIKA", 20, 30000, "Development")) ; 
		
		return empList ; 		
		
		
	}
		

}
