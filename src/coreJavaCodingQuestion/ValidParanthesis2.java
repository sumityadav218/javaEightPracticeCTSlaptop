package coreJavaCodingQuestion;

import java.util.Scanner;
import java.util.Stack;

//2nd approach is by using the stack data structure 
public class ValidParanthesis2 {

	public static void main(String[] args) {
//			Scanner sc =  new Scanner  (System.in) ; 
//			sc.g
		String str = "{[()]}" ; 
		char[] ch = str.toCharArray() ; 
		boolean check  =  true; 
		Stack<Character> st  = new Stack<> (); 

		for (char c  : ch) {
			if (c == '[' || c=='{' || c =='(') {

				st.push(c) ; 
			}
			else if (c == '}' || c ==']' || c == ')') {
				if (st.empty()) {
					check =  false ; 
				}
				else {
					char top = st.pop();
					if (!(c =='(' && top ==')' )|| (c=='{' && top=='}')||(c=='[' && top ==']')) {
						check = false ; 

					}

				}


			}


		}

		if (st.empty()) {
			System.out.println("true ");



		}
		else {
			System.out.println("false ");
		}
	}

}
