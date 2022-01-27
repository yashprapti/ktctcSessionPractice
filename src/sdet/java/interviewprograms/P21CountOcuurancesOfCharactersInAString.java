package sdet.java.interviewprograms;

public class P21CountOcuurancesOfCharactersInAString {

	public static void main(String[] args) {


		String str = "java Programming Java classes";
		int len = str.length();
		String newstr = str.replace("s", "");
		int newlen = newstr.length();
		int num = len-newlen;
		System.out.println("Number of times character s occures is "+num);

	}

}
