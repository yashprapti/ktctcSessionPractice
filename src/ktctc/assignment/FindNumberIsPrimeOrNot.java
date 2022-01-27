package ktctc.assignment;

public class FindNumberIsPrimeOrNot {

	public static void main(String[] args) {
		
		int number = 20;
		for(int i=3;i<number/2;i++) {
			if(number%i==0) {
				System.out.println(i+"Given Number Is Not Prime");
				
			}else {
				i++;
				
			}
		}


	}

}
