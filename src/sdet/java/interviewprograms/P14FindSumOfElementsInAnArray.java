package sdet.java.interviewprograms;

public class P14FindSumOfElementsInAnArray {

	public static void main(String[] args) {


		int arr[] = {10,20,30,40,50};
		int sum = 0;
		for(int a:arr) {
			sum = sum+a;
		}
		System.out.println("Sum of Elements In an Array is: "+sum);
	}

}
