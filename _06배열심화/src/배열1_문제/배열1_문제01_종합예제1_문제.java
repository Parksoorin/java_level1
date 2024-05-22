package 배열1_문제;

import java.util.Arrays;

public class 배열1_문제01_종합예제1_문제 {
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		// [문제1] 인덱스 2개를 입력받아 값 출력
		// 예1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//	    값 출력 : 60 

		// [문제2] 값을 입력받아 인덱스 2개 출력
		// 예2) 값 입력 : 60
		//	    인덱스1 출력 : 1	인덱스2 출력 : 2
				
		// [문제3] 가장 큰 값의 인덱스 2개 출력
		// [정답3] 2 2
		
		// [문제4] 값 2개를 입력받아 값 교체
		
		
	}
}
