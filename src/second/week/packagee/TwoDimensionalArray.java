package second.week.packagee;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// Two Dimensional Array is nothing but array inside array
		// For Two Dimensional Array we can not use .equals and .sort method directly
		
		int[][] arr = {{20,30},{40,50},{60,70},{80,90}};
		int len = arr.length; // Gives the length of outer array
		System.out.println(len); // Prints 4
		System.out.println(arr[1].length); // This prints the length of array at index 1 here it is 2
		System.out.println(arr[3][1]); // This will print Outer Array 3rd index and inner array 1st index value i.e 90

	}

}
