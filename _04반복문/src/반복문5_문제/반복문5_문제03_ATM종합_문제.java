package 반복문5_문제;

import java.util.Scanner;

/*
	[문제]
		1. 
			[뒤로가기]를 활용해 단계별로 기능을 구현한다.
			[회원가입]은 추후 배열에서 가능하다.
		2.
			메인화면 기능		: [1.로그인 0.종료]
			1번 로그인 선택		: [1.입금 2.출금 3.이체 4.조회 5.정보수정 0.로그아웃]
			2번 종료 선택		: [종료]
		3. 추가기능
			1) 5. 정보수정 선택	: 비밀번호를 바꿀 수 있다.
			2) 0. 로그아웃 선택	: 뒤로 돌아가서 [1.로그인 0.종료] 화면이 다시 나온다.
			3) 로그인 3번 실패시 강제 종료한다.
*/

public class 반복문5_문제03_ATM종합_문제 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbMoney1 = 50000;		
		int dbAcc2 = 2222;
		
		int dbPw2 = 2345;
		int dbMoney2 = 70000;		
		
		int log = -1; // -1(로그아웃), 1111(dbAcc1로그인), 2222(dbAcc2로그인)		
		
		while(true) {
			System.out.println("[1.로그인][0.종료]");
			
			int sel = scan.nextInt();
			if(sel == 1) {
				
			}else if(sel == 0) {
				break;
			}
		}
		
	}
}
