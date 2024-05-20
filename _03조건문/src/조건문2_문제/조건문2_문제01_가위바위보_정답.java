package 조건문2_문제;

import java.util.Scanner;

/*
	[문제] 가위(0) 바위(1) 보(2) 게임
		1. player1은 0~2 사이의 숫자를 입력받는다.
		2. player2는 0~2 사이의 숫자를 입력받는다.
		3. 가위, 바위, 보를 0, 1, 2, 숫자로 대신 표현한다.
		4. player1과 player2를 비교해서 "비김", "승리", "패배"를 출력한다.
*/

public class 조건문2_문제01_가위바위보_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("[player1] 0 ~ 2 입력 : ");
		int player1 = scan.nextInt();

		System.out.print("[player2] 0 ~ 2 입력 : ");
		int player2 = scan.nextInt();
		
		// 가위(0) 바위(1) 보(2)
		// 승리
		// 0				2
		// 1				0
		// 2				1
		if(player1 == player2) {
			System.out.println("비김");
		}
		
		if(player1 == 0 && player2 == 2) {
			System.out.println("player1 승리");
			System.out.println("player2 폐배");
		}
		if(player1 == 1 && player2 == 0) {
			System.out.println("player1 승리");
			System.out.println("player2 폐배");
		}
		if(player1 == 2 && player2 == 1) {
			System.out.println("player1 승리");
			System.out.println("player2 폐배");
		}
		
		if(player2 == 0 && player1 == 2) {
			System.out.println("player2 승리");
			System.out.println("player1 폐배");
		}
		if(player2 == 1 && player1 == 0) {
			System.out.println("player2 승리");
			System.out.println("player1 폐배");
		}
		if(player2 == 2 && player1 == 1) {
			System.out.println("player2 승리");
			System.out.println("player1 폐배");
		}
		
		scan.close();
		
	}
}