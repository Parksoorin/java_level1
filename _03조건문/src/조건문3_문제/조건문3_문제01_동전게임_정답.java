package 조건문3_문제;

import java.util.Random;
import java.util.Scanner;

/*
	[문제]
		1. 0 또는 1의 랜덤 숫자를 저장한다.
		2. 0은 동전 앞면, 1은 동전의 뒷면이다.
		3. 동전의 앞뒷면을 맞추는 게임이다.
	[예시]
		rNum = 0
		앞면(0) 뒷면(1) 입력 : 1
		오답
*/

public class 조건문3_문제01_동전게임_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Random ran = new Random();
		int rNum = ran.nextInt(2);
		System.out.println("rNum = " + rNum);
		
		System.out.print("앞면(0) 뒷면(1) 입력 : ");
		int myAsnwer = scan.nextInt();
		
		if(rNum == myAsnwer) {
			System.out.println("정답");
		}
		if(rNum != myAsnwer) {
			System.out.println("오답");
		}
  		
		
	}
}
