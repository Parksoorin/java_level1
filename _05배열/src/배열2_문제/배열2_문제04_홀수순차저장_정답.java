package 배열2_문제;

import java.util.Arrays;

/*
	[문제]
		arr배열 값 중 홀수만 배열c에 저장하시오.
		위치는 뒤에서부터 저장하시오.
	[정답]
		c = { 0, 0, 17, 51, 49 }
*/

public class 배열2_문제04_홀수순차저장_정답 {
	public static void main(String[] args) {
		
		int[] arr = {10, 49, 51, 36, 17};	
		int[] c = {0, 0, 0, 0, 0};
		
		int index = c.length - 1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 1) {
				c[index] = arr[i];
				index -= 1;
			}
		}
		System.out.println(Arrays.toString(c));
		
	}
}
