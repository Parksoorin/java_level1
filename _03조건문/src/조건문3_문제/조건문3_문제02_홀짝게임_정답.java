package 조건문3_문제;

import java.util.Random;
import java.util.Scanner;

/*
	[문제]
		1. 1~10 사이의 숫자 중 랜덤으로 한 개의 숫자를 저장한다.
		2. 랜덤 숫자가 홀수인지 짝수인지 맞추는 게임이다.
*/

public class 조건문3_문제02_홀짝게임_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Random ran = new Random();
		int rNum = ran.nextInt(10) + 1;
		System.out.println("rNum = " + rNum);
		
		int answer = 0;
		if(rNum % 2 == 0) {
			answer = 1;
		}
		
		System.out.print("홀수(0) 짝수(1) 입력 : ");
		int myAnswer = scan.nextInt();
		
		if(answer == myAnswer) {
			System.out.println("정답");
		}
		if(answer != myAnswer) {
			System.out.println("오답");
		}
		
		scan.close();
		
	}
}
