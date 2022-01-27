package sdet.java.interviewprograms;

public class P9LargestNumberOfThreeNumbers {

	public static void main(String[] args) {
		
		int a = 104;
		int b = 100;
		int c = 104;
		if(a>=b && a>=c) {
			System.out.println("Largest number is "+a);
		}else if(b>a && b>c) {
			System.out.println("Largest number is "+b);
		}else {
			System.out.println("Largest number is "+c);
		}
	}

}
