package sdet.java.interviewprograms;

public class P15ExtractEvenAndOddInAnArray {

	public static void main(String[] args) {


		int arr[] = {1,2,3,4,5};
		System.out.println("Even Numbers In Array Are-------");
		for(int a:arr) {
			if(a%2==0) {
				System.out.print(a+",");
			}
		}
		System.out.println();
		System.out.println("Odd Numbers In Array Are-------");
		for(int a:arr) {
			if(a%2!=0) {
				System.out.print(a+",");
			}
		}
	}
}
