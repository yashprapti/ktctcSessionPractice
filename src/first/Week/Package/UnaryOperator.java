package first.Week.Package;

public class UnaryOperator {

	public static void main(String[] args) {

		// Unary Operators exp++,exp--,++exp,--exp,~,!
		// exp++,exp--,++exp,--exp Operators
		
		int a = 5;// 6 5
		int b = 10;// 11 10
		
		int i = a++ + ++b - a-- + --b; // 5+11-6+10 = 20
		
		
		System.out.println("Value of i: "+i);
		int c = a++; // c=5  a= 6
		System.out.println(c);
		System.out.println(a);
		int d = b++;  // d = 10, b = 11
		System.out.println(d);
		System.out.println(b);
		
		int e = --a;  // e=5  a=5
		System.out.println(e);
		System.out.println(a);
		int f = --b;  // f=10 b = 10
		System.out.println(f);
		System.out.println(b);
		
		//+exp,-exp,~,! Operators
		
		int g = ~a;  // g = -6
		System.out.println(g);
		int h = ~g;  // h= 5
		System.out.println(h);
		
		
		
		

	}

}
