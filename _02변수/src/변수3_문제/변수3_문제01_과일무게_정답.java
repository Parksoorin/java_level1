package 변수3_문제;

/*
	[문제]
		귤 6개의 무게는 840g
		사과 3개의 무게는 750g 이다.
		귤 4개의 무게가 사과 2개의 무게보다 무거운지를
		true 또는 false로 표현하시오.
	[정답]
		true
*/

public class 변수3_문제01_과일무게_정답 {
	public static void main(String[] args) {

		/*
			[풀이]
				귤 6개 = 840g
				귤 1개 = 840 / 6 = 140g
				
				사과 3개 = 750g
				사과 1개 = 750 / 3 = 250g
				
				귤 4개 = 140 * 4 = 560g
				사과 2개 = 250 * 2 = 500g
		 */
		
		int 귤6 = 840;
		int 사과3 = 750;
		
		int 귤1 = 귤6 / 6;
		int 사과1 = 사과3 / 3;
		
		int 귤4 = 귤1 * 4;
		int 사과2 = 사과1 * 2; 

		boolean check = 귤4 > 사과2;
		
		System.out.println(check);
		
	}
}		
