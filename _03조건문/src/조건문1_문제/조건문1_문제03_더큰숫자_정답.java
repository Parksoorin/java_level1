package 조건문1_문제;

import java.util.Scanner;

/*
	[문제]
		정수 2개를 입력받고, 더 큰 숫자의 값을 출력하시오.
	[예시]
		숫자1 입력 : 
		숫자2 입력 : 
		더 큰 숫자는 ? 입니다.
*/

public class 조건문1_문제03_더큰숫자_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("숫자2 입력 : ");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("더 큰 숫자는 " + num1 + "입니다.");
		}
		if(num1 < num2) {
			System.out.println("더 큰 숫자는 " + num2 + "입니다.");
		}
		
		scan.close();
		
	}
}
