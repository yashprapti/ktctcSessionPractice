package ktctc.assignment;

public class FindNumberOfVowelsAndConsonentsInArray {

	public static void main(String[] args) {

		int vowelcount = 0;
		int concount = 0;
		char charr[] = { 'a', 'k', 'b', 'A', 'e', 'E', ':', 'N', 'L', 'i', 'u' };
		for (char ch : charr) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelcount++;
			} else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				vowelcount++;
			} else {
				concount++;
			}
		}
		System.out.println("Total Number of Vowels In Array are: " + vowelcount);
		System.out.println("Total Number of Consonents In Array are: " + concount);

	}

}
