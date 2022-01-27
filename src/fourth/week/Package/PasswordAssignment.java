package fourth.week.Package;

import java.util.Scanner;

public class PasswordAssignment {

	public static void main(String[] args) {
		String actpwd  = "Admin@123";
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Password.This is Your First Attempt");
		String str = sc.nextLine();
		int count = 3;
		while(count>0) {
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
				str = sc.nextLine();
				}
			}
		}
//		if(count==0) {
//		System.out.println("Sorry Your Account is Temprorily Locked");
//		}

	}

}
