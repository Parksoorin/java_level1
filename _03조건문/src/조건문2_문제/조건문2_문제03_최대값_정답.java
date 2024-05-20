package 조건문2_문제;

import java.util.Scanner;

/*
	[문제]
		1. 숫자 3개를 입력받는다.
		2. 입력받은 3개의 숫자를 비교한다.
		3. 가장 큰 수(max)를 출력한다.
*/

public class 조건문2_문제03_최대값_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("정수2 입력 : ");
		int num2 = scan.nextInt();
		
		System.out.print("정수3 입력 : ");
		int num3 = scan.nextInt();
		
		int maxNum = num1;
		if(maxNum < num2) {
			maxNum = num2;
		}
		if(maxNum < num3) {
			maxNum = num3;
		}
		
		System.out.println("최대값 = " + maxNum);
		
		scan.close();
		
	}
}
