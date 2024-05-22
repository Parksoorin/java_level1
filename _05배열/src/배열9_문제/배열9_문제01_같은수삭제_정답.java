package 배열9_문제;

import java.util.Arrays;

/*
	[문제]
		1. input의 데이터를 a배열에 순차적으로 저장한다.
		2. 단, 저장하려는 숫자가 현재 숫자와 같으면 둘 다 삭제한다.
	
			a = {1, 3, 0, 0, 0, 0, 0, 0, 0, 0}
			a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}
			a = {1, 2, 0, 0, 0, 0, 0, 0, 0, 0}
			a = {1, 2, 1, 0, 0, 0, 0, 0, 0, 0}
			a = {1, 2, 0, 0, 0, 0, 0, 0, 0, 0}
			a = {1, 2, 4, 0, 0, 0, 0, 0, 0, 0}
			a = {1, 2, 0, 0, 0, 0, 0, 0, 0, 0}
	[정답]
		a = {1, 2, 0, 0, 0, 0, 0, 0, 0, 0}
*/

public class 배열9_문제01_같은수삭제_정답 {
	public static void main(String[] args) {
		
		int[] input = {1, 3, 3, 2, 1, 1, 4, 4};
		int[] a = new int[input.length];
		
		/*
			a = [1, 2, 0, 0, 0, 0, 0, 0]
			
			index = 0, i = 1
				a[0] != input[1]	true
				index = 1
				a[1] = input[1]
			index = 1, i = 2
				a[1] != input[2]	false
				a[1] = 0
				index = 0
			index = 0, i = 3
				a[0] != input[3]	true
				index = 1
				a[1] = input[3]
			...
		 */
		
		int index = 0;
		a[index] = input[0];
		
		for(int i=1; i<input.length; i++) {
			// a에 위치해 있는 숫자와 input의 숫자가 서로 다르면,
			if(a[index] != input[i]) {
				index += 1;
				a[index] = input[i];
			} else {
			// a에 위치해 있는 숫자와 input의 숫자가 서로 같으면,
				a[index] = 0;
				index -= 1;
			}
			
			System.out.println(Arrays.toString(a));
		}
		
	}
}
