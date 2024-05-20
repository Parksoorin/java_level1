package 조건문2_문제;

import java.util.Scanner;

/*
	[문제]
		ATM 기능 중 로그인 기능을 구현한다.
		
		1. 변수 설명
			cash	: 	가지고있는 현금
			balance	:	예금
			joinId	:	가입한 아이디
			joinPw	:	가입한 패스워드
		
		2. 기능설명
			1) 메인 메뉴 선택
				[1.로그인 0.종료]
			2) 로그인을 선택한 경우,
			   아이디와 비밀번호를 입력받고 성공하면 "로그인 성공" 메세지를 출력하고
			   [1.입금 2.출금]의 새로운 메뉴가 등장
			   
			   2-1) 입금을 선택한 경우
			   		입금할 돈을 입력받고 현금이 줄어들고 예금이 늘어난다.
			   2-2) 출금을 선택한 경우
			   		출금할 돈을 입력받고 예금이 줄어들고 현금이 늘어난다.
			    
			3) 로그인에 실패한 경우 "로그인 실패" 메세지 출력
*/


public class 조건문2_문제05_ATM_문제 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cash = 20000;
		int balance = 30000;
		
		int joinId = 1111;
		int joinPw = 1234;
		
		System.out.println("=== [ATM] ===");
		System.out.println("[1.로그인 0.종료]");
		
		int select = scan.nextInt();
		
		if(select == 1) {
			
		}else if(select == 0) {
			System.out.println("프로그램을 종료합니다.");
		}
		
	}
}
