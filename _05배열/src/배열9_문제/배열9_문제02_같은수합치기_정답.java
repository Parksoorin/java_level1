package 배열9_문제;

import java.util.Arrays;

/*
	[문제]
		input배열의 데이터를 순차적으로 arr에 저장하는데,
		만약 저장하려는 수와 그 앞의 수가 서로 같으면 합친다. (계속 중첩 적용)
		마지막 arr의 값을 출력하시오.
			8 :: arr = {8}
			4 :: arr = {8, 4}
			2 :: arr = {8, 4, 2}
			2 :: arr = {8, 4, 4} => {8, 8} => {16}  
			4 :: arr = {16, 4}
			4 :: arr = {16, 8}  
			8 :: arr = {16, 16} => {32}
	[정답]
		arr = {32, 0, 0, 0, 0, 0, 0}
*/

public class 배열9_문제02_같은수합치기_정답 {
	public static void main(String[] args) {
		
		int[] input = {8, 4, 2, 2, 4, 4, 8};
		int[] arr = new int[input.length];
		
		/*
			arr = [16, 0, 0, 0, 0, 0, 0]
			
			index = 0, i = 1
				arr[0] == input[1]	false
				index = 1
				arr[1] = input[1]
			index = 1, i = 2
				arr[1] == input[2]	false
				index = 2
				arr[2] = input[2]
			index = 2, i = 3
				arr[2] == input[3]	true
				arr[2] = 4
				arr[2] != arr[1]	false
				arr[2] = 0
				index = 1
				arr[1] = arr[1] * 2
				
				arr[1] != arr[0]	false
				arr[1] = 0
				index = 0
				arr[0] = arr[0] * 2
			...
		 */
		
		int index = 0;
		arr[index] = input[0];
		
		
		for(int i=1; i<input.length; i++) {
			System.out.println(Arrays.toString(arr));
			
			if(arr[index] == input[i]) {
				arr[index] = arr[index] * 2;
				
				while(true) {
					if(index == 0) {
						break;
					} else if(arr[index] != arr[index - 1]) {
						break;
					} else {
						System.out.println(Arrays.toString(arr));
						arr[index] = 0;
						index -= 1;
						arr[index] = arr[index] * 2;
					}
				}
				
			} else {
				index += 1;
				arr[index] = input[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
}
