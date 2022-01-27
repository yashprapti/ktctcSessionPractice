package practice.packagee;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		int a = 130;
		int b = 100;
		int c = 130;
		
		if(a>=b && a>=c) {
			System.out.println("Largest Number is "+a);
		}
		else if(b>a && b>c) {
			System.out.println("Largest Number is "+b);
		}
		else {
			System.out.println("Largest Number is "+c);
		}
		
	}

}
