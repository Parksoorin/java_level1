package 반복문1_문제;

/*
	[문제]
		학교에서 집까지 갈 때 시속 15km로 자전거를 타고 가면
		시속 6km로 걸어가는 것보다 18분 빨리 도착한다고 한다.
		학교에서 집까지의 거리를 구하시오.
	[정답]
		3km
*/

public class 반복문1_문제04_자전거_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				* 시속을 분속으로 변경
					예) 시속 15km
					60분 : 15km = 1분 : n
					60n = 15
					n = 15 / 60

				자전거 	= 시속15km 	= 분속15/60km
				도보		= 시속6km	= 분속6/60km
				
				이동시간	= x
				
				자전거분속 * x == 도보분속 * (x + 18)
		 */
		
		double 자전거_시속 = 15;
		double 도보_시속 = 6;
		
		double 자전거_분속 = 자전거_시속 / 60;
		double 도보_분속 = 도보_시속 / 60;
		
		int 이동시간 = 0;
		
		boolean run = true;
		while(run) {
			if(자전거_분속 * 이동시간 == 도보_분속 * (이동시간 + 18)) {
				
				double 이동거리 = 이동시간 * 자전거_분속;
				System.out.printf("%.0fkm", 이동거리);
				
				run = false;
			}
			
			이동시간 += 1;
		}
		
	}
}
