package 문자열2_개념;

import java.util.Scanner;

/*
	[문제]
		임의의 문자를 입력받아
		해당 문자열 안에 숫자가 있는지 검색하시오.
	[예시] 
		입력 : adklajsiod
		결과 : 문자만 있다.
		
		입력 : 123123
		결과 : 숫자만 있다.
		
		입력 : dasd12312asd
		결과 : 문자와 숫자가 섞여있다.
*/


public class 문자열2_개념10_숫자검사_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String text = scan.next();
		
		String hint1 = "abcdefghijklmnopqrstuvwxyz";
		String hint2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int count = 0;	// 입력받은 문자열 안에 알파벳(문자)의 개수
		for(int i=0; i<text.length(); i++) {
			for(int j=0; j<hint1.length(); j++) {
				if(text.charAt(i) == hint1.charAt(j) || text.charAt(i) == hint2.charAt(j)) {
					count += 1;
				}
			}
		}
		
		if(count == 0) {
			System.out.println("숫자만 있다.");
		} else if(count == text.length()) {
			System.out.println("문자만 있다.");
		} else {
			System.out.println("문자와 숫자가 섞여있다.");
		}
		
		scan.close();
		
	}
}
