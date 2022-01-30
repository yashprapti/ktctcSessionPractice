package ktctc.assignment;

public class AverageOfNumbers {

	public static void main(String[] args) {

		int arr[] = { 12, 13 };
		int n = arr.length;
		float arrsum = 0;
		for (int i = 0; i < n; i++) {
			arrsum = arrsum + arr[i];
		}
		float result = arrsum / n;
		System.out.println("Average of Given Numbers Is " + result);
	}
}
