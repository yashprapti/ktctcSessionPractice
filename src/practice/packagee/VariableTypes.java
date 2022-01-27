package practice.packagee;

public class VariableTypes {
	int age;               // Instance Variable
	String name;
	static String division;    //static Variable

	public void nonstaticmethod() {
		System.out.println(age);
		System.out.println(division);
		VariableTypes.staticmethod();
	}
	
	public static void staticmethod() {
		System.out.println(division);
		
		
		
	}
	
    public static void main(String[] args) {
    	
    	VariableTypes obj = new VariableTypes();
    	obj.age=20;
    	obj.nonstaticmethod();
    	

	}

}
