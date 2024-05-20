package 연산자1_문제;

/*
	[문제]
		철수가 1시간 40분 동안 일정한 빠르기로 주은 밤의 무게가 11kg이다.
		3분동안 주은 밤은 몇 kg인지 구하시오.
		단, 소수점 두 자리까지 출력하시오.
	[정답]
		0.33kg
*/

public class 연산자4_문제03_밤_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				100분 : 11kg = 3분 : n
				100n = 11 * 3
				100n / 100 = 33 / 100.0
				n = 0.33
		 */
		
		System.out.println(11 * 3 / 100.0 + "kg");
		
	}
}
