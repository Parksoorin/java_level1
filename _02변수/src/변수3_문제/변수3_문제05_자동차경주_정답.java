package 변수3_문제;

/*
	[문제]
		자동차는 154km의 거리를 1시간 18분에 달린다.
		트럭은 215km의 거리를 2시간 17분에 달린다.
		자동차가 트럭보다 빠른지 여부를
		true 또는 false로 표현하시오.
	[정답]
		true
*/

public class 변수3_문제05_자동차경주_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				자동차
				78분 = 154km
				1분 = 154 / 78 = 1.97435
				
				트럭
				137분 = 215km 
				1분 = 215 / 137 = 1.56934
		 */

		double 자동차거리 = 154;
		double 자동차시간 = 78;
		double 자동차분속 = 자동차거리 / 자동차시간;
		System.out.println("자동차분속 = " + 자동차분속);
		
		double 트럭거리 = 215;
		double 트럭시간 = 137;
		double 트럭분속 = 트럭거리 / 트럭시간;
		System.out.println("트럭분속 = " + 트럭분속);
		
		System.out.println(자동차분속 > 트럭분속);		
		
	}
}
