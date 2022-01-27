package second.week.packagee;

public class ForLoopExample {

	public static void main(String[] args) {
		// print 1 to 10 using for loop
		
		for(int i=1;i<=10;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		
		char[] charr = {'a','k','e','h','m','n'};
		for(int i=0;i<charr.length;i++) {
			System.out.print(charr[i]);
		}
		
		// print 1 to 10 using for loop in reverse order
		
		System.out.println();
		System.out.println("-----------------------------------------");
		
		for(int i=10;i>=1;i--) {
			System.out.print(i);
		}
		
		
		
	}

}
