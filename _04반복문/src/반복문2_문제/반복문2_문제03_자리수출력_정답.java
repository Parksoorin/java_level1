package 반복문2_문제;

import java.util.Random;

/*
	[문제]
		1 ~ 99999 사이의 랜덤 숫자를 저장하고
		자리 수가 몇 자리인지 구하시오.
		예) 
			8		: 1자리
			102		: 3자리
			88		: 2자리
			919		: 3자리
*/

public class 반복문2_문제03_자리수출력_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum = ran.nextInt(99999) + 1;
		rNum = 919;
		System.out.print(rNum);
		
		int temp = rNum;
		
		int count = 0;
		boolean run = true;
		while(run) {
			
			temp /= 10;		// temp = temp / 10
			count += 1;
			
			if(temp == 0) {
				run = false;
			}
		}
		
		System.out.println(" : " + count + "자리");
		
	}
}
