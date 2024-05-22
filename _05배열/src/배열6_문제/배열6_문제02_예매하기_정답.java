package 배열6_문제;

import java.util.Arrays;

/*
	[문제]
		1. seatList는 현재 영화관 예매상황이다.
		2. seatIndex는 예매하려는 좌석 번호이고,
		3. userList는 회원번호이다.
		4. seatList와 user를 가지고 예매 후 전체 예매상황을 출력하시오.
		5. 좌석이 비어있으면 예매할 수 있다.
		6. 좌석이 이미 예매되어있으면 예매가 불가하다.
	[정답]
		1003회원님, 2번째 예매를 완료했습니다.
		[1003, 1003, 1003, 0, 1002, 0, 1001]
		
		1002회원님, 예매할 수 없습니다.
		[1003, 1003, 1003, 0, 1002, 0, 1001]
		
		1005회원님, 3번째 예매를 완료했습니다.
		[1003, 1003, 1003, 1005, 1002, 0, 1001]
*/

public class 배열6_문제02_예매하기_정답 {
	public static void main(String[] args) {
		
		int[] seatList = {1003,1003,0,0,1002,0,1001};
		
		int[] seatIndex = {   2,   1,   3};
		int[] userList  = {1003,1002,1005};
		
		for(int i=0; i<seatIndex.length; i++) {
			System.out.print(userList[i] + "회원님, ");
			
			if(seatList[seatIndex[i]] == 0) {
				// 비어있으면
				seatList[seatIndex[i]] = userList[i];
				System.out.println(seatIndex[i] + "번째 예매를 완료했습니다.");
			} else {
				// 이미 예약이 완료된 상황이면
				System.out.println("예매할 수 없습니다.");
			}
			
			System.out.println(Arrays.toString(seatList));
			
		}
		
	}
}







