package practice.packagee;

public class Variable2 {

	
	 public void set (int i,int b,int c) {
		System.out.println(i);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) {
		
		Variable2 obj = new Variable2();
		obj.set(10, 20, 30);
		Variable2 obj1 = new Variable2();
		obj1.set(50, 100, 150);

	}

}
