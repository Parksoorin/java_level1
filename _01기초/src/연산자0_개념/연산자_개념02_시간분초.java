package 연산자0_개념;

/*
	[문제]
		123123초는 몇 시간 몇 분 몇 초인지 구하시오.
	[정답]
		34시간 12분 3초
*/

public class 연산자_개념02_시간분초 {
	public static void main(String[] args) {
		
		/*
			123123초
			
			시간 = 123123 / 3600
			분  	= 123123 % 3600 / 60
			초	= 123123 % 60
		 */
		
		System.out.println(123123 / 3600 + "시간");
		System.out.println(123123 % 3600 / 60 + "분");
		System.out.println(123123 % 60 + "초");
		
	}
}
