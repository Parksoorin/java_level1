package 반복문5_문제;

import java.util.Scanner;

/*
	[문제]
		베스킨라빈스 게임이란, 플레이어 2명이 번갈아가면서
		1~3 사이의 숫자를 선택할 수 있고 그 숫자들을 계속 더해서 
		그 누적 합이 31에 먼저 도달한 쪽이 지는 게임이다.
		
		1. 각 플레이어는 번갈아가면서 1~3을 선택한다.
		2. 만약에 이상한 숫자를 입력하면 1~3을 입력할 때까지 계속 자기 차례이다.
		3. 각 플레이어가 선택한 숫자는 total 변수에 계속 누적해서 더한다.
		4. total이 31이상에 도달하면 승리자를 출력한다.
 */

public class 반복문5_문제01_베스킨라빈스31_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean turn = true;		// p1차례(true), p2차례(false)
		
		int exitNum = 31;
		int total = 0;
		
		while(true) {
			
			System.out.println("total = " + total);
			
			if(turn) {
				System.out.print("[p1]차례 : ");
				int p1 = scan.nextInt();
				
				if(1 <= p1 && p1 <= 3) {
					total += p1;
					
					turn = false;
				} else {
					System.out.println("[메세지]1~3 사이의 숫자 입력!");
				}
			} else {
				System.out.print("[p2]차례 : ");
				int p2 = scan.nextInt();
				
				if(1 <= p2 && p2 <= 3) {
					total += p2;
					
					turn = true;
				} else {
					System.out.println("[메세지]1~3 사이의 숫자 입력!");
				}
			}
			
			if(total >= exitNum) {
				if(turn) {
					System.out.println("[p1]승리");
				} else {
					System.out.println("[p2]승리");
				}
				
				System.out.println("게임을 종료합니다.");
				break;
			}
			
		}
		
		scan.close();
		
		
	}
}
