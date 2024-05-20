package 조건문1_문제;

import java.util.Scanner;

/*
	[문제]
		1. 시험점수를 입력받는다.
		2. 시험점수에 해당하는 학점을 출력한다.
		3. 아래는 점수표이다.
			91 ~ 100점		A학점
			90 ~ 81점		B학점
			80이하			재시험
		4. 단, 만점이거나 A학점과 B학점의 일의 자리가 7점 이상이면, +를 추가한다.
		   A학점과 B학점의 일의 자리가 3점 이하이면, -를 추가한다.
		
		예)
			100		=>		A+
			87		=>		B+
			82		=>		B-
			23		=>		재시험
*/

public class 조건문1_문제01_학점_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 1. 시험점수를 입력받는다.
		System.out.print("시험점수 입력 : ");
		int score = scan.nextInt();
		
		// 2. 시험점수에 해당하는 학점을 출력한다.
		// 4. 단, 만점이거나 A학점과 B학점의 일의 자리가 7점 이상이면, +를 추가한다.
		//    A학점과 B학점의 일의 자리가 3점 이하이면, -를 추가한다.
		
		String hakjum = "오류";
		
		int tenUnit = score / 10;
		int unit = score % 10;
		
		if(tenUnit == 9) { hakjum = "A"; }
		if(tenUnit == 8) { hakjum = "B"; }
		
		if(unit >= 7) { hakjum += "+"; }
		if(unit <= 3) { hakjum += "-"; }
		
		if(score == 100) { hakjum = "A+"; }
		if(score <= 80) {
			hakjum = "재시험";
		}
		
		System.out.println(hakjum);
		
		scan.close();
		
	}
}
