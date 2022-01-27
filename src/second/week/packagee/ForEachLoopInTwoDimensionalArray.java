package second.week.packagee;

public class ForEachLoopInTwoDimensionalArray {

	public static void main(String[] args) {
		int[][] arr = {{20,30},{40,50},{60,70},{80,90}};
		for(int a[]:arr) {
			for(int b:a) {
				System.out.println(b);
			}
		}

	}

}
