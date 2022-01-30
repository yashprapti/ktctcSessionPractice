package sdet.practice1.interviewprogrammes;

public class NumberofVowlesAndConsonentsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Public Place";
		char ch[] = str.toCharArray();
		int vowelcount = 0;
		int concount = 0;
		for(char c :ch) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowelcount++;
			}else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				vowelcount++;
			}else {
				concount++;
			}
		}
		System.out.println("Vowel Count "+vowelcount);
		System.out.println("Consonent Count "+concount);

	}

}
