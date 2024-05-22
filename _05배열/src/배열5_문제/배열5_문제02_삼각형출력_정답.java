package 배열5_문제;

/*
	[문제]
		b배열을 다음과 같이 삼각형 모양으로 출력하시오.
	[정답]
		 1
		 23
		 456
		 7890
*/

public class 배열5_문제02_삼각형출력_정답 {
	public static void main(String[] args) {
		
		int[] b = {1,2,3,4,5,6,7,8,9,0};	
		
		/*
			[풀이]
				i = 0, row = 0, count = 0	b[0] ↵	row == count	true	 
				i = 1, row = 1, count = 0	b[1]	row == count	false	
				i = 2, row = 1, count = 1	b[2] ↵	row == count	true
				i = 3, row = 2, count = 0	b[3]	row == count	false
				i = 4, row = 2, count = 1	b[4]	row == count	false
				i = 5, row = 2, count = 2	b[5] ↵	row == count	true
				i = 6, row = 3, count = 0	b[6]	row == count	false
				i = 7, row = 3, count = 1	b[7]	row == count	false
				i = 8, row = 3, count = 2	b[8]	row == count	false
				i = 9, row = 3, count = 3	b[9] ↵	row == count	true
		 */
		
		int row = 0;
		int count = 0;
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]);
			
			if(row == count) {
				row += 1;
				count = 0;
				
				System.out.println();
			} else {
				count += 1;
			}
			
		}
	}
}
