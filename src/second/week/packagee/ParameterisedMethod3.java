package second.week.packagee;

public class ParameterisedMethod3 {

	public void examRecord(String name, int marks) {

		if (marks < 35) {
			System.out.println(name + " :is Failed");
		} else if (marks == 35) {
			System.out.println(name + " :is Just Passed");
		} else if (marks > 35 && marks < 60) {
			System.out.println(name + " :Is Passed In Second Class");
		} else if (marks >= 60 && marks < 75) {
			System.out.println(name + " :is Passed in Distinction");
		} else {
			System.out.println(name + " :is Passed in Merit");
		}
	}

	public static void main(String[] args) {
		ParameterisedMethod3 obj1 = new ParameterisedMethod3();
		obj1.examRecord("Ram", 28);
		ParameterisedMethod3 obj2 = new ParameterisedMethod3();
		obj2.examRecord("Sahil", 42);
		ParameterisedMethod3 obj3 = new ParameterisedMethod3();
		obj3.examRecord("Shreyas", 62);
		ParameterisedMethod3 obj4 = new ParameterisedMethod3();
		obj4.examRecord("Priya", 75);
		ParameterisedMethod3 obj5 = new ParameterisedMethod3();
		obj5.examRecord("Varsha", 82);

	}

}
