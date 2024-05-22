package 문자열2_문제;

import java.util.Random;
import java.util.Scanner;

/*
	[문제]
		1. 문제를 섞는다.(shuffle)
		2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임을 종료한다.
		3. 단, 문제를 출제할 때 단어의 랜덤한 위치 한 곳만 *로 출력한다.
	[예시]
		문제 : mys*l
		입력 : mysql <--- 정답을 맞추면, 다음 문제 제시
		문제 : *jp
		입력 : jsp
		...
*/

public class 문자열2_문제06_랜덤타자게임_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		for(int i=0; i<50; i++) {
			int r = ran.nextInt(words.length);
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		
		for(int i=0; i<words.length; i++) {
			
			int r = ran.nextInt(words[i].length());
			
			System.out.print("문제 : ");
			for(int j=0; j<words[i].length(); j++) {
				if(j == r) {
					System.out.print("*");
				} else {
					System.out.print(words[i].charAt(j));
				}
			}
			System.out.println();
			
			System.out.print("입력 : ");
			String myWord = scan.next();
			
			if(!words[i].equals(myWord)) {
				i -= 1;
			}
		}
		
	}
}
