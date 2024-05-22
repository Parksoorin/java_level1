package 문자열2_개념;

import java.util.Scanner;

/*
	[문제]
		변경하고 싶은 단어를 입력받아
		원하는 단어로 교체하시오.
	[예시]
		단어 선택 : Life
		단어 입력 : Your Leg
		
		Your Leg is too short.
*/

public class 문자열2_개념08_단어교체_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = "Life is too short.";
		
		System.out.print("단어 선택 : ");
		String word = scan.nextLine();
		
		// 기존 단어를 잘 못 입력했을 경우
		boolean check = false;
		for(int i=0; i<str.length() - word.length() + 1; i++) {
			int count = 0;
			for(int j=0; j<word.length(); j++) {
				if(str.charAt(i + j) == word.charAt(j)) {
					count += 1;
				}
			}
			
			if(count == word.length()) {
				check = true;
				break;
			}
		}
		
		if(check) {
			System.out.print("단어 입력 : ");
			String newWord = scan.nextLine();
			
			int start = 0;
			int end = 0;
			for(int i=0; i<str.length() - word.length() + 1; i++) {
				int count = 0;
				start = i;
				for(int j=0; j<word.length(); j++) {
					if(str.charAt(i + j) == word.charAt(j)) {
						count += 1;
					}
				}
				
				if(count == word.length()) {
					end = i + word.length();
					check = true;
					break;
				}
			}
			
			// start = 8, end = 11
			System.out.println("start = " + start + ", end = " + end);
			
			
			String front = str.substring(0, start);
			String back = str.substring(end);
			
			System.out.println("front = " + front);
			System.out.println("back = " + back);
			
			str = front + newWord + back;
			System.out.println(str);
			
		} else {
			System.out.println("입력하신 단어는 존재하지 않습니다.");
		}
		
		
		
		scan.close();
		
	}
}
