package first.Week.Package;

public class ObjectCallingThroughMethod {

	String name;
	int age;
	int weight;
	
	public void set(String name,int age,int weight) {
		this.name= name;
		this.age = age;
		this.weight = weight;
	}
	public void get() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
	}
	
	public static void main(String[] args) {
		ObjectCallingThroughMethod obj = new ObjectCallingThroughMethod();
		obj.set("Sanket", 20, 50);
		obj.get();
		ObjectCallingThroughMethod obj1 = new ObjectCallingThroughMethod();
		obj1.set("priya", 32, 48);
		obj1.get();
		

	}

}
