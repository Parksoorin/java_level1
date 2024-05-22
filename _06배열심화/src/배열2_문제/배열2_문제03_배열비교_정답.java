package 배열2_문제;

import java.util.Arrays;

/*
	[문제]
		result배열 안에 arr의 값이 있으면
		result배열의 값을 0으로 변경하시오.
	[정답]
		result = {0, 2, 54, 0, 0}
*/

public class 배열2_문제03_배열비교_정답 {
	public static void main(String[] args) {
		
		int[][] arr = {
			{10,20,30},
			{40,50,60},
			{70,80,90},
		};
		
		int[] result = {10,2,54,90,50};
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<arr[j].length; k++) {
					if(result[i] == arr[j][k]) {
						result[i] = 0;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(result));
		
	}
}
