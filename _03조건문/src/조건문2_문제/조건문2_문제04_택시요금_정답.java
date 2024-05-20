package 조건문2_문제;

import java.util.Scanner;

/*
	[문제]
		택시 기본요금은 10000원이다.
		기본 요금으로 10km까지 이동할 수 있다.
		10km이상 이동 시 추가요금이 발생한다.
		추가요금은 3km를 이동할 때마다 2300원씩 요금이 추가된다.
		이동거리를 입력받고 요금을 출력하시오.
		
		예)
			8km			=>		10000원
			11km		=> 		12300원
			16km		=>		14600원
*/

public class 조건문2_문제04_택시요금_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int 기본요금 = 10000;
		int 기본거리 = 10;
		
		int 추가기본요금 = 2300;
		int 추가기본거리 = 3;
		
		System.out.print("이동할 거리를 입력하세요 : ");
		int 이동거리 = scan.nextInt();
		
		if(이동거리 <= 0) {
			System.out.println("오류");
		}
		
		if(1 <= 이동거리 && 이동거리 <= 기본거리) {
			System.out.println("요금은 " + 기본요금 + "원 입니다.");
		}
		
		if(이동거리 > 기본거리) {
			int 추가이동거리 = 이동거리 - 기본거리;
			
			int 추가요금 = 추가이동거리 / 추가기본거리;
			if(추가이동거리 % 추가기본거리 > 0) {
				추가요금 = 추가요금 + 1;
			}
			int 요금 = 기본요금 + 추가요금 * 추가기본요금;
			System.out.println("요금은 " + 요금 + "원 입니다.");
		}
		
		scan.close();

	}
}
