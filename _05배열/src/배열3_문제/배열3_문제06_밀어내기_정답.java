package 배열3_문제;

import java.util.Arrays;

/*
	[문제1] arr1 배열의 값들을 앞으로 한칸씩 당기고 맨 뒤에 a의 값을 저장한다.
	[정답1] arr1 = {20,30,40,50,90}
		
	[문제2] arr2 배열을 뒤로 하나씩 밀어낸 후 맨 앞에 b의 값을 저장한다.
	[정답2] arr2 = {60,10,20,30,40}
*/

public class 배열3_문제06_밀어내기_정답 {
	public static void main(String[] args) {
		
		/*
		 	[풀이1]
		 		i = 0	arr1[0] = arr1[1]	arr1 = [20, 20, 30, 40, 50]
		 		i = 1	arr1[1] = arr1[2]	arr1 = [20, 30, 30, 40, 50]
		 		i = 2	arr1[2] = arr1[3]	arr1 = [20, 30, 40, 40, 50]
		 		i = 3	arr1[3] = arr1[4] 	arr1 = [20, 30, 40, 50, 50]
		 		
		 		arr1[4] = 90	arr1 = [20, 30, 40, 50, 90]
		 */
		int[] arr1 = { 10,20,30,40,50 };
		int a = 90;
		
		for(int i=0; i<arr1.length - 1; i++) {
			arr1[i] = arr1[i + 1];
		}
		arr1[arr1.length - 1] = a;
		System.out.println(Arrays.toString(arr1));
		
		/*
			[풀이2]
				i = 4	arr2[4] = arr2[3]	arr2 = [10, 20, 30, 40, 40]
				i = 3	arr2[3] = arr2[2]	arr2 = [10, 20, 30, 30, 40]
				i = 2	arr2[2] = arr2[1]	arr2 = [10, 20, 20, 30, 40]
				i = 1	arr2[1] = arr2[0]	arr2 = [10, 10, 20, 30, 40]
				
				arr2[0] = 60
		 */
		int[] arr2 = { 10,20,30,40,50 };
		int b = 60;
		
		for(int i=arr2.length - 1; i>0; i--) {
			arr2[i] = arr2[i - 1];
		}
		arr2[0] = b;
		System.out.println(Arrays.toString(arr2));
		
	}
}







