package sdet.practice1.interviewprogrammes;

import java.util.Scanner;

public class VowelOrConsonents {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		String ch = sc.next();
		if(ch.equalsIgnoreCase("a")||ch.equalsIgnoreCase("e")||ch.equalsIgnoreCase("i")||ch.equalsIgnoreCase("o")||ch.equalsIgnoreCase("u")) {
			System.out.println("Input is Vowel");
		}
		else {
			System.out.println("Input is Consonent");
		}

	}

}
