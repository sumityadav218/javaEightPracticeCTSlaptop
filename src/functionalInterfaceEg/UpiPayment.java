package functionalInterfaceEg;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UpiPayment {
	
	//abstract method 
	String doPayment (String source  , String dest) ; 
	
	
	
	//default method it is not restricting to override i.e it depends on user whether to overrride it or not 
	default double getStractCard () {
		return new Random().nextDouble() ; 
	
	}
	
	
	//static method example 
	
	static String datePatterns (String patterns) {
		
		SimpleDateFormat dateFormat =  new SimpleDateFormat(patterns) ; 
			
		return dateFormat.format(new Date()) ; 
		
		
		
	}

}
