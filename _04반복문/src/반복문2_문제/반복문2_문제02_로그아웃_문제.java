package 반복문2_문제;

import java.util.Scanner;

/*
	[문제]
		1. 로그인
			- 로그인 후, 재 로그인 불가함
			- 로그아웃 상태에서만 이용 가능
		2. 로그아웃
			- 로그인 후 이용가능
		3. 로그인, 로그아웃 관리는 log변수를 이용한다.
			예) -1(로그아웃), 1111(id1), 2222(id2)
*/

public class 반복문2_문제02_로그아웃_문제 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int id1 = 1111;
		int pw1 = 1234;

		int id2 = 2222;
		int pw2 = 2345;

		int log = -1; // -1(로그아웃), 1111(id1), 2222(id2)

		boolean run = true;
		while (run) {
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				
			} else if (sel == 2) {
			
			} else if (sel == 0) {
				run = false;
				System.out.println("[메세지]프로그램 종료");
			}
		}		
		
	}
}
