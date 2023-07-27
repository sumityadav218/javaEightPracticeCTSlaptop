package coreJavaCodingQuestion;

public class ValidParanthesis {

	public static void main(String[] args) {
		
		String str = "{[()}"  ;
		boolean check =  false;  
		
		int left = 0 ; 
		int right = str.length()-1 ; 
		
		char[] ch = str.toCharArray() ; 
		
		while  (left <= right) { 
			if(ch[left] == '{' && ch[right] == '}' ) {
				check = true  ; 
			}
			else if (ch[left] == '[' && ch[right] == ']' ) {
				check = true  ; 
			}
			else if (ch[left] == '(' && ch[right] == ')' ) {
				check = true  ; 
			}
			else {
				check = false ;
			}
			left ++ ; 
			right -- ; 
			
		}
		
		if(check) {
			System.out.println("valid paranthesis");
		}
		else System.out.println("invalid paranthesis");
		
		
		
	}

}
