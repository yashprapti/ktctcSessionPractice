package sdet.java.interviewprograms;

import java.util.Random;

public class P12GenerateRandomNumberAndString {

	public static void main(String[] args) {


		// Approach 1 : Using Random Class
		
		/*Random rand = new Random();
		int randnum = rand.nextInt(10000); 
		System.out.println(randnum);*/
		
		/*Random rand = new Random();
		double randnum = rand.nextDouble();
		System.out.println(randnum);  // from 0.0 to 1.0*/
		
		// Approach 2 : Using Math Class
		
		double randnum = Math.random();
		System.out.println(randnum); // from 0.0 to 1.0
		

	}

}
