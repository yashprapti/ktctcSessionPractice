package second.week.packagee;

public class NestedIfElseStatement {

	public static void main(String[] args) {
		// If we write If statement inside if statement called as Nested if Else
		// Condition

		int i = 1000001;
		if (i >= 0 && i < 100) {
			System.out.println("Given Number In the two digit block");
			if (i % 2 == 0) {
				System.out.println(i + " :this two digit number is Even Number");
			} else {
				System.out.println(i + " :this two digit number is Odd Number");
			}
		} else if (i >= 100 && i < 1000) {
			System.out.println("Given Number is in the Three Digit block");
			if (i % 2 == 0) {
				System.out.println(i + " :this three digit number is Even Number");
			} else {
				System.out.println(i + " :this three digit number is Odd Number");
			}
		} else {
			System.out.println("Given Number is larger than Three Digits");
			if (i % 2 == 0) {
				System.out.println(i + " :this large digit number is Even Number");
			} else {
				System.out.println(i + " :this large digit number is Odd Number");
			}
		}
	}

}
