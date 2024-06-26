package 변수1_문제;

/*
	[문제]
		철수는 자전거를 타고 일정한 빠르기로 7분 동안 23/30km를 갔다.
		철수가 자전거를 타고 1분 동안 간 거리가 몇 km인지 구하시오.
		단, 소수점 두 자리까지 출력하시오.
	[정답]
		0.11km
*/

public class 변수1_문제03_자전거_정답 {
	public static void main(String[] args) {

		/*
			[풀이]
				7분 : 23 / 30km = 1분 : nkm
				7n = 23 / 30
				n = 23 / 30 / 7 
		 */
	
		double 칠분_이동거리 = 23.0 / 30.0;
		double 일분_이동거리 = 칠분_이동거리 / 7.0;
		System.out.printf("%.2fkm", 일분_이동거리);		
		
	}
}
