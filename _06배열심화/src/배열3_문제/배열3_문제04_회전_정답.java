package 배열3_문제;

import java.util.Scanner;

/*
	[문제]
		아래 명령어를 선택할 때마다
		block 배열을 90도 회전시키시오.
		[1.left_turn] [2.right_turn]
	[예시]
		입력 : 1
		
		4 8 12 16
		3 7 11 15
		2 6 10 14
		1 5 9  13
*/


public class 배열3_문제04_회전_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int[][] block = {
			{ 1,  2,  3,  4},
			{ 5,  6,  7,  8},
			{ 9, 10, 11, 12},
			{13, 14, 15, 16},
		};
		
		while(true) {
			for(int i=0; i<block.length; i++) {
				for(int j=0; j<block[i].length; j++) {
					System.out.printf("[%2d]", block[i][j]);
				}
				System.out.println();
			}
			
			System.out.println("[1.left_turn] [2.right_turn]");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				int[][] temp = new int[4][4];
				for(int i=0; i<4; i++) {
					for(int j=0; j<4; j++) {
						temp[j][i] = block[i][3-j];
					}
				}
				for(int i=0; i<4; i++) {
					for(int j=0; j<4; j++) {
						block[i][j] = temp[i][j];
					}
				}
			} else if(choice == 2) {
				int[][] temp = new int[4][4];
				for(int i=0; i<4; i++) {
					for(int j=0; j<4; j++) {
						temp[j][3-i] = block[i][j];
					}
				}
				for(int i=0; i<4; i++) {
					for(int j=0; j<4; j++) {
						block[i][j] = temp[i][j];
					}
				}
			}
		}
		
	}
}
