package 반복문2_문제;

import java.util.Random;
import java.util.Scanner;

/*
	[문제]
		1. 랜덤 구구단 게임을 10회 반복한다.
		2. 정답을 맞추면 1문제 당 10점이다.
		3. 게임 종료 후, 성적을 출력한다.
		4. 단, 3회 틀리면 게임을 즉시 종료하여, 0점이 된다.
*/

public class 반복문2_문제01_랜덤구구단게임_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int wrongCount = 0;		// 오답 횟수
		int count = 0;			// 정답 횟수
		
		for(int i=1; i<=10; i++) {
			int x = ran.nextInt(8) + 2;		// 2 ~ 9
			int y = ran.nextInt(9) + 1;		// 1 ~ 9
			int answer = x * y;
			
			System.out.println(x + " x " + y + " = ?");
			int myAnswer = scan.nextInt();
			
			if(answer == myAnswer) {
				count += 1;
				System.out.println("정답!");
			} else {
				wrongCount += 1;
				System.out.println("오답!");
				
				if(wrongCount == 3) {
					System.out.println("3회 틀렸습니다! 게임을 종료합니다.");
					count = 0;
					
					i = 100;
				}
			}
			
		}
		
		int score = count * 10;
		System.out.println("점수 = " + score + "점");
		
		scan.close();
		
	}
}
