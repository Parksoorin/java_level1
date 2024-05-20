package 반복문3_문제;

import java.util.Random;
import java.util.Scanner;

/*
	[문제]
		1. 0 또는 1의 랜덤 숫자를 저장한다.
		2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
		3. 동전의 앞뒷면을 맞추는 게임이다.
		4. 정답을 맞추면 500원 이득을 보고,
		   틀리면 700원 손해를 본다.
		5. 게임이 끝날때마다 게임을 계속할지 종료할지 선택한다.
		6. 게임 종료 후, 남은 자금을 출력하시오.
*/

public class 반복문3_문제06_코인게임_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int money = 3500;
		
		boolean run = true;
		while(run) {
			int coin = ran.nextInt(2);
			System.out.println("coin = " + coin);
			
			System.out.print("앞면(0) 뒷면(1) 입력 : ");
			int input = scan.nextInt();
			
			if(coin == input) {
				System.out.println("정답!");
				money += 500;
			} else {
				System.out.println("꽝!");
				money -= 700;
			}
			
			System.out.print("게임을 계속하시겠습니까? yes(1) no(0) : ");
			int exit = scan.nextInt();
			if(exit == 0) {
				run = false;
			}
		}
		
		System.out.println("잔액 = " + money + "원");
		
		scan.close();
		
	}
}
