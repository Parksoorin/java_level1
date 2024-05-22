package 배열3_문제;

import java.util.Random;
import java.util.Scanner;

/*
	[문제]
		1. 1부터 50사이의 랜덤 숫자 25개를 중복없이 bingo에 저장한다.
		2. 행과 열을 입력받아 숫자를 선택한다.
		3. 가로, 세로, 대각선으로 한 줄을 선택하면, 빙고로 게임은 종료된다.
*/

public class 배열3_문제01_빙고게임_문제 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int maxNum = 5;
		
		int[][] bingo = new int[maxNum][maxNum];
		int[][] mark = new int[maxNum][maxNum];
		
		scan.close();
		
	}
}
