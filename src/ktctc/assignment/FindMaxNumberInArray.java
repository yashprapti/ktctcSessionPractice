package ktctc.assignment;

public class FindMaxNumberInArray {

	public static void main(String[] args) {


		int arr[] = {120,30,20,50,150,80,05,25,100,50};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Max Number In Array is: "+max);

	}

}
