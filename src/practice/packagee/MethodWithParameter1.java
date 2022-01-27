package practice.packagee;

public class MethodWithParameter1 {
	// Method With parameter is also called as Parameterized method
	
	public void addition(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		MethodWithParameter1 obj = new MethodWithParameter1();
		obj.addition(50, 150);
		MethodWithParameter1 obj2 = new MethodWithParameter1();
		obj2.addition(375, 580);

	}

}
