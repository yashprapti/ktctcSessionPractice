package sdet.practice1.interviewprogrammes;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int rev = 0;
		while(num>0) {
			rev = rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}
}
