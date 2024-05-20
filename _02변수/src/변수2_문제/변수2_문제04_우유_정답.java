package 변수2_문제;

/*
	[문제]
		철수는 우유 4/5L를 6일 동안 똑같이 나눠 마셨다.
		철수가 2일째 우유를 마시고나면 남은 우유는 몇L 인지 구하시오.
		소수점 두 자리까지 출력하시오.
	[정답]
		0.53L
*/

public class 변수2_문제04_우유_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				4/5 - 4/5/6*2
		 */				
		
		double 전체우유 = 4.0 / 5.0;
		double _2일차우유 = 전체우유 / 6 * 2;
		
		double 남은우유 = 전체우유 - _2일차우유;
		System.out.printf("%.2fL", 남은우유);
		
	}
}
