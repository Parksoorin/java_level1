package 배열0_개념;

import java.util.Arrays;
import java.util.Random;

/*
	# 중복숫자 금지 해결방법 3가지
		[방법1] 셔플(shuffle)
*/

public class 배열_개념02_중복숫자종류1 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		// 1부터 4사이의 랜덤 숫자를 중복없이 arr배열 저장
		int[] arr = new int[4];
		for(int i=0; i<4; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));
		// arr = [1, 2, 3, 4]
		
		for(int i=0; i<100; i++) {
			int r1 = ran.nextInt(4);	// r1 = 1
			int r2 = ran.nextInt(4);	// r2 = 3
			
			int temp = arr[r1];			// temp = 2
			arr[r1] = arr[r2];			// arr[1] = 4
			arr[r2] = temp;				// arr[3] = 2
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
