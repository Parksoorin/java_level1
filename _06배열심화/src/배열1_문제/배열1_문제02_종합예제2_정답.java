package 배열1_문제;

import java.util.Arrays;

public class 배열1_문제02_종합예제2_정답 {
	public static void main(String[] args) {
		
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		}; 
			
		int[] garo = new int[3];
		int[] sero = new int[4];
		
		// [문제1] 가로 합 출력
		// [정답1] garo = {410, 810, 1210}
		
		/*
			i = 0
				j = 0	total = 0   + 101
				j = 1	total = 101 + 102
				j = 2	total = 203 + 103
				j = 3	total = 306 + 104
				garo[0] = 410
			i = 1
				j = 0	total = 0   + 201
				j = 1	total = 201 + 202
				j = 2	total = 403 + 203
				j = 3	total = 606 + 204
				garo[1] = 810
			i = 2
				j = 0	total = 0   + 301
				j = 1	total = 301 + 302
				j = 2	total = 603 + 303
				j = 3	total = 906 + 304
				garo[2] = 1210 
		 */
		
		for(int i=0; i<arr.length; i++) {
			int total = 0;
			for(int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
			}
			garo[i] = total;
		}
		System.out.println(Arrays.toString(garo));
			
		// [문제2] 세로 합 출력
		// [정답2] sero = {603, 606, 609, 612}
		
		/*
			i = 0
				j = 0	sero[0] = 0   + 101
				j = 1	sero[1] = 0   + 102
				j = 2	sero[2] = 0   + 103
				j = 3	sero[3] = 0   + 104
			i = 1
				j = 0	sero[0] = 101 + 201
				j = 1	sero[1] = 102 + 202
				j = 2	sero[2] = 103 + 203
				j = 3	sero[3] = 104 + 204
			i = 2
				j = 0	sero[0] = 302 + 301
				j = 1	sero[1] = 304 + 302
				j = 2	sero[2] = 306 + 303
				j = 3	sero[3] = 308 + 304
		 */
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sero[j] += arr[i][j];
			}
		}
		System.out.println(Arrays.toString(sero));
		
	}
}











