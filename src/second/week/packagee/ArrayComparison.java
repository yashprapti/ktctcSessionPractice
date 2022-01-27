package second.week.packagee;

import java.util.Arrays;

public class ArrayComparison {

	public static void main(String[] args) {
		
		int a[] = {23,45,60};
		int b[] = {23,45,60};
		int c[] = a;
		System.out.println(a==b);
		System.out.println(a==c);
		boolean flag = Arrays.equals(a, b);
		System.out.println(flag);
		
		
		

	}

}
