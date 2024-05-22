package 배열0_개념;

public class 배열_개념03_배열의주소개념2 {
	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		int c = 30;		
		int[] d = {10,20,30};
		
		
		int[] t1 = {1,2,3};
		int[] t2 = {4,5,6};
		int[] t3 = {7,8,9};
		int[][] t4 = new int[3][];
		t4[0] = t1;
		t4[1] = t2;
		t4[2] = t3;
				
		int[][] arr = new int[3][3]; // 변수 13개 그려져야된다. 
		System.out.println(arr[0]);		// [I@7852e922
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		System.out.println(arr[1]);		// [I@4e25154f
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		System.out.println(arr[2]);		// [I@70dea4e
		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;
		
		System.out.println(arr);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		
		int num = 10;
		int[] test = null;
		int[] temp = arr[1];
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i] + " ");
		}		
		
	}
}
