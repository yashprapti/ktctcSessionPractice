package sdet.practice1.interviewprogrammes;

import java.util.Scanner;

public class CheckForPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=num-1;i++) {
			if(num % i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Number Is Prime");
		}
		else {
			System.out.println("Number Is Not Prime");
		}
	}

}
