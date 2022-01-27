package practice.packagee;

public class Variable {

	int i;
	int b;
	int c;
	
	void set() {
		i=10;
		b=20;
		c=30;
	}
	
	void get() {
		System.out.println(i);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Variable obj = new Variable();
		obj.set();
		obj.get();
		}

}
