package 배열4_문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
	[문제]
		1. arr배열에 1~100 사이의 랜덤값 6개를 저장한다.
			예) arr = {7, 45, 3, 6, 7, 1}
		2. 배열의 값을 차례대로 출력한다. 그리고 선택 보기를 출력한다.
			예)
				1번 : 7
				(1)홀 (2) 짝
				
				2번 : 45
				(1)홀 (2) 짝
				...
		3. 제시된 문제가 홀수이면 1, 짝수이면 2를 선택한다.
		4. 6회 반복하고 정답개수를 출력한다.
*/

public class 배열4_문제03_배열홀짝_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		int count = 0;
		for(int i=0; i<6; i++) {
			System.out.println((i+1) + "번 : " + arr[i]);
			System.out.println("(1)홀 (2)짝");
			
			int answer = 1;
			if(arr[i] % 2 == 0) {
				answer = 2;
			}
			
			int select = scan.nextInt();
			
			if(answer == select) {
				System.out.println("정답!");
				count += 1;
			} else {
				System.out.println("오답!");
			}
		}
		System.out.println("정답 개수 = " + count);
		
	}
}
