package sdet.java.interviewprograms;

public class P19FindDuplicatesInArray {

	public static void main(String[] args) {
		String str[] = {"ram","sham","karan","arjub","sith","gita"};
		int count = 0;
		boolean flag = false;
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					System.out.println("Duplicate Element in Array Is:"+str[i]);
					count++;
					flag = true;
				}
			}
		}
		if(flag==true) {
			System.out.println("Number Duplicate Elements Are "+count);
		}
		else {
			System.out.println("There Is No Duplicate In Array");
	}

	}
}
