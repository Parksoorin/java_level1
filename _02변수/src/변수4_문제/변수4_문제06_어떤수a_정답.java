package 변수4_문제;

/*
	[문제]
		어떤 수를 a라고 했을 때
		7 * 2 - a의 값은 -5와 같다.
		어떤 수 a는 홀수인지 여부를
		true 또는 false로 표현하시오.
	[정답]
		true
*/

public class 변수4_문제06_어떤수a_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				7 * 2 - a == -5
				14 - a == -5
				14 - 14 - a = -5 -14
				-a = -19
				a = 19
		 */		
		
		int a = 19;
		boolean check = 7 * 2 - a == -5;
		System.out.println(check);
		
		boolean result = a % 2 != 0;
		System.out.println(result);
		
	}
}
