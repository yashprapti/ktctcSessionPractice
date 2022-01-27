package first.Week.Package;

public class SecondSessionVariables0501 {

	public void data() {
		int integer = 20;
		System.out.println(integer);
	}

	public static void main(String[] args) {

		// We can Assign numeric value to char datatype but it converts into ascii
		// equivalent
		char crr = 90;
		System.out.println(crr); // it will print z
		int intdata = (int) 45.45;
		System.out.println(intdata);

		boolean b = true; // boolean has only true and false value
		System.out.println("First Value: " + b);
		b = false;
		System.out.println("Second Value: " + b);
		char c = 'a';
		char ch = '1';
		System.out.println(c);
		System.out.println(ch);
		ch = '2';
		System.out.println(ch);
		byte bbt = 56; // Range of byte is -128 to 127
		System.out.println(bbt);
		short sh = 500;
		System.out.println(sh); // Range of short is -2^15 to 2^15-1
		int i = 1000;
		System.out.println(i); // Range of int is -2^31 to 2^31-1
		long lg = 10000; // Within Range of int it accept directly
		System.out.println(lg);// Range of long is -2^63 to 2^63-1
		long lgg = 100000000000000000L;
		System.out.println(lgg); // If Value of range out of int range L need to write
		float f = 45.45F;
		System.out.println(f);
		double d = 45.45;
		System.out.println(d);
		SecondSessionVariables0501 obj = new SecondSessionVariables0501();
		obj.data();

	}

}
