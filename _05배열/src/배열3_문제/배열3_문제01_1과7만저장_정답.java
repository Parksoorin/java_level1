package 배열3_문제;

import java.util.Arrays;
import java.util.Random;

/*
	[문제]
		arr배열 안에 1 또는 7만 랜덤으로 저장 후 출력하시오.
	[예시]
		arr = {7, 1, 7, 7, 1, 1, 1}
*/

public class 배열3_문제01_1과7만저장_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = new int[7];
		
		for(int i=0; i<arr.length; i++) {
			int r = ran.nextInt(2);
				
			if(r == 0) {
				arr[i] = 7;
			} else {
				arr[i] = 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
