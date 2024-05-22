package 배열6_문제;

import java.util.Arrays;
import java.util.Scanner;

/*
	[문제]
		값을 입력받아 data배열에서 해당 값을 제외하고 
		배열 b에 저장하시오.
		단, 같은 값이 여러개 있으면 전부 제외하시오.
	[예시]
		입력 : 5
		결과 : {2,6,8,6,0,0}
*/


public class 배열6_문제04_배열중복삭제_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] data = {5,2,6,8,5,6};
		int[] b = {0,0,0,0,0,0};
		
		System.out.print("입력 : ");
		int input = scan.nextInt();		// input = 5
		
		/*
			i = 0, index = 0	5 != data[0]	false
			i = 1, index = 0	5 != data[1]	true	b =[2,0,0,0,0,0]
			i = 2, index = 1	5 != data[2]	true	b =[2,6,0,0,0,0]
			...
		 */
		int index = 0;
		for(int i=0; i<data.length; i++) {
			if(input != data[i]) {
				b[index] = data[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(b));
		
	}
}




