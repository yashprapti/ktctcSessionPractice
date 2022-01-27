package ktctc.assignment;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		int a = 450;
		int b = 200;
		int c = 750;
		if (a >= b && a >= c) {
			System.out.println("Largest Number Is " + a);
		} else if (b > a && b > c) {
			System.out.println("Largest Number Is " + b);
		} else {
			System.out.println("Largest Number Is " + c);
		}

	}

}
