package 조건문0_개념;

import java.util.Scanner;

/*
	[문제] 점수 유효성 검사
		1. 점수 2개를 입력받아 평균을 구한다.
		2. 평균이 60점 이상이면 합격, 60점 미만이면 불합격이다.
		3. 조건1)
		   입력받은 정수가 음수이거나 100점을 초과하면,
		   오류 메세지를 출력한다.
		   예) 점수를 잘 못 입력했습니다.
		4. 조건2)
		   평균이 60점 이상이라도 한 과목이라도 50점 미만이면,
		   불합격을 출력한다.
*/

public class 조건문_개념01_합격 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수1 입력 : ");
		int score1 = scan.nextInt();
		
		System.out.print("점수2 입력 : ");
		int score2 = scan.nextInt();
		
		int total = score1 + score2;
		double avg = total / 2.0;
		
		if(100 < score1 || score1 < 0 || 100 < score2 || score2 < 0) {
			System.out.println("점수를 잘 못 입력했습니다.");
		}
		
		if(0 <= score1 && score1 <= 100 && 0 <= score2 && score2 <= 100 && avg >= 60 && score1 >= 50 && score2 >= 50) {
			System.out.println("합격");
		}
		if(0 <= score1 && score1 <= 100 && 0 <= score2 && score2 <= 100 && (avg < 60 || score1 < 50 || score2 < 50)) {
			System.out.println("불합격");
		}
		
		scan.close();
		
	}
}

