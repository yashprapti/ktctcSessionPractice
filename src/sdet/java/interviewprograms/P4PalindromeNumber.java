package sdet.java.interviewprograms;

import java.util.Scanner;

public class P4PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int orgnum = num;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10; // 1
			num = num / 10; // 100
		}
		if (orgnum == rev) {
			System.out.println("Number Is Palindrome");
		} else {
			System.out.println("Number Is Not Palindrome");
		}

	}

}
