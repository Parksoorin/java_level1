package 배열0_개념;

public class 배열_개념11_주소예제4 {
	public static void main(String[] args) {
		
		//int[][] darr = new int[3][3];		// 13개 
		int[][] darr = new int[3][];  		// 4개 
		
		int[] arr = {10,20,30};			
		darr[0] = arr;
		darr[1] = arr;
		darr[2] = arr; 
		
		//10,20,30
		//10,20,30
		//10,20,30
		
		//----------------------
		
		arr[1] = 100;
		
		if(darr[0] == darr[2]) {
			System.out.println("o");
		}else {
			System.out.println("x");
		}	

		//---------------------------------		
		int darr2[][] = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		// 13개
		int temp[][] = new int[3][];
		// 17개 
		temp[0] = darr2[1];
		temp[1] = darr2[2];
		temp[2] = darr2[0];
		
		for(int i = 0; i < 3; i++) {
			System.out.print(temp[0][i] + " ");
		}
		System.out.println();
		
		darr2[1] = null;
		
		for(int i = 0; i < 3; i++) {
			System.out.print(temp[1][i] + " ");
		}
		
	}
}
