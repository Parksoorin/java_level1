package 배열8_문제;

import java.util.Arrays;

/*
	[문제]
		input배열 안의 값들은 추가와 삭제를 반복할 값들로
		짝수 인덱스의 값은 "추가"이고,
		중복된 값은 추가할 수 없다.
		
		홀수 인덱스의 값은 "삭제"이고,
		삭제한 자리는 뒤에서부터 앞으로 밀어내고 0으로 표시한다.
		또한 없는 값은 삭제할 수 없다.
		
		input배열의 값들을 전부 위와 같은 원리로
		arr배열에 처리하고 처리과정을 출력하시오.
	[정답]
		[10, 0, 0]
		삭제할 값이 없습니다.
		[10, 30, 0]
		[30, 0, 0]
		중복됩니다.
		[0, 0, 0]
*/

public class 배열8_문제03_인풋추가삭제_정답 {
	public static void main(String[] args) {
		
		int[] arr = {0, 0, 0};
		int[] input = {10, 20, 30, 10, 30, 30};
		
		/*
			0 1 2 3 4 5
			
			짝수(추가)
				0		arr = [10,  0, 0]
				2		arr = [10, 30, 0]
				4		중복되는 값으로 추가할 수 없음
			홀수(삭제)
				1		삭제할 값이 없음
				3		arr = [30, 0, 0]
				5		arr = [ 0, 0, 0]
		 */
		
		
		int index = 0;
		for(int i=0; i<input.length; i++) {
			if(i % 2 == 0) {
				// 추가
				// 중복 검사
				boolean check = true;
				for(int j=0; j<index; j++) {
					if(input[i] == arr[j]) {
						check = false;
						break;
					}
				}
				
				if(check) {
					arr[index] = input[i];
					index += 1;
					System.out.println(Arrays.toString(arr));
				} else {
					System.out.println("중복됩니다.");
				}
			} else {
				// 삭제
				// 삭제할 값이 arr배열에 존재하는 검사
				int check = -1;
				for(int j=0; j<index; j++) {
					if(input[i] == arr[j]) {
						check = j;
						break;
					}
				}
				
				if(check == -1) {
					System.out.println("삭제할 값이 없습니다.");
				} else {
					for(int j=check; j<arr.length - 1; j++) {
						arr[j] = arr[j + 1];
					}
					index -= 1;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		
	}
}
