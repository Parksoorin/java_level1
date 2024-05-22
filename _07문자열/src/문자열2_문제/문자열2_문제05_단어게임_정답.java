package 문자열2_문제;

import java.util.Random;
import java.util.Scanner;

/*
	[문제]
		1. 문제를 섞는다.(shuffle)
		2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임을 종료한다.
	[예시]
		문제 : mysql
		입력 : mydb
		
		문제 : mysql
		입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		
		문제 : jsp
		...
*/

public class 문자열2_문제05_단어게임_정답 {
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
			System.out.println("문제 : " + words[i]);
			
			System.out.print("입력 : ");
			String myWord = scan.next();
			
			if(!myWord.equals(words[i])) {
				i -= 1;
			}
		}
		
		scan.close();
		
	}
}
