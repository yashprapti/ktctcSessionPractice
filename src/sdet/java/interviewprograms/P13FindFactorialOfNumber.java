package sdet.java.interviewprograms;

import java.util.Scanner;

public class P13FindFactorialOfNumber {
		public static void main(String[] args) {
		// Factorial of 5 means 5! = 5*4*3*2*1 = 120
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int factorial = 1;
		for(int i=num;i>=1;i--) {
			factorial = factorial*i;
		}
		System.out.println("Factorial of a Given Number is: "+factorial);
		
		
	}

}
