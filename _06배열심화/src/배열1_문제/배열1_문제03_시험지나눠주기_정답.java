package 배열1_문제;

import java.util.Random;

/*
	[문제]
		아래 2차원배열은 3학년 1반의 학생 수를 표현한 것으로
		세로4 가로5의 총 학생 수는 20명이다.
		배열 안의 각각의 값들은 각 학생별 시험을 보기위한 필요 페이지 수이다.
		학생마다 필요한 페이지 수가 다르다.
		
		시험지를 인덱스 위치(0,0)부터 나눠주려 할 때
		지그재그의 형태로 전달하려한다.
		
		첫 번째 줄은 앞에서부터 뒤로 이동한다.			3, 1, 5, 4, 1
		두 번째 줄은 뒤에서부터 앞으로 이동한다.			8, 2, 4, 6, 1
		다시 세 번째 줄은 앞에서부터 뒤로 이동한다.		2, 3, 5, 5, 2
		다시 네 번째 줄은 뒤에서부터 앞으로 이동한다.		2, 1, 7, 1, 6
		
		랜덤으로 학생수(1~20)를 저장하고,
		각 학생별로 필요한 페이지 수의 합을 출력한다.
		
		예) 랜덤숫자 : 7	=> {3 + 1 + 5 + 4 + 1} + {8 + 2} = 24
		예) 랜덤숫자 : 12	=> {3 + 1 + 5 + 4 + 1} + {8 + 2 + 4 + 6 + 1} + {2 + 3} = 40
 */

public class 배열1_문제03_시험지나눠주기_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[][] arr = {
			{3,1,5,4,1},	// 0 짝수행(앞)
			{1,6,4,2,8},	// 1 홀수행(뒤)
			{2,3,5,5,2},	// 2
			{6,1,7,1,2},	// 3
		};
		
		/*
			0행		0 1 2 3 4
			1행		4 3 2 1 0
			2행		0 1 2 3 4
			3행		4 3 2 1 0
		 */
		
		for(int i=0; i<4; i++) {
			if(i % 2 == 0) {
				for(int j=0; j<5; j++) {
//					System.out.print(j + " ");
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for(int j=4; j>=0; j--) {
//					System.out.print(j + " ");
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		int r = ran.nextInt(20) + 1;
		r = 12;
		System.out.println("랜덤 숫자 : " + r);
		
		int total = 0;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(i % 2 == 0) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
					total += arr[i][j];
					count += 1;
					
					if(count == r) {
						i = 100;
						break;
					}
				}
			} else {
				for(int j=arr[i].length - 1; j>=0; j--) {
					System.out.print(arr[i][j] + " ");
					total += arr[i][j];
					count += 1;
					
					if(count == r) {
						i = 100;
						break;
					}
				}
			}
			System.out.println();
		}
		System.out.println(total);
		
	}
}
