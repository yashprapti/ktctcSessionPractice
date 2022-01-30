package sdet.practice1.interviewprogrammes;

public class AverageOfNumbers {

	public static void main(String[] args) {


		int arr[] = {1,2,3,4,5};
		int sum = 0;
		int len = arr.length;
		for(int a:arr) {
			sum=sum+a;
		}
		int avg = sum/len;
		System.out.println(avg);

	}

}
