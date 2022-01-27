package ktctc.assignment;

import java.util.Scanner;

public class CountEvenAndOddsInNumber {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int evencount = 0;
		int oddcount = 0;
		while(num>0) {
			int rem = num%10;
			if(rem%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
			num=num/10;
		}
		System.out.println("Count of Even Number is: "+evencount);
		System.out.println("Count of odd Number is: "+oddcount);
		
	}

}
