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

public class 반복문2_문제02_로그아웃_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int id1 = 1111;
		int pw1 = 1234;

		int id2 = 2222;
		int pw2 = 2345;

		int log = -1; // -1(로그아웃), 1111(id1), 2222(id2)

		boolean run = true;
		while (run) {
			
			System.out.println("-------------");
			if(log == -1) {
				System.out.println("[상태] 로그아웃");
			} else if(log == 1111) {
				System.out.println("[상태] 1111회원 로그인 중...");
			} else if(log == 2222) {
				System.out.println("[상태] 2222회원 로그인 중...");
			}
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				// 로그아웃 상태에서만 로그인 메뉴를 이용할 수 있다.
				if(log == -1) {
					System.out.print("아이디를 입력하세요 : ");
					int myId = scan.nextInt();
					
					System.out.print("비밀번호를 입력하세요 : ");
					int myPw = scan.nextInt();
					
					if(id1 == myId && pw1 == myPw) {
						log = 1111;
					} else if(id2 == myId && pw2 == myPw) {
						log = 2222;
					} else {
						System.out.println("[메세지]아이디와 비밀번호를 확인해주세요.");
					}
				} else {
					System.out.println("[메세지]이미 로그인 중입니다.");
				}
			} else if (sel == 2) {
				if(log == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				} else {
					log = -1;
					System.out.println("[메세지]로그아웃 되었습니다.");
				}
			} else if (sel == 0) {
				run = false;
				
				// 로그아웃
				log = -1;
				System.out.println("[메세지]프로그램 종료");
			}
		}		
		
		scan.close();
		
	}
}
