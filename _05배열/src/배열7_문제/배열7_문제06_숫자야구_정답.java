package 배열7_문제;

import java.util.Arrays;
import java.util.Scanner;

/*
	[문제]
		1. me에 1~9 사이의 숫자 3개를 저장한다.
		   단, 중복되는 숫자는 저장할 수 없다.
		2. com과 me를 비교해 정답을 맞출 때까지 반복한다.
		3. 숫자와 자리가 같으면	strike += 1
		   숫자만 같고 자리가 틀리면 ball += 1
	[예시]
		정답 : 1 7 3
		입력 : 3 1 5			>>> 2b
		입력 : 1 5 6			>>> 1s
*/

public class 배열7_문제06_숫자야구_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];	
		
		while(true) {
			
			for(int i=0; i<me.length; i++) {
				System.out.print("입력 : ");
				int num = scan.nextInt();
				
				boolean check = false;
				for(int j=0; j<i; j++) {
					if(num == me[j]) {
						check = true;
						break;
					}
				}
				
				if(check == false) {
					me[i] = num;
				} else {
					System.out.println("중복되는 숫자입니다.");
					i -= 1;
				}
			}
			
			System.out.println("com = " + Arrays.toString(com));
			System.out.println("me = " + Arrays.toString(me));
			
			int strike = 0;
			int ball = 0;
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<me.length; j++) {
					if(com[i] == me[j]) {
						if(i == j) {
							strike += 1;
						} else {
							ball += 1;
						}
					}
				}
			}
			System.out.println(ball + "b " + strike + "s");
			
			if(strike == 3) {
				break;
			}
			
		}
		
		
		scan.close();
		
	}
}














