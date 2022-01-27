package second.week.packagee;

public class SwitchMethodWithString {

	public static void main(String[] args) {
		// Switch method can used with int,char,string etc
		// In this statement once condition is matched it will come out of switch method
		// as we break it with break keyword
		String book = "Hindi";
		switch (book) {
		case "Maths":
			System.out.println("Maths book Price is 250");
			break;
		case "Science":
			System.out.println("Science book Price is 1000");
			break;
		case "History":
			System.out.println("History book Price is 350");
			break;
		case "Python":
			System.out.println("Python book Price is 450");
			break;
		case "English":
			System.out.println("English book Price is 200");
			break;
		case "JAVA":
			System.out.println("JAVA book Price is 650");
			break;
		case "OOPS":
			System.out.println("OOPS book Price is 150");
			break;
		default:
			System.out.println("Selected book is not available");
			break;
		}

	}

}
