package sdet.java.interviewprograms;

public class P10FibonnacySeries {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		
		for(int i=1;i<=20;i++) {
			System.out.print(a +",");
			int c = a+b;
			 a=b;
			 b=c;
		}

	}

}
