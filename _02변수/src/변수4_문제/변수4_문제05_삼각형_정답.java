package 변수4_문제;

/*
	[문제]
		가로가 3이고 세로가 6인 삼각형 3개의 넓이의 합이
		가로가 7이고 세로가 9인 사각형 1개의 넓이보다 작은지 여부를
		true 또는 false로 표현하시오.
	[정답]
		true
*/

public class 변수4_문제05_삼각형_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				넓이1 = 3 * 6 / 2 * 3
				넓이2 = 7 * 9
		 */		
		
		int 삼각형_가로 = 3;
		int 삼각형_세로 = 6;
		int 삼각형_넓이 = 3 * 6 / 2;
		
		int 사각형_가로 = 7;
		int 사각형_세로 = 9;
		int 사각형_넓이 = 사각형_가로 * 사각형_세로;
		
		int 넓이1 = 삼각형_넓이 * 3; 
		int 넓이2 = 사각형_넓이;
		
		boolean result = 넓이1 < 넓이2;
		
		System.out.println("넓이1 = " + 넓이1);
		System.out.println("넓이2 = " + 넓이2);
		System.out.println(result);
		
	}
}
