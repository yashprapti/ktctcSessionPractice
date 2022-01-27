package fourth.week.Package;

import java.util.Scanner;

public class PasswordAssignmentWithDoWhile {

	public static void main(String[] args) {
		String actpwd  = "Admin@123";
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Password.First Attempt");
		String str = sc.next();
		int count = 3;
		do {
			if(str.equals(actpwd)) {
				System.out.println("Welecome You Logged In Successfully");
				break;
			}else {
				count--;
				if(count==0) {
					System.out.println("Sorry Your Account is Temprorily Locked");
					break;
				}else {
				System.out.println("Incorrect Password please Try Again.Remaining Attempts Are: "+count);
				str = sc.next();
				}
			}
		}while(count>0);
//		if(count==0) {
//		System.out.println("Sorry Your Account is Temprorily Locked");
//		}

	}

}
