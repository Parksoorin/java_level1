package 조건문2_문제;

import java.util.Random;
import java.util.Scanner;

/*
	[문제]
		1. 150 ~ 250 사이의 랜덤 숫자를 저장한다.
		2. 랜덤 숫자의 가운데 숫자를 직접 입력하여 맞추는 게임이다.
			예) 249	=> 4
*/

public class 조건문3_문제06_랜덤가운데숫자_정답 {
	public static void main(String[] args) {
		

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rNum = ran.nextInt(101) + 150;	// [0 ~ 100] + 150
		System.out.println(rNum);
		
		int answer = rNum % 100 / 10;
		
		System.out.print("가운데 숫자를 입력 : ");
		int myAnswer = scan.nextInt();
		
		if(answer == myAnswer) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
		scan.close();
		
	}
}
