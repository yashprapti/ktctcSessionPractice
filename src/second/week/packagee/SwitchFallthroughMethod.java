package second.week.packagee;

public class SwitchFallthroughMethod {

	public static void main(String[] args) {
		// Without Break Keyword Switch Method is called as Switch Fall Through method
		//Switch method can used with int,char,string etc
		//In this statement once condition is matched it will execute all statements after matched condition
		
		int i = 6;
		switch (i) {
		case 1:System.out.println("you Have Selected Number 1");
		case 2:System.out.println("you Have Selected Number 2");
		case 3:System.out.println("you Have Selected Number 3");
		case 4:System.out.println("you Have Selected Number 4");
		case 5:System.out.println("you Have Selected Number 5");
		default: System.out.println("Wrong Number Selection");
			
		}

	}

}
