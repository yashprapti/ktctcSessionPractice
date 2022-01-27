package sdet.java.interviewprograms;

import java.util.Arrays;

public class P16CheckEqualityOfAnArray {

	public static void main(String[] args) {
		// Approach 1 : Using Arrays Class
		
		/*int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,3,4,10};
		boolean result = Arrays.equals(a1, a2);
		if(result==true) {
			System.out.println("Arrays Are Equal");
		}else {
			System.out.println("Arrays Are Not Equal");
		}*/
		
		// Approach 2 : Build Some Logic
		
		int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,3,4,5};
		int l1 = a1.length;
		int l2 = a2.length;
		boolean flag = true;
		if(l1==l2) {
			for(int i=0;i<l1;i++) {
				if(a1[i]!=a2[i]) {
					flag = false;
					break;
				}
			}
			
		}else {
			flag = false;
		}
		if(flag==true) {
			System.out.println("Arrays Are Equal");
		}else {
			System.out.println("Arrays Are Not Equal");
		}
		
	}

}
