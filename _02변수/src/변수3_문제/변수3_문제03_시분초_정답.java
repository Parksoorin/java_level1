package 변수3_문제;

/*
	[문제]
		321321초를 시간, 분, 초로 표현했을 때,
		분이 홀수인지 여부를
		true 또는 false로 표현하시오.
	[정답]
		true
*/

public class 변수3_문제03_시분초_정답 {
	public static void main(String[] args) {

		int 총시간 = 321321;
		
		int 시간 = 총시간 / 3600;
		int 분 = 총시간 % 3600 / 60;
		int 초 = 총시간 % 60;
		
		System.out.println("시간 = " + 시간);
		System.out.println("분 = " + 분);
		System.out.println("초 = " + 초);
		
		boolean check = 분 % 2 != 0;
		System.out.println(check);
		
	}
}
