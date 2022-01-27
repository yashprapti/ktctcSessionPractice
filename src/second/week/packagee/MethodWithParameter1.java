package second.week.packagee;



public class MethodWithParameter1 {
	// Method With parameter is also called as Parameterized method
	
	public int a;
	public int b;
	
	public void addition(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		MethodWithParameter1 obj = new MethodWithParameter1();
		obj.addition(20,30);
		MethodWithParameter1 obj2 = new MethodWithParameter1();
		obj2.addition(40,50);

	}

}
