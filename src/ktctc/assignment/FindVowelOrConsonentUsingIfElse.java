package ktctc.assignment;

public class FindVowelOrConsonentUsingIfElse {

	public static void main(String[] args) {

		char ch = 'k';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Selected character ic Vowel");
		} else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println("Selected character is Vowel");
		} else {
			System.out.println("Selected character is Consonent");
		}

	}

}
