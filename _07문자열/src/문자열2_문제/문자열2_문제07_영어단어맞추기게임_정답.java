package 문자열2_문제;

import java.util.Random;
import java.util.Scanner;

/*
	[문제]
		처음 영어단어는 전부 *로 표시되어 출력된다.
		영어단어를 입력받아 틀릴 때 마다 랜덤으로 한 글자씩 벗겨진다.
		단, 점수는 5점씩 감점된다.
		또한 같은 철자가 여러개이면 한번에 벗겨진다.
		전부 벗겨지거나 영어단어를 맞추면 게임을 종료된다.
	[예시]
		>>> 영어단어 맞추기 게임 <<<
		의미 : 공연
		문제 : ***********
		
		입력 : perform
		
		의미 : 공연
		문제 : *e********e
		
		입력 : action
		
		의미 : 공연
		문제 : *e**o*****e
		...
*/

public class 문자열2_문제07_영어단어맞추기게임_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		String word = "performance";
		String meaning = "공연";
		
		int size = word.length();
		boolean[] check = new boolean[size];
		
		while(true) {
			System.out.println(">>> 영어단어 맞추기 게임 <<<");
			System.out.println("의미 : " + meaning);
			
			for(int i=0; i<check.length; i++) {
				if(check[i]) {
					System.out.print(word.charAt(i));
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			
			// 게임 종료 조건2
			int count = 0;
			for(int i=0; i<check.length; i++) {
				if(check[i]) {
					count += 1;
				}
			}
			if(count == word.length()) {
				System.out.println("다음에 다시 시도해주세요.");
				break;
			}
			
			System.out.print("입력 : ");
			String input = scan.next();
			
			// 게임 종료 조건1
			if(word.endsWith(input)) {
				System.out.println("정답입니다!");
				break;
			}
			
			while(true) {
				int r = ran.nextInt(word.length());
				
				if(check[r] == false) {
					check[r] = true;
					
					for(int i=0; i<word.length(); i++) {
						if(word.charAt(r) == word.charAt(i)) {
							check[i] = true;
						}
					}
					
					break;
				}
			}
		}
		
		scan.close();
		
	}
}







