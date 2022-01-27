package first.Week.Package;

public class ObjectCreation0501 {
	
	public void sample() {
		System.out.println("I am not main");
	}

	public static void main(String[] args) {
		ObjectCreation0501 obj = new ObjectCreation0501();
		obj.sample();
				
		System.out.println("I am Main Method");
		
	}

}
