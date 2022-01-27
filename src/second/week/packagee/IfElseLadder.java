package second.week.packagee;

public class IfElseLadder {

	public static void main(String[] args) {
		// For Multiple conditions we use If Else Ladder
		
		int marks=77;
		if(marks<35) {
			System.out.println("Student is Failed");
		}
		else if(marks == 35) {
			System.out.println("Student is Just Passed");
		}
		else if(marks>35 && marks<60) {
			System.out.println("Student Is Passed In Second Class");
		}
		else if(marks>=60 && marks<75) {
			System.out.println("Student is Passed in Distinction");
		}
		else {
			System.out.println("Student is Passed in Merit");
		}

	}

}
