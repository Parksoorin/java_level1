package 배열7_문제;

import java.util.Arrays;

/*
	[문제]
		arr배열 안의 값들 중에서 b배열의 값이 있으면
		각각 겹치는 값을 0으로 변경하시오.
		단, 겹치는 값이 여러개 있으면 전부 0으로 변경하시오.
	[정답]
		arr = {0, 0, 30, 40, 0}
		b   = {0, 3, 0, 0, 0, 50}
*/

public class 배열7_문제04_중복제거_정답 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,20};
		int[] b   = {10, 3,20,10,20,50};
		
		for(int i=0; i<arr.length; i++) {
			int check = -1;
			for(int j=0; j<b.length; j++) {
				if(arr[i] == b[j]) {
					b[j] = 0;
					check = arr[i];
				}
			}
			
			if(check != -1) {
				for(int j=0; j<arr.length; j++) {
					if(arr[j] == check) {
						arr[j] = 0;
					}
				}
			}
		}
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("b = " + Arrays.toString(b));
		
	}
}
