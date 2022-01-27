package second.week.packagee;

public class NestedSwitchMethod {

	public static void main(String[] args) {
		// Switch method can used with int,char,string etc
		// In this statement once condition is matched it will come out of switch method
		// as we break it with break keyword
		//Switch statement inside switch is called as nested switch
		String book = "JAVA";
		String year = "LAST";
		switch (book) {
		case "Maths":
			System.out.println("You Have Selected Maths book");
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
			break;
		case "Science":
			System.out.println("You Have Selected Science book");
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
			break;
		case "History":
			System.out.println("You Have Selected History book");
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
			break;
		case "Python":
			System.out.println("You Have Selected Python book");
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
			break;
		case "English":
			System.out.println("You Have Selected English book");
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
			break;
		case "JAVA":
			System.out.println("You Have Selected JAVA book");
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
			break;
		case "OOPS":
			System.out.println("You Have Selected OOPS book");
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
			break;
		default:
			System.out.println("Selected book is not available");
			break;
		}

	}

}
