package ktctc.assignment;

public class CheckNumberPrimeOrNot {

	public static void main(String[] args) {
		
		/*For Prime Number Need to check two conditions.
		 * 1. Number Should be greater than 1
		 * 2. Number must be divisible by two values i.e by 1 and by number itself.
		 * */

		int num = 11;
		int count = 0;

		if (num > 0) {

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Selected Number " + num + "  is Prime Number");
			} else {
				System.out.println("Selected Number " + num + "  is Not Prime Number");
			}
		}

		else {

			System.out.println("Invalid Number For Prime Check");
		}

	}

}
