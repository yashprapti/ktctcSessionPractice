package fourth.week.Package;

public class ParameterisedConstructor {
	
	int roll;
	String name;
	long salary;
	
	public ParameterisedConstructor(int a,String str) {
		roll=a;
		name=str;
	}
	public ParameterisedConstructor(String str,int a) {
		roll=a;
		name=str;
	}
	public ParameterisedConstructor(int a,int b) {
		roll=a;
		salary=b;
		
	}
	public ParameterisedConstructor(int a,long b) {
		roll=a;
		salary=b;
	}
	public void  display() {
		System.out.println(roll);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		ParameterisedConstructor obj = new ParameterisedConstructor(1,"ram");
		ParameterisedConstructor obj1 = new ParameterisedConstructor(1,5);
		obj1.display();
	

	}

}
