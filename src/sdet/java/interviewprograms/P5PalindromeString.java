package sdet.java.interviewprograms;

import java.util.Scanner;

public class P5PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Text");
		String str = sc.next();
		String rev = "";
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println("String Is Palindrome");
		}else {
			System.out.println("String Is Not Palindrome");
		}
		

	}

}
