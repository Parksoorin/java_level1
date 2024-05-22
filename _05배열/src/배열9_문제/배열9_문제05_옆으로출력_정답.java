package 배열9_문제;

/*
	[문제]
		아래와 같이 구구단을 옆으로 출력하시오.
	[정답]	
		2 * 1 = 2	3 * 1 = 3	......		9 * 1 = 9
		2 * 2 = 4	3 * 2 = 6	......		9 * 2 = 18
		2 * 3 = 6	3 * 3 = 9	......		9 * 3 = 27
				.....
		
		2 * 9 = 18  3 * 9 = 27  ......		9 * 9 = 81
*/

public class 배열9_문제05_옆으로출력_정답 {
	public static void main(String[] args) {
		
		/*
			i = 1
				j = 2	[2 * 1 = 2]	j = 3  [3 * 1 = 3] j = 4 ...
			i = 2
				j = 2	[2 * 2 = 4] j = 3  [ 3 * 2 = 6] ....
		 */
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}
		
	}
}




