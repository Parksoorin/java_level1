package 배열2_문제;

import java.util.Arrays;

/*
	[문제]
		arr, b, c 배열에 공통적으로 존재하는 값을
		result배열에 순차적으로 저장하시오.
	[정답]
		result = {40, 50, 0, 0}
*/

public class 배열2_문제04_배열비교_정답 {
	public static void main(String[] args) {
		
		int[][] arr = {
			{10,20,30},
			{40,50,60},
			{70,80,90},
		};
		
		int[] b = {23,40,30,50};
		int[] c = {4,34,40,50};
		
		int[] result = new int[4];
	
		/*
			index = 0
			i = 0, check = false
				j = 0
					k = 0	b[0] == arr[0][0]	false
					k = 1	b[0] == arr[0][1]	false
					k = 2	b[0] == arr[0][2]	false
				j = 1
					k = 0	b[0] == arr[1][0]	false
					k = 1	b[0] == arr[1][1]	false
					k = 2	b[0] == arr[1][2]	false
				j = 2
					k = 0	b[0] == arr[2][0]	false
					k = 1	b[0] == arr[2][1]	false
					k = 2	b[0] == arr[2][2]	false
			i = 1
				check = false
				j = 0
					k = 0	b[1] == arr[0][0]	false
					k = 1	b[1] == arr[0][1]	false
					k = 2	b[1] == arr[0][2]	false
				j = 1
					k = 0	b[1] == arr[1][0]	false
					k = 1	b[1] == arr[1][1]	true
					check = true
			
				check == true
					c = 0	b[1] == c[0]
					c = 1	b[1] == c[1]
					c = 2	b[1] == c[2]	break
						result[0] = b[1]
						index = 1
			...
		 */
		
		int index = 0;
		for(int i=0; i<b.length; i++) {
			// b의 값과 arr의 값을 비교해서 일치여부 확인
			boolean check = false;
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<arr[j].length; k++) {
					if(b[i] == arr[j][k]) {
						check = true;
						break;
					}
				}
			}
			
			// 일치하면, c도 검사를 진행하고
			if(check) {
				for(int j=0; j<c.length; j++) {
					if(b[i] == c[j]) {
						result[index] = b[i];
						index += 1;
						break;
					}
				}
			}
			// 일치하지 않으면, c검사 진행 X
		}
		System.out.println(Arrays.toString(result));
		
	}
}
