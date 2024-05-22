package 배열7_문제;

import java.util.Arrays;

/*
	[문제]
		arr배열에 중복되는 숫자는 제외하고 숫자 1개씩만 압축해서
		b배열에 저장하시오.
	[정답]
		b = {1, 3, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0}
*/

public class 배열7_문제07_압축_정답 {
	public static void main(String[] args) {
		
		int[] arr = {1,1,1,3,3,3,3,2,2,3,3,3,4,5};		 
		int[] b = new int[arr.length];
		
		int index = 0;
		b[index] = arr[0];
		
		/*
			index = 0									b = [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
					
			i = 1,  index = 0	b[0] != arr[1]	 false
			i = 2,  index = 0	b[0] != arr[2]	 false
			i = 3,  index = 0	b[0] != arr[3]	 true	b = [1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
			i = 4,  index = 1	b[1] != arr[4]   false
			i = 5,  index = 1	b[1] != arr[5]   false
			i = 6,  index = 1	b[1] != arr[6]   false
			i = 7,  index = 1	b[1] != arr[7]   true	b = [1, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
			i = 8,  index = 2	b[2] != arr[8]   false
			i = 9,  index = 2	b[2] != arr[9]   true	b = [1, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
			i = 10, index = 3	b[3] != arr[10]  false
			i = 11, index = 3	b[3] != arr[11]  false
			i = 12, index = 3	b[3] != arr[12]  true	b = [1, 3, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0]
			i = 13, index = 4	b[4] != arr[13]  true	b = [1, 3, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0]
		 */
		
		for(int i=1; i<arr.length; i++) {
			System.out.println("i = " + i + ", index = " + index + ", b[" + index + "] != arr[" + i + "] " + (b[index] != arr[i]) + " " + Arrays.toString(b));
			if(b[index] != arr[i]) {
				index += 1;
				
				b[index] = arr[i];
			}
		}
		System.out.println(Arrays.toString(b));
		
	}
}
