package sdet.java.interviewprograms;

import java.util.Scanner;

public class P6CountNumberOfDigitsInANumber {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int count = 0;
		while(num>0) {
			int rem = num%10;
			count++;
			num=num/10;
		}
		
		System.out.println("Count of Digits In A Given Number iS "+count);


		

	}

}
