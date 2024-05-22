package 문자열1_개념;

import java.util.Scanner;

/*
	[문제]
		끝말잇기 게임을 만들어보시오.
		
		제시어 : 자전거
		입력 : 거미
		
		제시어 : 거미
		입력 : 미술
		
		...
*/

public class 문자열1_개념10_끝말잇기_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = "자전거";
		
		System.out.println('a' == 'a');
		
		while(true) {
			System.out.println("제시어 : " + str);
			// 자전거
			
			System.out.print("입력 : ");
			String input = scan.next();
			// 거미
			
			if(str.charAt(str.length() - 1) == input.charAt(0)) {
				str = input;
			}
			
			if(input.equals("quit")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		
		scan.close();
	}
}
