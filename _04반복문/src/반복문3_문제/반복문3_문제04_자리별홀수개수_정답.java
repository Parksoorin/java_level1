package 반복문3_문제;

import java.util.Scanner;

/*
	[문제]
		1 ~ 10000 사이의 숫자를 입력받고
		자리별 홀수의 개수를 출력하시오.
	[예시]
		561		: 2개
		1		: 1개
		668		: 0개
		9999	: 4개
*/

public class 반복문3_문제04_자리별홀수개수_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1 ~ 10000 숫자 입력 : ");
		int num = scan.nextInt();
		
		int temp = num;
		
		int count = 0;
		boolean run = true;
		while(run) {
			int unit = temp % 10;
			System.out.print(unit + " ");
			if(unit % 2 != 0) {
				count += 1;
			}
			
			temp /= 10;
			if(temp == 0) {
				run = false;
			}
		}
		
		System.out.println();
		System.out.println(num + " : " + count + "개");
		
		scan.close();
		
	}
}
