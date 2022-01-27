package ktctc.assignment;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// First 20 Numbers in Fibonnacy Series
		int a = 0;
		int b = 1;
		for (int i = 1; i <= 20; i++) {
			System.out.print(a + ", ");
			int c = a + b;
			a = b;
			b = c;
		}
	}

}
