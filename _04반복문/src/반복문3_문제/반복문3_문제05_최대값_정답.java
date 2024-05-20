package 반복문3_문제;

import java.util.Scanner;

/*
	[문제]
		1. 반복문 안에서 계속해서 값을 입력받는다.
		2. 입력받은 숫자 중 가장 큰 숫자를 출력한다.
		3. -1000을 입력하면 종료한다.
	[예시]
		숫자 입력 : 8
		숫자 입력 : 100
		숫자 입력 : 56
		숫자 입력 : 78
		숫자 입력 : 23
		숫자 입력 : 125
		숫자 입력 : 445
		숫자 입력 : 952
		숫자 입력 : 22
		숫자 입력 : -1000
		최대값 = 952	
 */

public class 반복문3_문제05_최대값_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int maxNum = 0;
		
		boolean run = true;
		while(run) {
			System.out.print("숫자 입력 : ");
			int num = scan.nextInt();
			if(maxNum < num) {
				maxNum = num;
			}
			
			if(num == -1000) {
				run = false;
			}
		}
		
		System.out.println("최대값 = " + maxNum);
		
		scan.close();
		
	}
}
