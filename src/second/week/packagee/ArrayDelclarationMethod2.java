package second.week.packagee;

public class ArrayDelclarationMethod2 {

	public static void main(String[] args) {
		
		
		int arr[] = {23,45,60};
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr[1]);
		arr[1] = 65;
		System.out.println(arr[1]);
	}

}
