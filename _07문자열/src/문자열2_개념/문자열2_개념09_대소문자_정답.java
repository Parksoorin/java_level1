package 문자열2_개념;

import java.util.Scanner;

/*
	[문제]
		아이디와 비밀번호를 입력받고 로그인을 처리한다.
		단, 아이디와 비밀번호는
		(1) 대문자로 입력하던
		(2) 소문자로 입력하던
		(3) 대소문자를 섞어서 입력하던 전부 동일하게 인식되어야 한다.
*/

public class 문자열2_개념09_대소문자_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String dbId = "q1w2e3r4";
		String dbPw = "r4e3w2q1";
		
		String hint1 = "abcdefghijklmnopqrstuvwxyz";
		String hint2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println(">>> 로그인 <<<");
		System.out.print("아이디를 입력하세요 : ");
		String myId = scan.next();
		
		System.out.print("비밀번호를 입력하세요 : ");
		String myPw = scan.next();
		
		boolean check = true;
		if(dbId.length() == myId.length() && dbPw.length() == myPw.length()) {
			// 아이디 검사
			for(int i=0; i<dbId.length(); i++) {
				
				// 아이디 문자를 한글자씩 비교해서 숫자인지 문자인지 판단
				int index = -1;
				for(int j=0; j<hint1.length(); j++) {
					if(dbId.charAt(i) == hint1.charAt(j)) {
						index = j;
						break;
					}
				}
				
				if(index == -1) {
					// 숫자이면
					if(dbId.charAt(i) != myId.charAt(i)) {
						check = false;
						break;
					}
				} else {
					// 문자이면
					if(myId.charAt(i) != hint1.charAt(index) && myId.charAt(i) != hint2.charAt(index)) {
						check = false;
						break;
					}
				}
			}
			// 비밀번호 검사
			for(int i=0; i<dbPw.length(); i++) {
				int index = -1;
				for(int j=0; j<hint1.length(); j++) {
					if(dbPw.charAt(i) == hint1.charAt(j)) {
						index = j;
						break;
					}
				}
				
				if(index == -1) {
					// 숫자이면
					if(dbPw.charAt(i) != myPw.charAt(i)) {
						check = false;
						break;
					}
				} else {
					// 문자이면
					if(myPw.charAt(i) != hint1.charAt(index) && myPw.charAt(i) != hint2.charAt(index)) {
						check = false;
						break;
					}
				}
			}
		
		} else {
			check = false;
		}
		
		if(check) { 
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
		
		scan.close();
		
	}
}
