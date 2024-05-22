package 배열0_개념;

import java.util.Arrays;

/*
	[문제]
		아래 class1부터 class5 배열은 각 반의 시험점수를 저장한 것이다.
		각 반의 총점이 높은 순서대로 세 반을 뽑아서 win배열에 저장 후,
		win배열의 모든 내용을 출력하시오.
	[정답]
		win = 
			[50, 45, 25, 87, 49]
			[70, 84, 64, 21, 11]
			[65, 14, 24, 75, 25]	
*/

public class 배열_개념06_기본예제1 {
	public static void main(String[] args) {
		
		int[] class1 = {10,54,65,22,15};
		int[] class2 = {65,14,24,75,25};
		int[] class3 = {50,45,25,87,49};
		int[] class4 = {11,66,5,21,95};
		int[] class5 = {70,84,64,21,11};
	
		int[][] win = new int[3][];
		
		int[][] data = new int[5][];
		data[0] = class1;
		data[1] = class2;
		data[2] = class3;
		data[3] = class4;
		data[4] = class5;
		
		int[] index = new int[5];
		int[] total = new int[5];
		
		for(int i=0; i<5; i++) {
			index[i] = i;
			for(int j=0; j<5; j++) {
				total[i] += data[i][j];
			}
		}
		System.out.println("정렬 전 >>>");
		System.out.println("index = " + Arrays.toString(index));
		System.out.println("total = " + Arrays.toString(total));

		// 정렬하기
		for(int i=0; i<5; i++) {
			int maxTotal = total[i];
			int maxIndex = i;
			for(int j=i; j<5; j++) {
				if(maxTotal < total[j]) {
					maxTotal = total[j];
					maxIndex = j;
				}
			}
			int temp = total[i];
			total[i] = total[maxIndex];
			total[maxIndex] = temp;
			
			temp = index[i];
			index[i] = index[maxIndex];
			index[maxIndex] = temp;
		}
		System.out.println("정렬 후 >>>");
		System.out.println("index = " + Arrays.toString(index));
		System.out.println("total = " + Arrays.toString(total));
	
		for(int i=0; i<3; i++) {
			win[i] = data[index[i]];
		}
		
		for(int i=0; i<3; i++) {
			System.out.println(Arrays.toString(win[i]));
		}
		
	}
}
