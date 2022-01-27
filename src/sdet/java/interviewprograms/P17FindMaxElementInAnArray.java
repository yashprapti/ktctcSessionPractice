package sdet.java.interviewprograms;

public class P17FindMaxElementInAnArray {

	public static void main(String[] args) {


		int arr[] = {500,150,30,400,50};
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum Element In An Array Is: "+max);

	}

}
