package 변수6_문제;

import java.util.Scanner;

/*
	[문제]
		숫자 2개를 입력받는다.
		그 숫자의 합이 홀수인지 여부를 판단해
		true 또는 false로 표현하시오.
*/

public class 변수6_문제03_홀수_정답 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("숫자2 입력 : ");
		int num2 = scan.nextInt();
		
		int total = num1 + num2;
		boolean result = total % 2 != 0;
		
		System.out.println("합 = " + total);
		System.out.println(result);
		
		scan.close();
		
	}
}
