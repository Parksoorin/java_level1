package 반복문1_문제;

/*
	[문제]
		선호네 반 학생 25명이 체험학습을 하러 가기위해
		버스를 탔는데 총 요금이 19400원이었다.
		교통카드를 사용하면 720원이고
		현금으로 지불하면 1000원일 때
		교통카드를 사용한 학생 수와 현금을 사용한 학생 수는
		각각 얼마인지 구하시오.
	[정답]
		교통카드사용_학생수 = 20명
		현금사용_학생수 = 5명
*/

public class 반복문1_문제06_교통카드_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				전체학생 수 = 25
				총요금 = 19400
				
				교통카드 = 720
				현금 = 1000
				
				교통카드 사용 인원 = x
				현금 사용 인원 = y
				
				(1) x + y == 25
				(2) 720x + 1000y = 19400
		 */
		
		int 전체학생수 = 25;
		int 총요금 = 19400;
		
		int 교통카드 = 720;
		int 현금 = 1000;
		
		int 교통카드_인원수 = 전체학생수;
		int 현금_인원수 = 0;
		
		boolean run = true;
		while(run) {
			if(교통카드_인원수 + 현금_인원수 == 전체학생수 && 교통카드 * 교통카드_인원수 + 현금 * 현금_인원수 == 총요금) {
				System.out.println("교통카드사용_학생수 = " + 교통카드_인원수 + "명");
				System.out.println("현금사용_학생수 = " + 현금_인원수 + "명");
				run = false;
			}
			
			교통카드_인원수 -= 1;
			현금_인원수 += 1;
		}
		
	}
}
