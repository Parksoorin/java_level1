package 배열6_문제;

import java.util.Arrays;

/*
	[문제]
		1. seatList는 영화관 7자리를 의미한다.
		2. seatList의 값들은 예매한 회원 번호를 의미한다.
		3. numList는 회원번호이다.
		4. countList는 각 회원들이 예매를 얼마나 했는지 개수를 표현한다.
		5. seatList를 검사해서 각 회원들이 예매한 수를 countList에 저장한다.
	[정답]
		countList = {1,1,2,0}
*/

public class 배열6_문제08_예매찾기_정답 {
	public static void main(String[] args) {
		
		int[] seatList = {1003,1003,0,0,1002,0,1001};
		
		int[] numList   = {1001,1002,1003,1004};
		int[] countList = {   0,   0,   0,   0};
		
		/*
			i = 0
				j = 0  1001 == seatList[0]	false
				j = 1  1001 == seatList[1]  false
				j = 2  1001 == seatList[2]  false
				j = 3  1001 == seatList[3]  false
				j = 4  1001 == seatList[4]  false
				j = 5  1001 == seatList[5]  false
				j = 6  1001 == seatList[6]  true
					countList = [1, 0, 0, 0]
			...
		 */
		
		for(int i=0; i<numList.length; i++) {
//			int count = 0;
			for(int j=0; j<seatList.length; j++) {
				if(numList[i] == seatList[j]) {
					countList[i] += 1;		// countList[i] = countList[i] + 1
//					count += 1;
				}
			}
			
//			countList[i] = count;
		}
		System.out.println(Arrays.toString(countList));
		
	}
}
