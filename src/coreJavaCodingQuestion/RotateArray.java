package coreJavaCodingQuestion;

import java.util.Arrays;

//rotate an array with element n for k step  
//example n = 7 {1,2,3,4,5,6,7} // and k =  3  ; op//:-{5,6,7,1,2,3,4} 


public class RotateArray {

	public static void main(String[] args) {

		int[] arr =  {1,2,3,4,5,6,7} ; 
		int k = 3 ; 
		rotateArray(k, arr);

	}
	
	public static void rotateArray(int k , int[] arr) {

		int [] result  = new int [arr.length] ; 

		for (int i = 0 ; i<k ; i++) {
			result[i] = arr[arr.length-k+i] ;

		}

		int j = 0 ;

		for (int i = k ; i < arr.length ; i++) {

			result[i] =  arr[j] ; 
			j++ ; 

		}

		System.out.println(Arrays.toString(result));


	}

}
