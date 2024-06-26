package 연산자1_문제;

/*
	[문제]
		무게가 같은 사과 15개의 무게를 재었더니 25/8kg 이었다.
		사과 한 개의 무게를 구하시오.
		단, 소수점 두 자리까지 출력하시오.
	[정답]
		0.21g
*/


public class 연산자1_문제05_사과_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				사과 15개의 무게 	= 25 / 8
				사과 1개의 무게 	= 사과 15개의 무게 / 15
								= 25 / 8 / 15
		 */
		
		System.out.printf("%.2fg", 25.0 / 8.0 / 15.0);
		
	}
}
