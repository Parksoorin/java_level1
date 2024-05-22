package 배열3_문제;

import java.util.Random;
import java.util.Scanner;

/*
	[문제]
		1. 1부터 50사이의 랜덤 숫자 25개를 중복없이 bingo에 저장한다.
		2. 행과 열을 입력받아 숫자를 선택한다.
		3. 가로, 세로, 대각선으로 한 줄을 선택하면, 빙고로 게임은 종료된다.
*/

public class 배열3_문제01_빙고게임_정답 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int maxNum = 5;
		
		int[][] bingo = new int[maxNum][maxNum];
		int[][] mark = new int[maxNum][maxNum];
		
		boolean win = false;
		
		// 1부터 50사이의 숫자 25개를 중복없이 bingo배열에 저장
		int[] temp = new int[maxNum * maxNum];
		for(int i=0; i<temp.length; i++) {
			int r = ran.nextInt(50) + 1;
			
			boolean check = false;
			for(int j=0; j<i; j++) {
				if(r == temp[j]) {
					check = true;
					break;
				}
			}
			
			if(check == false) {
				temp[i] = r;
			} else {
				i -= 1;
			}
		}
		
		int index = 0;
		for(int i=0; i<maxNum; i++) {
			for(int j=0; j<maxNum; j++) {
				bingo[i][j] = temp[index];
				index += 1;
			}
		}
		
		// 게임 시작
		while(true) {
			// 화면 출력
			for(int i=0; i<maxNum; i++) {
				for(int j=0; j<maxNum; j++) {
					if(mark[i][j] == 1) {
						System.err.printf("[%2d]", bingo[i][j]);
					} else {
						System.out.printf("[%2d]", bingo[i][j]);
					}
				}
				System.out.println();
			}
			System.out.println();
			
			// 게임 종료
			if(win) {
				System.out.println("빙고!");
				break;
			}
			
			// 위치 선택
			System.out.print("인덱스1 입력 : ");
			int y = scan.nextInt();
			System.out.print("인덱스2 입력 : ");
			int x = scan.nextInt();
			
			if(mark[y][x] == 0) {
				mark[y][x] = 1;
			}
			
			// 가로 검사
			for(int i=0; i<maxNum; i++) {
				int count = 0;
				for(int j=0; j<maxNum; j++) {
					if(mark[i][j] == 1) {
						count += 1;
					}
				}
				if(count == maxNum) {
					win = true;
				}
			}
			
			// 세로 검사
			for(int i=0; i<maxNum; i++) {
				int count = 0;
				for(int j=0; j<maxNum; j++) {
					if(mark[j][i] == 1) {
						count += 1;
					}
				}
				if(count == maxNum) {
					win = true;
				}
			}
			
			// 대각선 \ 검사
			int count = 0;
			for(int i=0; i<maxNum; i++) {
				if(mark[i][i] == 1) {
					count += 1;
				}
			}
			if(count == maxNum) {
				win = true;
			}
			
			// 대각선 / 검사
			count = 0;
			for(int i=0; i<maxNum; i++) {
				if(mark[i][maxNum - 1 - i] == 1) {
					count += 1;
				}
			}
			if(count == maxNum) {
				win = true;
			}
			
		}
		
		scan.close();
		
	}
}






