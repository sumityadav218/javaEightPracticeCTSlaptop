package functionalInterfaceEg;

import java.util.Comparator;

public class paytm implements UpiPayment{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
		

	@Override
	public String doPayment(String source, String dest) {
			UpiPayment.datePatterns("yyyy-mm-dd") ; 
			return null ; 
	}

}
