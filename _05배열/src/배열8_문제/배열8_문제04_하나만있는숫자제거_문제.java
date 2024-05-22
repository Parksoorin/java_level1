package 배열8_문제;

import java.util.Scanner;

/*
	[문제]
		test배열에서 혼자 있는 숫자를 제거해
		temp배열에 저장하시오.
	[정답]
		test1 = {1, 2, 2, 1}
		test2 = {4, 4}
		test3 = {1, 1, 1, 1, 1}
*/

public class 배열8_문제04_하나만있는숫자제거_문제 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] test1 = {1, 2, 3, 2, 1};
		int[] test2 = {1, 3, 4, 4, 2};
		int[] test3 = {1, 1, 1, 1, 1};
		
		int[] temp = null;
		
		while(true) {
			System.out.println("(1) test1 결과");
			System.out.println("(2) test2 결과");
			System.out.println("(3) test3 결과");
			System.out.println("(0) 종료");
			
			int choice = scan.nextInt();
			
			if(choice == 0) { break; }
			else if(choice == 1) {}
			else if(choice == 2) {}
			else if(choice == 3) {}
		}
		
	}
}
