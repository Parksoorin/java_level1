package 배열3_문제;

import java.util.Arrays;
import java.util.Scanner;

/*
	[문제]
		번호 2개를 입력받아 성적을 교체하시오.
		단, 없는 번호 입력시 예외처리를 하시오.
	[예시]	
		번호1 입력 : 1002
		번호2 입력 : 1003
		결과 : { 87, 45, 11, 98, 23 }
		
		번호1 입력 : 1000
		번호2 입력 : 1003
		결과 : 번호를 잘못 입력했습니다.
*/

public class 배열3_문제05_점수교체_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		
		System.out.print("번호1 입력 : ");
		int bunho1 = scan.nextInt();
		
		System.out.print("번호2 입력 : ");
		int bunho2 = scan.nextInt();
		
		int index1 = -1;
		int index2 = -1;
		for(int i=0; i<numbers.length; i++) {
			if(bunho1 == numbers[i]) {
				index1 = i;
			}
			if(bunho2 == numbers[i]) {
				index2 = i;
			}
		}
		if(index1 == -1 || index2 == -1) {
			System.out.println("번호를 잘못입력했습니다.");
		} else {
			int temp = scores[index1];
			scores[index1] = scores[index2];
			scores[index2] = temp;
			
			System.out.println(Arrays.toString(scores));
		}
		
		
		scan.close();
		
	}
}
