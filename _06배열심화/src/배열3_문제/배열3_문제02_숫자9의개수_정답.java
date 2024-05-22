package 배열3_문제;

import java.util.Arrays;

/*
	[문제]
		아래 mine배열의 숫자 0의 자리에
		주변 8방향을 검사 해 9의 개수를 저장하고 출력하시오.
	[정답]
	 	{2, 9, 2},
	 	{9, 4, 9},
	 	{1, 3, 9}
*/

public class 배열3_문제02_숫자9의개수_정답 {
	public static void main(String[] args) {
		
		int[][] mine = {
			{0, 9, 0},
			{9, 0, 9},
			{0, 0, 9}
		};
		
		/*
		 	[-1,-1], [-1,0], [-1,1]
			[ 0,-1], [ 0,0], [ 0,1]
			[ 1,-1], [ 1,0], [ 1,1]
		*/
		
		for(int i=-1; i<=1; i++) {
			for(int j=-1; j<=1; j++) {
				System.out.printf("[%d,%d]\t", i, j);
			}
			System.out.println();
		}
		
		int size = mine.length;
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				
				// mine배열의 값이 0인 곳만 검사를 진행
				if(mine[i][j] == 0) {
					
					int count = 0;
					// 8방향을 검사를 진행
					for(int y=-1; y<=1; y++) {
						if(size <= i + y || i + y < 0) continue;
						for(int x=-1; x<=1; x++) {
							if(size <= j + x || j + x < 0) continue;
							
							if(mine[i + y][j + x] == 9) {
								count += 1;
							}
						}
					}
					
					mine[i][j] = count;
				}
				
			}
		}
		
		for(int i=0; i<size; i++) {
			System.out.println(Arrays.toString(mine[i]));
		}
		
	}
}
