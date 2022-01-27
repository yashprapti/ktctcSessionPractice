package practice.packagee;

public class PracticeClass {

	int id;
	String name;
    static String company = "itr"; 
	
	public PracticeClass(int id,String name) {
		this.id=id;
		this.name=name;
		}
	public void get() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		PracticeClass obj = new PracticeClass(10,"ram");
		obj.get();
		PracticeClass obj1 = new PracticeClass(20,"Sham");
		obj1.get();
		
	}

}
