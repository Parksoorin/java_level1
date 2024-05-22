package 배열0_개념;

import java.util.Scanner;

/*
	[문제]
		값을 입력받고 인덱스를 출력하시오.
		단, 없는 값이면 -1을 출력하시오.
	[예시1] 
		입력 : 67
		결과 : 4
	[예시2] 
		입력 : 56
		결과 : -1	 
 */

public class 배열_개념01_검색예외처리 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] array = {10, 543, 52, 24, 67};
		
		System.out.print("입력 : ");
		int num = scan.nextInt();
		
		int index = -1;
		for(int i=0; i<array.length; i++) {
			if(num == array[i]) {
				index = i;
				break;
			}
		}
//		System.out.println(index);
		
		if(index == -1) {
			System.out.println("잘못입력했습니다.");
		} else {
			System.out.println(index);
		}
		
		/*
			[풀이]
				num = 67
				index = -1
				
				i = 0	67 == array[0]:10	false		index = -1
				i = 1	67 == array[1]:543	false		index = -1
				i = 2	67 == array[2]:52	false		index = -1
				i = 3	67 == array[3]:24	false		index = -1
				i = 4	67 == array[4]:67	true		index = 4
		 */
		
		
		scan.close();
				
	}
}
