package second.week.packagee;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// There are two commonly used methods in Array
		// 1. Arrays.equals 2. Arrays.sort (Sorts in Ascending Order)
		// These methods are only applicable to single Dimensional Array

		int[] arr = { 100, 200, 300, 400, 500 };
		int[] arr1 = { 100, 200, 300, 400, 500 };
		boolean flag = Arrays.equals(arr, arr1);
		System.out.println(flag); // Returns True
		int[] arr3 = {200,500,300,100,400};
		Arrays.sort(arr3);
		
		
		

	}

}
