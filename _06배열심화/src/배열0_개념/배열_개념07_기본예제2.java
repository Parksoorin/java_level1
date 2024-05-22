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

public class 배열_개념07_기본예제2 {
	public static void main(String[] args) {
		
		int[][] classList = {
			 {10,54,65,22,15},
			 {65,14,24,75,25},
			 {50,45,25,87,49},
			 {11,66,5,21,95},
			 {70,84,64,21,11}
		};
	
		int[][] win = new int[3][];
		
		
		int[] index = new int[5];
		int[] total = new int[5];
		for(int i=0; i<classList.length; i++) {
			index[i] = i;
			for(int j=0; j<classList[i].length; j++) {
				total[i] += classList[i][j];
			}
		}
		
		for(int i=0; i<classList.length; i++) {
			int maxTotal = total[i];
			int maxIndex = i;
			for(int j=i; j<classList.length; j++) {
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
		
		System.out.println("index = " + Arrays.toString(index));
		System.out.println("total = " + Arrays.toString(total));
		
		for(int i=0; i<3; i++) {
			win[i] = classList[index[i]];
		}
		
		System.out.println("정답 >>>");
		for(int i=0; i<3; i++) {
			System.out.println(Arrays.toString(win[i]));
		}
		
	}
}
