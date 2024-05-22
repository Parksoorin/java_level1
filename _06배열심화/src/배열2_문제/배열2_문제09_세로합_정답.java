package 배열2_문제;

import java.util.Arrays;

/*
	[문제] 
		data배열의 세로 값들의 합을 sumList배열에 저장하시오.
	[정답] 
		sumList = {10, 9, 13, 3, 16}
 */

public class 배열2_문제09_세로합_정답 {
	public static void main(String[] args) {
		
		int[][] data = {
		    {0,0,0,0,0},
			{0,0,0,0,3},
			{0,2,0,0,3},
			{3,1,3,0,1},
			{1,4,2,0,2},
			{4,1,4,0,4},
			{2,1,4,3,3}
		};	
		
		int[] sumList = {0,0,0,0,0};
		
		for(int i=0; i<sumList.length; i++) {
			int total = 0;
			for(int j=0; j<data.length; j++) {
				total += data[j][i];
			}
			sumList[i] = total;
		}
		System.out.println(Arrays.toString(sumList));
		
	}
}
