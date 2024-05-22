package 배열3_문제;

import java.util.Arrays;

/*
	[문제]
		4번째 마다 바로 앞의 값과 교환하시오.
	[정답]
		arr = {10,20,40,30,50,60,80,70,90}
*/

public class 배열3_문제03_교환_정답 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60,70,80,90};
		
		/*
			[풀이]
				i = 0	i%4 == 3	false	
				i = 1	i%4 == 3	false	
				i = 2	i%4 == 3	false	
				i = 3	i%4 == 3	true	arr = [10,20,40,30,50,60,70,80,90]
				i = 4	i%4 == 3	false
				i = 5	i%4 == 3	false
				i = 6	i%4 == 3	false
				i = 7	i%4 == 3	false	arr = [10,20,40,30,50,60,80,70,90]
				i = 8	i%4 == 3	false
		 */
		
		for(int i=0; i<arr.length; i++) {
			if(i % 4 == 3) {
				int temp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
