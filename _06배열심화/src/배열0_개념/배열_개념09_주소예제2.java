package 배열0_개념;

public class 배열_개념09_주소예제2 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30};
		
		int[][] darr = {
			{10,20,30},
			{20,30,40},
			{30,40,50}
		};
		
		darr[0] = arr;
		darr[1] = arr;
		darr[2] = arr;
		
		arr[1] = 100;
		
		// [문제] 아래 주석을 풀고 실행했을 때 어떤 값이 나올지 예상하고 주석을 푸시오.
		/*
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(darr[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
	}
}
