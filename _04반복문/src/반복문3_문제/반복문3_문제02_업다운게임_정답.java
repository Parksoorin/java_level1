package 반복문3_문제;

import java.util.Random;
import java.util.Scanner;

/*
	[문제]
		Up & Down 게임
		1. com은 랜덤으로 1~100 사이의 숫자를 저장한다.
		2. me는 1~100 사이의 숫자를 입력한다.
		3. com과 me를 비교해서 
				com이 me보다 크면 "크다"
				com이 me보다 작으면 "작다"
			등의 힌트를 제공한다.
		4. 정답을 맞추면 게임은 종료된다.
*/

public class 반복문3_문제02_업다운게임_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int com = ran.nextInt(100) + 1;
		System.out.println("com = " + com);
		
		boolean run = true;
		while(run) {
			System.out.print("me 입력 : ");
			int me = scan.nextInt();
			
			if(com == me) {
				System.out.println("정답!");
				run = false;
			} else if(com > me) {
				System.out.println("크다");
			} else if(com < me) {
				System.out.println("작다");
			}
		}
		
		scan.close();
		
	}
}
