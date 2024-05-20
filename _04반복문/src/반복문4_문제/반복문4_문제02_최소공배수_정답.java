package 반복문4_문제;

/*
	[문제]
		철수와 민수는 같은 수영장에 다닌다.
		철수는 4일마다 한번씩 가고 민수는 5일마나 한번씩 같다.
		
		철수와 민수가 2월 3일에 처음 만났다면
		다음에 서로 만나는 날은 언제인지 구하시오.
	[정답]
		23일
*/

public class 반복문4_문제02_최소공배수_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				4와 5의 최소공배수 + 3
		 */
		
		int 처음만난날 = 3;
		
		int 철수 = 4;
		int 민수 = 5;
		
		int 일 = 민수;
		
		boolean run = true;
		while(run) {
			if(일 % 철수 == 0 && 일 % 민수 == 0) {
				run = false;
			} else {
				일 += 1;
			}
		}
		
		System.out.println(일 + 처음만난날 + "일");
		
	}
}
