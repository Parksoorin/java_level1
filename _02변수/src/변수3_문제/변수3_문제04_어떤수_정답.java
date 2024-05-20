package 변수3_문제;

/*
	[문제]
		어떤 수를 x라고 했을 때
		-4 + x + 3의 값은 8이다.
		어떤 수 x는 짝수인지 여부를
		true 또는 false로 표현하시오.
	[정답]
		false
*/

public class 변수3_문제04_어떤수_정답 {
	public static void main(String[] args) {

		/*
			[풀이]
				-4 + x + 3 = 8
				-4 + 4 + x + 3 = 8 + 4
				x + 3 = 12
				x + 3 - 3 = 12 - 3
				x = 9
		 */
		
		int x = 0;
		x = 8 - 3 + 4;
		System.out.println("x = " + x);
		
		boolean check = x % 2 == 0;
		System.out.println(check);		
		
	}
}
