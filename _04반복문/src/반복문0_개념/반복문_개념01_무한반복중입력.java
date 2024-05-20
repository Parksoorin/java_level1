package 반복문0_개념;

import java.util.Scanner;

/*
	# 반복문 종료
		1. 무한 반복을 하면서 숫자를 입력받는다.
		2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
		예)
			숫자입력(EXIT:-100) : 1
			숫자입력(EXIT:-100) : 3
			숫자입력(EXIT:-100) : 4
			숫자입력(EXIT:-100) : -100
			
			프로그램 종료
 */

public class 반복문_개념01_무한반복중입력 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.print("숫자입력[EXIT:-100] : ");
			int num = scan.nextInt();
			
			if(num == -100) {
				System.out.println("프로그램 종료");
				run = false;
			}else {
				System.out.println(num);
			}
		}
		
	}
}
