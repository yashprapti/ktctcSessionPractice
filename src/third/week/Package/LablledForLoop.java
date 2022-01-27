package third.week.Package;

public class LablledForLoop {

	public static void main(String[] args) {
		aa:for(int i =1;i<=10;i++) {
			bb:for(int j=1;j<=10;j++) {
				System.out.println("Value of i is: "+i);
				if(i==3&&j==5) {
					System.out.println("Value of J is: "+j);
					break aa;
				}
			}
		}
	}

}
