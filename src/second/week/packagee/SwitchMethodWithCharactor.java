package second.week.packagee;

public class SwitchMethodWithCharactor {

	public static void main(String[] args) {
		// Switch method can used with int,char,string etc
		// In this statement once condition is matched it will come out of switch method
		// as we break it with break keyword

		char ch = 'P';
		switch (ch) {
		case 'a':
			System.out.println("you Have Selected Vowel");
			break;
		case 'e':
			System.out.println("you Have Selected Vowel");
			break;
		case 'i':
			System.out.println("you Have Selected Vowel");
			break;
		case 'o':
			System.out.println("you Have Selected Vowel");
			break;
		case 'u':
			System.out.println("you Have Selected Vowel");
			break;
		case 'A':
			System.out.println("you Have Selected Vowel");
			break;
		case 'E':
			System.out.println("you Have Selected Vowel");
			break;
		case 'I':
			System.out.println("you Have Selected Vowel");
			break;
		case 'O':
			System.out.println("you Have Selected Vowel");
			break;
		case 'U':
			System.out.println("you Have Selected Vowel");
			break;
		default:
			System.out.println("you Have Selected Consonent");
			break;
		}

	}

}
