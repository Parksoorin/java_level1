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

public class 문자열2_개념09_대소문자_문제 {
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
		
		scan.close();
		
	}
}
