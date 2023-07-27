package coreJavaCodingQuestion;

import java.util.Arrays;

//trying to reverse the string with reverse methodology 
public class rotateArray2 {
	
	public static void reverse (int[] arr , int left , int right) {
		
		if (arr ==null || arr.length ==1) {
			return ; 	
				}
		
		while (left <right) {
			
			int temp = arr[left] ; 
			arr[left] = arr[right] ; 
			arr[right] = temp  ; 
			left ++ ; 
			right -- ; 
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		 int order  =  2 ; 
		 int arr[]  = {1,2,3,4,5,6} ; 
		 
		 int a = arr.length-order ; 
		 
		 if (order>arr.length) {
			 order =order%arr.length ; 
		 }
		 
		 reverse(arr, 0, a-1);
		 reverse(arr, a, arr.length-1);
		 reverse(arr, 0, arr.length-1);
		 
		 System.out.println(Arrays.toString(arr));
		
		
	}

}
