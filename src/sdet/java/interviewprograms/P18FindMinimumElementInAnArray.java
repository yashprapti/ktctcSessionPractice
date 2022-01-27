package sdet.java.interviewprograms;

public class P18FindMinimumElementInAnArray {

	public static void main(String[] args) {
		
		int arr[] = {10,2,30,5,1};
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum Element In an Array Is: "+min);
	}

}
