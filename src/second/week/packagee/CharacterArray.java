package second.week.packagee;

import java.util.Arrays;

public class CharacterArray {

	public static void main(String[] args) {
		
		char[] charr = {'a','e','i','o','u'};
		char[] charr1 = {'a','e','i','o','u'};
		int len = charr.length;
		System.out.println(len);
		boolean flag = Arrays.equals(charr, charr1);
		System.out.println(flag);

	}

}
