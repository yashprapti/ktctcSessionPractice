package ktctc.assignment;

/**
 * For Leap Year Following are the two conditions 1. year is divisible by 4 but
 * not 100. 2.year is divisible by 400.
 *
 */
public class CheckLeapYear {

	public static void main(String[] args) {

		int year = 1900;
		if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
			System.out.println("Selected Year is a Leap Year");
		} else {
			System.out.println("Selected Year is Not Leap Year");
		}
	}

}
