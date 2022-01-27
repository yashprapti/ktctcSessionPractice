package sdet.java.interviewprograms;

import java.util.Scanner;

public class P11CheckNumberIsPrimeOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		boolean flag = true;
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				flag = false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Number Is A Prime Number");
		}else {
			System.out.println("Number Is NOT prime");
		}
	}

}
