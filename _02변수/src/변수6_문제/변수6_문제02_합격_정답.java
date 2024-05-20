package 변수6_문제;

import java.util.Scanner;

/*
	[문제]
		시험점수를 입력받는다.
		시험 점수가 0점 미만이거나 100점 초과면 오류이다.
		오류이면 true, 오류가 아니면 false를 출력하시오.
*/

public class 변수6_문제02_합격_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시험점수 입력 : ");
		int score = scan.nextInt();
		
		boolean result = 100 < score || score < 0;
		System.out.println(result);
		
		scan.close();
		
	}
}
