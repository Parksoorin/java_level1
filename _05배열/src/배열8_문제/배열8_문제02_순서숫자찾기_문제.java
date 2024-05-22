package 배열8_문제;

import java.util.Scanner;

/*
	[문제]
		input배열 안의 값들이 arr배열의 값들과
		연속해서 일치하면, true
		그렇지않으면, false를 출력하시오.
	[정답]
		input1 ==> true
		input2 ==> false
*/

public class 배열8_문제02_순서숫자찾기_문제 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {1, 3, 3, 6, 5, 6, 1, 8, 9};
		
		int[] input1 = {6, 1, 8};
		int[] input2 = {6, 3};
		
		while(true) {
			System.out.println("[1] input1 정답 확인");
			System.out.println("[2] input2 정답 확인");
			
			System.out.print("번호 입력 : ");
			int select = scan.nextInt();
			
			if(select == 0) { break; }
			else if(select == 1) {}
			else if(select == 2) {}
		}
		
		scan.close();
		
	}
}
