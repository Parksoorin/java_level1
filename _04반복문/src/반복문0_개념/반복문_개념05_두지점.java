package 반복문0_개념;

/*
	[문제]
		철수네 가족은 x와 y 두 지점을 자전거를 타고 왕복하였다.
		갈때는 시속 15km, 올때는 시속 12km로 이동하여
		총 45분이 걸렸다.
		두 지점 x와 y의 각각 소요시간과
		왕복으로 이동한 총 거리를 구하시오.
	[정답]
		소요시간 : x = 20분, y = 25분
		왕복 총 거리 : 10km
*/

public class 반복문_개념05_두지점 {
	public static void main(String[] args) {
		
		/*
			60분 : 15km = 1분 : n
			60n = 15
			n = 15 / 60
		 */
		
		double 갈때분속 = 15 / 60.0;
		double 올때분속 = 12 / 60.0;
		
		int x = 45;
		int y = 0;
		
		boolean run = true;
		while(run) {
			if(x * 갈때분속 == y * 올때분속) {
				System.out.println(x + " " + y);
				run = false;
			} else {
				x = x - 1;
				y = y + 1;
			}
		}
		
		double 갈때거리 = x * 갈때분속;
		double 올때거리 = y * 올때분속;
		System.out.println(갈때거리 + 올때거리);
		
	}
}