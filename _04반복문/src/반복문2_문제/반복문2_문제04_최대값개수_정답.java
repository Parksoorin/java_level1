package 반복문2_문제;

import java.util.Random;

/*
	[문제]
		랜덤으로 1~10을 10번 출력하고
		가장 큰 수를 출력하시오.
		단, 가장 큰 수가 여러번 나온 경우
		중복 출력된 횟수도 함께 출력하시오.
*/

public class 반복문2_문제04_최대값개수_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int maxNum = 0;
		int count = 0;
		
		for(int i=1; i<=10; i++) {
			int r = ran.nextInt(10) + 1;
			System.out.print(r + " ");
			
			if(maxNum < r) {
				maxNum = r;
				count = 1;
			} else if(maxNum == r) {
				count += 1;
			}
		}
		
		System.out.println();
		System.out.println("가장 큰 수 = " + maxNum);
		System.out.println("중복 횟수 = " + count);
		
	}
}
