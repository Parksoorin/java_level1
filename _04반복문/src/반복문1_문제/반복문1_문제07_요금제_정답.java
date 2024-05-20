package 반복문1_문제;

/*
	[문제]
		다음은 휴대폰 요금제와 관련된 내용이다.
		A요금제 기본요금 17500원 초당5원
		B요금제 기본요금 31000원 초당2원
		
		B를 선택할 경우, A보다 더 경제적이 되려면
		통화시간을 얼마까지 사용해야하는지 구하시오.
		정답은 초로 구하시오.
	[정답]
		4501초
 */

public class 반복문1_문제07_요금제_정답 {
	public static void main(String[] args) {
		
		int a기본요금 = 17500;
		int b기본요금 = 31000;
		
		int a초당_요금 = 5;
		int b초당_요금 = 2;
		
		int 초 = 0;
		
		boolean run = true;
		while(run) {
			if(a기본요금 + a초당_요금 * 초 > b기본요금 + b초당_요금 * 초) {
				run = false;
			}else {
				초 += 1;
			}
		}
		System.out.println(초);
		
	}
}
