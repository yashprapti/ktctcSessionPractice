package ktctc.assignment;

public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		// Swap Two Numbers Without Using Third Variable

		int a = 25;
		int b = 50;
		System.out.println("Value of a Before Swapping is " + a);
		System.out.println("Value of b Before Swapping is " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of a After Swapping is " + a);
		System.out.println("Value of b After Swapping is " + b);
	}

}
