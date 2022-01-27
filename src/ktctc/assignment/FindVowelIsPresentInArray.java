package ktctc.assignment;

public class FindVowelIsPresentInArray {

	public static void main(String[] args) {

		char charr[] = { 'a', 'k', 'b', 'A', 'e', 'E', ':', 'N', 'L' };
		for (char ch : charr) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + " This Vowel Is Present In Array");
			} else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println(ch + " This Vowel Is Present In Array");
			}
		}

	}

}
