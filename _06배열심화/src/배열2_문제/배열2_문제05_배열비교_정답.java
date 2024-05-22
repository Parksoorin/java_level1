package 배열2_문제;

import java.util.Arrays;

/*
	[문제]
		arr배열과 result배열을 비교해서 겹치는 값이 있으면
		두 배열의 값을 전부 0으로 변경하시오.
		단, 겹치는 값이 여러개 있으면 전부 0으로 변경하시오.
	[정답]
		arr = {
			{0, 0, 4},
			{0, 0, 0},
			{0, 8, 9},
		}
		
		result = {0, 0, 0, 0, 7}
 */

public class 배열2_문제05_배열비교_정답 {
	public static void main(String[] args) {
		
		int[][] array = {
			{1,3,4},
			{5,6,3},
			{6,8,9},
		};
		
		int[] result = {1, 5, 6, 3, 7};
		
		/*
			i = 0
			check = false
				j = 0
					k = 0	1 == 1	true		check = true
					arr = {0,3,4},
						  {5,6,3},
						  {6,8,9},
					k = 1	1 == 3	false
					k = 2	1 == 4	false
				j = 1
					k = 0	1 == 5	false
					k = 1	1 == 6	false
					k = 2	1 == 3	false
				j = 2
					k = 0	1 == 6	false
					k = 1	1 == 8	false
					k = 2	1 == 9	false
			...		
		 */
		
		for(int i=0; i<result.length; i++) {
			
			boolean check = false;
			for(int j=0; j<array.length; j++) {
				for(int k=0; k<array[j].length; k++) {
					if(result[i] == array[j][k]) {
						check = true;
						array[j][k] = 0;
					}
				}
			}
			
			if(check) {
				result[i] = 0;
			}
		}
		
		System.out.println(Arrays.toString(result));
		
		for(int i=0; i<array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		
	}
}




