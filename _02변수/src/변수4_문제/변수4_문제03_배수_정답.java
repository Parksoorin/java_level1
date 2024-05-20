package 변수4_문제;

/*
	[문제]
		num의 값이 3의 배수인지 여부를
		true 또는 false로 표현하시오.
	[정답]
		false
*/

public class 변수4_문제03_배수_정답 {
	public static void main(String[] args) {

		/*
			[풀이]
				num % 3 == 0
		 */		
		
		int num = 17;
		
		boolean result = num % 3 == 0;
		System.out.println(result);
		
	}
}
