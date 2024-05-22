package 배열0_개념;

import java.util.Arrays;
import java.util.Scanner;

/*
	[문제]
		a배열 안의 값을 한 개 입력받는다.
		b배열 안에 위에서 입력한 값을 제외하고 복사한다.
		단, 없는 값 입력 시 예외처리를 하시오.
	[예시]
		입력 : 30
		결과 : b = {10, 20, 40, 50, 0}
		
		입력 : 100
		결과 : 값을 잘못 입력했습니다.
*/

public class 배열_개념06_삭제원리1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = { 0, 0, 0, 0, 0 };	
		
		System.out.print("입력 : ");
		int num = scan.nextInt();
		
		int index = -1;
		for(int i=0; i<a.length; i++) {
			if(a[i] == num) {
				index = i;
				break;
			}
		}
		
		/*
			[풀이]
				num = 30
				
				i = 0, bIndex = 0	a[0] != 30	true	b = [10,  0,  0,  0, 0]
				i = 1, bIndex = 1	a[1] != 30	true	b = [10, 20,  0,  0, 0]
				i = 2, bIndex = 2	a[2] != 30	false	b = [10, 20,  0,  0, 0]
				i = 3, bIndex = 2	a[3] != 30	true	b = [10, 20, 40,  0, 0]
				i = 4, bIndex = 3	a[4] != 30	true	b = [10, 20, 40, 50, 0]
		 */
		
		if(index == -1) {
			System.out.println("값을 잘못 입력했습니다.");
		} else {
			int bIndex = 0;
			for(int i=0; i<a.length; i++) {
				if(a[i] != num) {
					b[bIndex] = a[i];
					bIndex += 1;
				} 
			}
			
			System.out.println(Arrays.toString(b));
		}
		
		scan.close();
		
	}
}
