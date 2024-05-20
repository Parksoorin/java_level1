package 반복문3_문제;

import java.util.Random;

/*
	[문제]
		반복문을 사용하여 랜덤 숫자 1~9를 5번 출력한다.
		1. 랜덤 숫자 중 가장 큰 수와 번호를 출력한다.
		   (번호는 출력 순서이다.)
		2. 가장 큰 수가 여러개 있다면 가장 첫 번째 번호를 출력한다.
	 [예시]
	   	3, 7, 4, 7, 5
	   	가장 큰 수 : 7
	   	번호 : 2
	   	* 가장 큰 수가 2개이지만, 첫번째 번호를 출력한다.
*/


public class 반복문3_문제01_가장큰수위치_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int maxNum = 0;
		int maxIndex = 0;
		
		for(int i=1; i<=5; i++) {
			int r = ran.nextInt(9) + 1;
			System.out.print(r + " ");
			
			if(maxNum < r) {
				maxNum = r;
				maxIndex = i;
			}
		}
		System.out.println();
		
		System.out.println("가장 큰 수 : " + maxNum);
		System.out.println("번호 : " + maxIndex);
		
	}
}
