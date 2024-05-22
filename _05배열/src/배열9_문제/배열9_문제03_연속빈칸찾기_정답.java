package 배열9_문제;

import java.util.Arrays;

/*
	[문제]
		arr배열은 숫자1과 0으로 구성되어있다.
		숫자1은 이미 채워진 자리이고, 0은 비어있는 자리이다.
		input변수 값의 의미는 1부터 시작하는 위치를 의미함과 동시에
		연속으로 1으로 채울 칸 수를 의미한다.
		예를들어 input의 값이 3인 경우, 3번째라는 의미로
		인덱스의 값 2부터 3칸이 비어있는지(0) 확인한 후,
		비어있으면 전부 1로 변경해야 한다.
	[정답]
		input = 3 :: 인덱스 2부터 연속으로 3칸 비어있으므로(0)
		input = {0, 1, 1, 1, 1, 1, 0, 0}
		
		input = 4 :: 인덱스 3부터 연속으로 4칸 비어있지 않으므로 변경X
		input = {0, 1, 0, 0, 0, 1, 0, 0}
		
		input = 1 :: 인덱스 0번째에 1칸 비어있으므로(0)
		input = {1, 1, 0, 0, 0, 1, 0, 0}
*/

public class 배열9_문제03_연속빈칸찾기_정답 {
	public static void main(String[] args) {
		
		int[] arr = {0, 1, 0, 0, 0, 1, 0, 0};
		int input = 3;
		
		/*
			input은 
				(1) 위치 : index
				(2) 개수 : count
				
				예) input = 4
					arr = [0, 1, 0, 0, 0, 1, 0, 0]
		 */

		int index = input - 1;
		int count = input;
		
		int total = 0;
		for(int i=0; i<count; i++) {
			if(arr[index + i] == 0) {
				total += 1;
			}
		}
		System.out.println(total);
		
		if(count == total) {
			for(int i=0; i<count; i++) {
				arr[index + i] = 1;
			}
			System.out.println(Arrays.toString(arr));
		} else {
			System.out.println("X");
		}
		
		
	}
}
