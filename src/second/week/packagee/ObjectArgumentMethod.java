package second.week.packagee;

public class ObjectArgumentMethod {

	
	public void m1(int a,int b, MethodWithParameter1 obj) {
		int c = a+b;
		System.out.println(c);
		obj.addition(obj.a,obj.b);
		
	}
	
	public static void main(String[] args) {
		ObjectArgumentMethod obj4 = new ObjectArgumentMethod();
		
		MethodWithParameter1 obj3 = new MethodWithParameter1();
		obj3.a = 40;
		obj3.b = 45;
		obj4.m1(22, 35, obj3);
		
		

	}

}
