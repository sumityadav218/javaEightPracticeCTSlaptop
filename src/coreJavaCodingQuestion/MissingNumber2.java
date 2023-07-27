package coreJavaCodingQuestion;

import java.util.Arrays;

public class MissingNumber2 {
	
	public static int missingNumber (int[] arr) {

		Arrays.sort(arr) ; 
		int missingNo = 0 ; 

		for (int i = 0 ; i < arr.length+1 ; i++) {
			if (i+1 != arr[i] ) {
				missingNo = i+1 ; 
				break ; 	
			}
		}
		return missingNo ; 
	}

	public static void main(String[] args) {
		System.out.println(missingNumber(new int[] {1,2,3,4,6,7}));
		

	}

}
