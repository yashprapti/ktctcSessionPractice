package first.Week.Package;

public class ClassAndObject0601 {

	String name;
	int age;
	float weight;
	boolean veg;	
	
	public void canTalk() {
		System.out.println("Human Can Talk");
	}
	public void canRun() {
		System.out.println("Human Can Run");
	}
	
	public void isVegiterian() {
		System.out.println(veg);
	}
	
	
	
	public static void main(String[] args) {
		
		ClassAndObject0601 obj = new ClassAndObject0601();
		obj.name = "Sanket";
		obj.age = 25;
		obj.weight = 56.8f;
		ClassAndObject0601 obj1 = new ClassAndObject0601();
		obj1.name = "Prapti";
		obj1.age = 22;
		obj1.weight = 45.34f;
		obj1.veg = true;
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.weight);
		System.out.println(obj.veg);
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.weight);
		System.out.println(obj1.veg);
		obj.canRun();
		obj.canTalk();
		obj.isVegiterian();
		obj1.isVegiterian();
				
		

	}

}
