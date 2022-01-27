package second.week.packagee;

public class BitWiseOperator {

	public static void main(String[] args) {
		// Bitwise Operarors are AND(&) OR(|),EXOR(^)
		int a = 4; // 0000 0000 0000 0000 0000 0000 0000 0100 
		int b = 6;  //0000 0000 0000 0000 0000 0000 0000 0110
		int c = a&b;  // 0000 0000 0000 0000 0000 0000 0000 0100 = 4
		System.out.println(c);
		int d = a|b;  //0000 0000 0000 0000 0000 0000 0000 0110 = 6
		System.out.println(d);
			
		
	}

}
