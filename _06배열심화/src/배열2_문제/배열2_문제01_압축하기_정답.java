package 배열2_문제;

import java.util.Arrays;

/*
	[문제]
		아래 before배열은 압축하기 전의 데이터이다.
		연속으로 이뤄진 데이터를 모아 압축하려 한다.
		예)
			33		=> {3, 2}
			55555	=> {5, 5}
			...
			after 배열의 0번은 압축할 값, 1번은 연속된 수의 개수를 저장하고,
			그 값을 전부 출력하시오.
	[정답]
		33    ==> {3,2}
		55555 ==> {5,5}
		3     ==> {3,1}
		444   ==> {4,3}
*/

public class 배열2_문제01_압축하기_정답 {
	public static void main(String[] args) {
		
		int[] before = {3, 3, 5, 5, 5, 5, 5, 3, 4, 4, 4};		
		int[][] after = new int[4][2];
		
		// after[0][0] 0열 : 숫자(3)
		// after[0][1] 1열 : 개수(2)
		
		
		after[0][0] = before[0];
		after[0][1] = 1;
		
		/*
			after = [
				[3, 1],
				[0, 0],
				[0, 0],
				[0, 0],
			]
			
			y = 0, i = 1	after[0][0] == before[1]	true
							after = [
								[3, 2],
								[0, 0],
								[0, 0],
								[0, 0],
							]
			y = 0, i = 2	after[0][0] == before[2]	false
					y = 1	after[1][0] = 5
							after[1][1] = 1
							after = [
								[3, 2],
								[5, 1],
								[0, 0],
								[0, 0],
							]
					....
		 */
		
		int y = 0;
		for(int i=1; i<before.length; i++) {
			if(after[y][0] == before[i]) {
				after[y][1] += 1;
			} else {
				y += 1;
				after[y][0] = before[i];
				after[y][1] = 1;
			}
		}
		
		for(int i=0; i<after.length; i++) {
			System.out.println(Arrays.toString(after[i]));
		}
	}
}





