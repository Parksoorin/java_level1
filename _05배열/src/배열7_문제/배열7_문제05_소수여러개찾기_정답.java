package 배열7_문제;

import java.util.Scanner;

/*
	[문제]
		정수 한 개를 입력받아
		2부터 해당 숫자까지 모든 소수를 출력하시오.
	[예시]
		입력 : 20
		결과 : 2, 3, 5, 7, 11, 13, 17, 19
*/

public class 배열7_문제05_소수여러개찾기_정답 {
	public static void main(String[] args) {
		
		/*
			입력 : 5
			
			2 (소수)
				2 % 1 == 0	count = 1
				2 % 2 == 0	count = 2
			3 (소수)
				3 % 1 == 0	count = 1
				3 % 2 == 0
				3 % 3 == 0	count = 2
			4
				...
			5
				...
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = scan.nextInt();
		
		for(int i=2; i<=num; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					count += 1;
				}
			}
			if(count == 2) {
				System.out.print(i + " ");
			}
		}
		
		scan.close();
		
	}
}
