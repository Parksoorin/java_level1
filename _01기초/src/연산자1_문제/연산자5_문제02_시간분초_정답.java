package 연산자1_문제;

/*
	[문제]
		321321초는 몇 시간 몇 분 몇 초인지 구하시오.
	[정답]
		89시간
		15분
		21초
*/

public class 연산자5_문제02_시간분초_정답 {
	public static void main(String[] args) {
	
		/*
			[풀이]
				시간 = 321321 / 3600
				분 = 321321 % 3600 / 60
				초 = 321321 % 60
		 */
		
		System.out.printf("%d시간\n", 321321 / 3600);
		System.out.printf("%d분\n", 321321 % 3600 / 60);
		System.out.printf("%d초\n", 321321 % 60);
		
	}
}
