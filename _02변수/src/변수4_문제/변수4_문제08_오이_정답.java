package 변수4_문제;

/*
	[문제]
		20000원에서 1200원짜리 오이 9개를 샀다.
		거스름돈이 10000원 이하인지 여부를
		true 또는 false로 표현하시오.
	[정답]
		true
*/

public class 변수4_문제08_오이_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				현금 = 20000
				
				오이 가격 = 1200
				오이 수량 = 9
				
				거스름돈 = 현금 - (오이가격 * 오이수량)
		 */		
		
		int 현금 = 20000;
		int 오이_가격 = 1200;
		int 오이_수량 = 9;
		
		int 거스름돈 = 현금 - (오이_가격 * 오이_수량);
		
		boolean result = 거스름돈 <= 10000;
		
		System.out.println("거스름돈 = " + 거스름돈);
		System.out.println(result);
		
	}
}
