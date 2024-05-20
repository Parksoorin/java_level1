package 변수3_문제;

/*
	[문제]
		어떤 수 x에 3을 곱하였더니 6.12가 되었다.
		x를 4로 나누면 x는 1보다 작은지 여부를
		true 또는 false로 표현하시오.
	[정답]
		true
*/

public class 변수3_문제02_나누기_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				x * 3 = 6.12
				x = 6.12 / 3 = 2.04
				
				x / 4
				2.04 / 4
				0.51 < 1
		 */
		
		double x = 1;
		x = 6.12 / 3;

		x = x / 4;

		boolean check = x < 1;
		System.out.println(check);		
		
	}
}
