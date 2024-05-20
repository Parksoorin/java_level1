package 변수6_문제;

import java.util.Scanner;

/*
	[문제]
		숫자 2개를 입력받는다.
		두 숫자의 곱을 구하시오.
*/

public class 변수6_문제01_곱_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("숫자2 입력 : ");
		int num2 = scan.nextInt();
		
		int result = num1 * num2;
		System.out.printf("%d * %d = %d", num1, num2, result);
		
		scan.close();
		
	}
}
