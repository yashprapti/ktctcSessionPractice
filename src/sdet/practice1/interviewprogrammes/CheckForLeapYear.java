package sdet.practice1.interviewprogrammes;

import java.util.Scanner;

public class CheckForLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Text");
		int year = sc.nextInt();
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.println("Selected Year Is Leap Year");
		}else {
			System.out.println("Selected Year Is NOT Leap Year");
		}

	}

}
