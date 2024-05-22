package 배열9_문제;

import java.util.Scanner;

/*
	[문제]
		숫자 한 개를 입력받아
		입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
	[예시]
		Enter Number ? 1000
		1000보다 큰 첫 번째 소수는 1009
		
		Enter Number ? 500
		500보다 큰 첫 번째 소수는 503
*/

public class 배열9_문제04_다음소수찾기_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int number = scan.nextInt();
		
		/*
			number = 1000
			
			1001 소수이니?	false
			1002 소수이니?	false
			1003 소수이니?	false
			1004 소수이니?	false
			...
			1009 소수이니?	true	반복종료
		 */
		
		int i = number + 1;
		while(true) {
			
			int count = 0;
			// 소수이니?	예) i = 1001
			for(int j=1; j<=i; j++) {
				// 1001 % 3 == 0
				if(i % j == 0) {
					count += 1;
				}
			}
			
			if(count == 2) {
				System.out.println(i);
				break;
			}
			
			i += 1;
		}
		
		
		scan.close();		
	}
}




