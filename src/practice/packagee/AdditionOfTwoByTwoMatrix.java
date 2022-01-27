package practice.packagee;

public class AdditionOfTwoByTwoMatrix {

	public static void main(String[] args) {
		
		//Addition of Two 2*2 Matrix
		int[][] arr = {{10,20},{30,40}};
		int[][] arr1 ={{50,60},{70,80}};
		
		int arr2[][] = new int[arr.length][arr[1].length];
		
		/*arr2[0][0] = (arr[0][0]+ arr1[0][0]);
		arr2[0][1] = (arr[0][1]+ arr1[0][1]);
		arr2[1][0] = (arr[1][0]+ arr1[1][0]);
		arr2[1][1] = (arr[1][1]+ arr1[1][1]);
		
		System.out.println(arr2[0][0]+" "+arr2[0][1]);
		System.out.print(arr2[1][0]+" "+arr2[1][1]);*/
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[1].length;j++){
				arr2[i][j] = arr[i][j]+arr1[i][j];
				System.out.print(" "+arr2[i][j]);
			}
			System.out.println();
		}
	}

}
