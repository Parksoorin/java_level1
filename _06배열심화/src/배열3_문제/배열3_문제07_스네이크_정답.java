package 배열3_문제;

import java.util.Scanner;

/*
	[문제]
		1. 10x10 배열을 생성한다.
		2. 스네이크는 1234로 표시한다.
		3. 머리는 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
		4. 자기 몸하고 부딪히면, 사망한다.
		5. 랜덤으로 아이템을 생성해
		   아이템을 먹으면 꼬리가 1개 자란다.
		6. 꼬리는 최대 8개까지 증가할 수 있다.
 */

public class 배열3_문제07_스네이크_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] map = new int[10][10];
		
		int snakeSize = 4;
		int[] y = new int[snakeSize];
		int[] x = new int[snakeSize];
		
		for(int i=0; i<snakeSize; i++) {
			x[i] = i;
			map[y[i]][x[i]] = i + 1;
		}
		
		while(true) {
			for(int i=0; i<10; i++) {
				for(int j=0; j<10; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println("     ↑(5)");
			System.out.println("←(1) ↓(2) →(3)");
			int move = scan.nextInt();
			
			int tempY = y[0];
			int tempX = x[0];
			
			if(move == 1) { tempX -= 1; }
			else if(move == 2) { tempY += 1; }
			else if(move == 3) { tempX += 1; }
			else if(move == 5) { tempY -= 1; }
			
			if(10 <= tempY || tempY < 0) continue;
			if(10 <= tempX || tempX < 0) continue;
			if(map[tempY][tempX] != 0) continue;
			
			for(int i=0; i<snakeSize; i++) {
				map[y[i]][x[i]] = 0;
			}
			
			for(int i=snakeSize - 1; i>0; i--) {
				y[i] = y[i - 1];
				x[i] = x[i - 1];
			}
			y[0] = tempY;
			x[0] = tempX;
			
			for(int i=0; i<snakeSize; i++) {
				map[y[i]][x[i]] = i + 1;
			}
		}
	}
}
