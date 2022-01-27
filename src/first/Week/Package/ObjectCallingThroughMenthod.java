package first.Week.Package;

public class ObjectCallingThroughMenthod {

	int age; 
	static final int MAX_AGE = 18;    
	public int getAge() {   
		return age; 
		}  
 void setAge(int age) 
 {  
	 this.age = age;
	 } 
 public static void main(String[] args) {  
	 ObjectCallingThroughMenthod obj1 = new ObjectCallingThroughMenthod(); 
	 obj1.setAge(4);  
	 obj1.getAge(); 
	 System.out.println(obj1.getAge());
	 ObjectCallingThroughMenthod obj2 = new ObjectCallingThroughMenthod();   
	 obj2.setAge(6);   
	 obj2.getAge(); 
	 System.out.println(obj2.getAge());
	 } 
		}


