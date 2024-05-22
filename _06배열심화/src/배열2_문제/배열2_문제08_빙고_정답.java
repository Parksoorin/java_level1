package 배열2_문제;

import java.util.Arrays;
import java.util.Random;

/*
	[문제]
		아래 배열에 숫자1 또는 숫자2를 랜덤으로 가득 채운다.
		가로 세로 대각선이 연속으로 한 줄이 되면 빙고이다.
		각 숫자별로 빙고가 몇 개인지 출력하시오.
	[예시]
 	  	1122
 	  	2122
 	  	1112
 	  	2111
 	  
 	  	빙고 1 : 2개
	  	빙고 2 : 0개			
*/

public class 배열2_문제08_빙고_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int size = 4;
		
		int[][] bingo = new int[size][size];
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				bingo[i][j] = ran.nextInt(2) + 1;
			}
		}
		
		/*
		int[][] bingo = {
			[2, 2, 1, 1]
			[2, 1, 2, 2]
			[2, 1, 2, 1]
			[2, 2, 2, 1]
		};
		 */
		
		for(int i=0; i<size; i++) {
			System.out.println(Arrays.toString(bingo[i]));
		}
		
		int bingo1 = 0;
		int bingo2 = 0;
		// 가로
		for(int i=0; i<size; i++) {
			int count1 = 0;
			int count2 = 0;
			for(int j=0; j<size; j++) {
				if(bingo[i][j] == 1) {
					count1 += 1;
				}
				if(bingo[i][j] == 2) {
					count2 += 1;
				}
			}
			
			if(count1 == size) bingo1 += 1;
			if(count2 == size) bingo2 += 1;
		}
		
		// 세로
		for(int i=0; i<size; i++) {
			int count1 = 0;
			int count2 = 0;
			for(int j=0; j<size; j++) {
				if(bingo[j][i] == 1) {
					count1 += 1;
				}
				if(bingo[j][i] == 2) {
					count2 += 1;
				}
			}
			if(count1 == size) bingo1 += 1;
			if(count2 == size) bingo2 += 1;
		}
		
		// 대각선 \
		if(bingo[0][0] == 1 && bingo[1][1] == 1 && bingo[2][2] == 1 && bingo[3][3] == 1) bingo1 += 1;
		if(bingo[0][0] == 2 && bingo[1][1] == 2 && bingo[2][2] == 2 && bingo[3][3] == 2) bingo2 += 1;
		
		// 대각선 /
		if(bingo[3][3] == 1 && bingo[1][2] == 1 && bingo[2][1] == 1 && bingo[3][0] == 1) bingo1 += 1;
		if(bingo[3][3] == 2 && bingo[1][2] == 2 && bingo[2][1] == 2 && bingo[3][0] == 2) bingo2 += 1;
		
		System.out.println("빙고1 : " + bingo1 + "개");
		System.out.println("빙고2 : " + bingo2 + "개");
		
	}
}
