package 변수4_문제;

/*
	[문제]
		철수는 20000원을 가지고 친구 3명과 돈까스를 각각 1개씩 사먹었다.
		계산 후 남은 돈이 2000원이었다.
		돈가스 1개의 가격은 4000원 이하인지 여부를
		true 또는 false로 표현하시오.
	[정답]
		false
*/

public class 변수4_문제02_돈가스_정답 {
	public static void main(String[] args) {

		/*
			[풀이]
				현금 = 20000
				잔돈 = 2000
				
				돈가스총금액 = 현금 - 잔돈
				돈가스1개 가격 = 돈가스총금액 / 4
		 */		
		
		int 현금 = 20000;
		int 잔돈 = 2000;
		
		int 인원수 = 4;
		
		int 돈가스_총금액 = 현금 - 잔돈;
		int 돈가스_1개가격 = 돈가스_총금액 / 인원수;
		
		boolean result = 돈가스_1개가격 <= 4000;
		
		System.out.printf("돈가스 1개 가격 = %d원\n", 돈가스_1개가격);
		System.out.println(result);
		
	}
}
