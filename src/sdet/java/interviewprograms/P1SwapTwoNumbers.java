package sdet.java.interviewprograms;

public class P1SwapTwoNumbers {

	public static void main(String[] args) {

// Swap Two Numbers Without Third Variable
		/*int a = 20;
		int b = 50;
		System.out.println("Value of a Before Swap "+a);
		System.out.println("Value of b Before Swap "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a After Swap "+a);
		System.out.println("Value of b After Swap "+b);*/
		
// Swap Two Numbers With Third Variable
		
		int a = 20;
		int b = 50;
		System.out.println("Value of a Before Swap "+a);
		System.out.println("Value of b Before Swap "+b);
		int c = b;  //c=50
		b=a;     //  b= 20
		a=c;     // a=50
		System.out.println("Value of a After Swap "+a);
		System.out.println("Value of b After Swap "+b);
		

	}

}
