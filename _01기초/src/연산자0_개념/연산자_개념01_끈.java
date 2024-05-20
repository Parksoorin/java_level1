package 연산자0_개념;

/*
	[문제]
		끈 5/8m를 모두 사용하여 정사각형 모양 한 개를 만들었다.
		이 정사각형의 한변의 길이는 몇m인지 구하시오.
		단, 소수점 자리는 두 자리까지 구하시오.
	[정답]
		0.16 m
*/

public class 연산자_개념01_끈 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				5 / 8.0 / 4
		 */
		System.out.printf("%.2f m", 5.0 / 8.0 / 4.0);
		
	}
}
