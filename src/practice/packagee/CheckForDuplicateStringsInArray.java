package practice.packagee;

public class CheckForDuplicateStringsInArray {

	public static void main(String[] args) {
		
		boolean flag = false;
		String str[] = {"Ram","Sham","Seeta","Gita","Ganesh","Babita","Gita"};
		for(int i = 0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j]) {
					System.out.println("Available Duplicate String Is: "+str[i]);
					flag = true;
				}
			}
		}
		if(flag==false) {
			System.out.println("Duplicate String Is Not Available In Array");
		}

	}

}
