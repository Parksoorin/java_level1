package 변수4_문제;

/*
	[문제]
		철수는 농구공을 12번 던져서 7번 성공했다.
		영희는 농구공을 17번 던져서 9번 성공했다.
		영희의 성공확률이 철수의 성공확률보다 더 높은지 여부를
		true 또는 false로 표현하시오.
	[정답]
		false
*/

public class 변수4_문제01_농구_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				철수 확률
					12번 : 100% = 7번 : n%
					12n = 7 * 100
					n = 7 * 100 / 12
				
				영희 확률
					17번 : 100% = 9번 : n%
					17n = 9 * 100
					n = 100 * 9 / 17
		 */
		
		double 철수_성공확률 = 7.0 * 100 / 12;
		double 영희_성공확률 = 9.0 * 100 / 17;
		
		boolean result = 영희_성공확률 > 철수_성공확률;
		
		System.out.printf("철수 = %.2f%%\n", 철수_성공확률);
		System.out.printf("영희 = %.2f%%\n", 영희_성공확률);
		
		System.out.println(result);
		
	}
}
