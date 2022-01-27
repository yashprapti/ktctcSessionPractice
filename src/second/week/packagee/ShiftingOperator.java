package second.week.packagee;

public class ShiftingOperator {

	public static void main(String[] args) {
		//Shifting Operators are Left Shift(<<) Right Shift(>>)
		// Shfting operators returns int value
		int a = 4; // 0000 0000 0000 0000 0000 0000 0000 0100
		int b = a<<2; 
		// shifts bit by two at left and add two zeroes at right
		// 00 0000 0000 0000 0000 0000 0000 0100 00 = 16
		System.out.println(b);
		int c = a>>2;
		// shifts bit by two at right and add two zeroes at left
		// 00 0000 0000 0000 0000 0000 0000 0000 01 = 1
		System.out.println(c);

	}

}
