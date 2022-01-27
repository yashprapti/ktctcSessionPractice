package second.week.packagee;

public class SwitchStatement {

	public static void main(String[] args) {
		//Switch method can used with int,char,string etc
		//In this statement once condition is matched it will come out of switch method as we break it with break keyword
				

		int i = 2;
		switch (i) {
		case 1:System.out.println("you Have Selected Number 1");break;
		case 2:System.out.println("you Have Selected Number 2");break;
		case 3:System.out.println("you Have Selected Number 3");break;
		case 4:System.out.println("you Have Selected Number 4");break;
		case 5:System.out.println("you Have Selected Number 5");break;
		default: System.out.println("Wrong Number Selection");break;
	}

}
}
