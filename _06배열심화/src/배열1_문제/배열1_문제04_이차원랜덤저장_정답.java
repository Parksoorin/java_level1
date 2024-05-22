package 배열1_문제;

import java.util.Arrays;
import java.util.Random;

/*
	[문제]
		darr배열에 1~50 사이의 숫자 중
		25개만 중복되지 않게 저장 후 출력하시오.
*/

public class 배열1_문제04_이차원랜덤저장_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int maxNum = 5;
		int[][] darr = new int[maxNum][maxNum];
		
		int[] arr = new int[maxNum * maxNum];
		
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			int r = ran.nextInt(50) + 1;
			
			boolean check = true;
			for(int j=0; j<index; j++) {
				if(r == arr[j]) {
					check = false;
					break;
				}
			}
			
			if(check) {
				arr[index] = r;
				index += 1;
			} else {
				i -= 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		index = 0;
		for(int i=0; i<darr.length; i++) {
			for(int j=0; j<darr[i].length; j++) {
				darr[i][j] = arr[index];
				index += 1;
			}
		}
		for(int i=0; i<darr.length; i++) {
			System.out.println(Arrays.toString(darr[i]));
		}
		
	}
}
