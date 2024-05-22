package 배열6_문제;

import java.util.Arrays;
import java.util.Random;

/*
	[문제]
		1. 컴퓨터 랜덤하게 최대값을 고르게 한다.
		2. 정답이면 해당 값을 0으로 변경한다.
		3. 단, 이미 0으로 변경된 위치를 재선택 할 경우
			"이미 선택 완료된 위치입니다."라는 메세지를 출력한다.
		4. arr배열의 모든 값이 0으로 변경되면, 프로그램은 종료된다.
	[예시]
		랜덤 : 3
		11, 87, 42, 0, 24
		
		랜덤 : 3
		이미 선택 완료된 위치입니다.
		
		랜덤 : 0
		11, 87, 42, 0, 24
		(최대값이 아니므로 아무일안생김)
*/

public class 배열6_문제01_max게임_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = {11, 87, 42, 100, 24};
		
		int count = 0;
		// 0. 반복(무한반복)	
		while(true) {
			System.out.println(Arrays.toString(arr));
			
			// 4. 게임 종료
			//    (3-1) 컴퓨터가 정답을 맞춘 횟수가 5회가 되면 게임종료
			//    (3-2) arr의 모든 요소가 0이면 게임종료
			if(count == arr.length) {
				break;
			}
			
			// 1. 최대값 검색 (최대값, 최대값의 위치)
			//    예) 100, 3(정답)
			int maxNum = 0;
			int maxIndex = 0;
			for(int i=0; i<arr.length; i++) {
				if(maxNum < arr[i]) {
					maxNum = arr[i];
					maxIndex = i;
				}
			}
			
			// 2. 컴퓨터가 랜덤한 인덱스 선택
			//    예) r = 1(오답)
			//    예) r = 3(정답)		arr = [11, 87, 42, 0, 24]
			int r = ran.nextInt(arr.length);
			System.out.println("r = " + r);
			
			// 3. 컴퓨터 선택한 위치가 최대값의 위치인지 검색
			// 4. 컴퓨터가 정답을 맞춘 곳을 또 선택했을 때에 대한 예외처리
			if(arr[r] == 0) {
				System.out.println("이미 선택 완료된 위치입니다.");
			}
			
			if(maxIndex == r) {
				arr[r] = 0;
				System.out.println("정답!");
				count += 1;
			} 
		}
		
	}
}










