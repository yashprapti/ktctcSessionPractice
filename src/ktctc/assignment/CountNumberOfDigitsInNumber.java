package ktctc.assignment;

import java.util.Scanner;

public class CountNumberOfDigitsInNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}

		System.out.println("Total Digits In Number are: " + count);

	}

}
