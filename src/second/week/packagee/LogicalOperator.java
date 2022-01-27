package second.week.packagee;

public class LogicalOperator {

	public static void main(String[] args) {
		// Logical Operators are AND(&&) OR(||)
		// Logical Operators return the boolean value
		
		int a = 20;
		int b = 30;
		int c = 50;
		
		boolean d = (a<b)&&(a<c) ; // both condition true returns true
		System.out.println(d);
		boolean e = (a>b)||(a<c);  // one condition is true returns true
		System.out.println(e);

	}

}
