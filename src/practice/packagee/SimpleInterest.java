package practice.packagee;

public class SimpleInterest {
	
	// p=Principle Amount; r=Rate of Interest, t= Duration in years

	public void siCalculator(int p,float r,float t) {
		double A = (p*r*t)/100;
		System.out.println("Simple Interest on Principle Amount is="+A); 
	}
	
	
	public static void main(String[] args) {
		SimpleInterest obj = new SimpleInterest();
		obj.siCalculator(100000, 8.5f, 1);
		

	}

}
