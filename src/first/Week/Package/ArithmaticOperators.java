package first.Week.Package;

public class ArithmaticOperators {

	public static void main(String[] args) {
		// Arithmetic Operators + - * / %
		
		int a = 10;
		int b = 3;
		float c = 2.5f;
		double d = 3.5d;
		String s1 = "Ram";
		String s2 = "Sham";
		// + Operator
		
		System.out.println(a+b);    // Output = 13
		System.out.println(s1+a);    // Output = Ram10
		System.out.println(a+s2);    // Output = 10Sham
		System.out.println(s1+" "+s2); // Output = Ram Sham
		System.out.println(s1+s2);     // Output = RamSham
		System.out.println(a+b+s1);    //Output = 13Ram
		System.out.println(s2+a+b);    // Output = Sham103
		System.out.println(a+c);       //Output = 12.5
		System.out.println(a+d);      //Output = 13.5
		
		// - Operator
		
		System.out.println(a-b);//Output = 7
		System.out.println(b-a);//Output = -7
		System.out.println(a-c);//Output = 7.5
		System.out.println(a-d); //Output = 6.5
		
		// * Operator
		
		System.out.println(a*b);// //Output = 30
		System.out.println(a*c);  //Output = 25
		System.out.println(a*d);    //Output = 35
		System.out.println(c*d);    // //Output = 8.75
		System.out.println(d*d);   //Output = 12.25
		System.out.println(c*c);   //Output = 6.25
		
		// / Operator
		
		System.out.println(a/b); ////Output = 3
		System.out.println(a/c);  //Output = 4.0
		System.out.println(a/d);   //Output = 2.857..
		System.out.println(c/d);   // //Output = 0.71...
		
		
		// % Operator
		System.out.println(a%b); ////Output = 1
		System.out.println(a%c);  //Output = 0
		System.out.println(a%d);   //Output = 3
		System.out.println(c%d);   // //Output = 2.5
		

	}

}
