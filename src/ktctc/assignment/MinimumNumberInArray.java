package ktctc.assignment;

public class MinimumNumberInArray {

	public static void main(String[] args) {


		int arr[] = {100,35,50,60,75,80,100,90,120,55,25,75};
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum Number In Array Is: "+min);

	}

}
