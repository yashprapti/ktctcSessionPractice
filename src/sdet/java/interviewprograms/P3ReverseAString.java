package sdet.java.interviewprograms;

import java.util.Scanner;

public class P3ReverseAString {

	public static void main(String[] args) {
		
		// Method 1
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		String rev = "";
		char ch[] = str.toCharArray();
		int len = ch.length;
		for(int i=len-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println("Reverse String Is "+rev);*/
		
		// Method 2
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		String rev = "";
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse String Is "+rev);*/
		
		// Method 3
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		StringBuffer revstr  = new StringBuffer(str);
		StringBuffer rev = revstr.reverse();
		System.out.println("Reverse String Is "+rev);
	}

}
