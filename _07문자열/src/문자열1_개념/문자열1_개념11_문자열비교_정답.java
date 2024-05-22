package 문자열1_개념;

import java.util.Scanner;

/*
	[문제]
		equals() 메서드 사용없이 문자의 일치여부를 비교하시오.
	[예시]
		코끼리
		입력 : 티라노사우루스
		출력 : false
*/

public class 문자열1_개념11_문자열비교_정답 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.print("동물의 이름을 입력하세요 : ");
		String myName = scan.next();
		
		boolean check = true;
		if(name.length() == myName.length()) {
			
			for(int i=0; i<name.length(); i++) {
				if(name.charAt(i) != myName.charAt(i)) {
					check = false;
					break;
				}
			}
			
		} else {
			check = false;
		}
		
		System.out.println(check);
		
		scan.close();
		
	}
}
