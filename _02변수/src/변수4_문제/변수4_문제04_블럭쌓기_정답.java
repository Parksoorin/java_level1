package 변수4_문제;

/*
	[문제]
		철수는 2시간 동안 블럭은 231개 쌓았다.
		민수는 1시간 반 동안 블럭을 177개 쌓았다.
		철수가 민수보다 블럭을 쌓는 속도가 더 빠른지 여부를
		true 또는 false로 표현하시오.
	[정답]
		fasle
*/

public class 변수4_문제04_블럭쌓기_정답 {
	public static void main(String[] args) {
	
		/*
			[풀이]
				블럭 1개 소요시간
				
				철수
					231개 : 120분 = 1개 : n분
					231n = 120
					n = 120 / 231
				민수
					177개 : 90분 = 1개 : n분
					177n = 90
					n = 90 / 177
		 */	
		
		double 철수_블럭 = 231;
		double 철수_시간 = 60 * 2;
		double 철수_1개시간 = 철수_시간 / 철수_블럭;
		
		double 민수_블럭 = 177;
		double 민수_시간 = 60 + 30;
		double 민수_1개시간 = 민수_시간 / 민수_블럭;
		
		boolean result = 철수_1개시간 < 민수_1개시간;
		
		System.out.printf("철수가 블럭 1개를 쌓는데 소요되는 시간 = %.2f\n", 철수_1개시간);
		System.out.printf("민수가 블럭 1개를 쌓는데 소요되는 시간 = %.2f\n", 민수_1개시간);
		System.out.println(result);
		
		
	}
}
