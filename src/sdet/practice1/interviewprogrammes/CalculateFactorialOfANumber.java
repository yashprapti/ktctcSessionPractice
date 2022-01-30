package sdet.practice1.interviewprogrammes;

import java.util.Scanner;

public class CalculateFactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5! = 5*4*3*2*1
		
		int num = 5;
		int fact = 1;
		for(int i=num;i>=1;i--) {
			fact = fact*i;
		}
		System.out.println(fact);

	}

}
