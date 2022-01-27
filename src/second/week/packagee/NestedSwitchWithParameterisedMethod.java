package second.week.packagee;

public class NestedSwitchWithParameterisedMethod {
	
	public void selectYear(String year) {
		switch (year) {
		case "First":
			System.out.println("First year book price is 200 ");
			break;
		case "Second":
			System.out.println("Second year book price is 300 ");
			break;
		case "Third":
			System.out.println("Third year book price is 400 ");
			break;
		case "Final":
			System.out.println("Final year book price is 500 ");
			break;
		default:
			System.out.println("Selected year is not correct");
			break;
		}
	}

	public static void main(String[] args) {
		NestedSwitchWithParameterisedMethod obj = new NestedSwitchWithParameterisedMethod();
		String book = "JAVA";
		switch (book) {
		case "JAVA":
			System.out.println("you have Selected JAVA book");
			obj.selectYear("First");
			break;
		case "Python":
			System.out.println("you have Selected Python book");
			obj.selectYear("Second");
			break;

		default:
			System.out.println("Selected Book is not Available");
			break;
		}

	}

}
