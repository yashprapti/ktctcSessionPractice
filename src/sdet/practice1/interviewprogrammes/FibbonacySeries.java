package sdet.practice1.interviewprogrammes;

public class FibbonacySeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 1;
		for(int i=1;i<=20;i++) {
			System.out.print(a+",");
			int c = a+b;
			a=b;
			b=c;
		}
	}

}
