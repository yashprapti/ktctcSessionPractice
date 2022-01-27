package second.week.packagee;

public class ArrayDeclarationMethod1 {

	public static void main(String[] args) {
		
		int arr[] = new int[3];
		arr[0] = 23;
		arr[1] = 45;
		arr[2] = 60;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr[2]);
		arr[2]=65;
		System.out.println(arr[2]);

	}

}
