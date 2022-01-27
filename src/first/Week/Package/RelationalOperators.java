package first.Week.Package;

public class RelationalOperators {

	public static void main(String[] args) {
		
		// Relational Operator < > <= >= == !=
		
		int a = 10;
		int b = 3;
		float c = 2.5f;
		double d = 3.5d;
		String s1 = "Ram";
		String s2 = "Sham";
		
		System.out.println(a<b);  // Output = false
		System.out.println(a>b);  // Output = true
		System.out.println(a<c);  // Output = false
		System.out.println(a>c);   // Output = true
		System.out.println(a<d);   // Output = false
		System.out.println(a>d);   // Output = true
		System.out.println(a<=b);  // Output = false
		System.out.println(a>=b);   // Output = true
		System.out.println(a==b);   // Output = false
		System.out.println(a!=b);   // // Output = true
		System.out.println(s1==s2);  // Output = false
		
	}

}
