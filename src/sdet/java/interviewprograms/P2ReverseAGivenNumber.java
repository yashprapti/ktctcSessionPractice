package sdet.java.interviewprograms;

import java.util.Scanner;

public class P2ReverseAGivenNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int rev = 0;
		while(num>0) {
			rev=rev*10+num%10;
			num = num/10;
		}
		
		System.out.println("Reverse Number Is "+rev);

	}

}
