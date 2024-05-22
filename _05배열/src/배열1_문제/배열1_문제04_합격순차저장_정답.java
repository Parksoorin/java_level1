package 배열1_문제;

import java.util.Arrays;

/*
	[문제] 아래 조건을 모두 만족시키시오.
		조건1) 아래 배열 a와 b를 비교해서 둘의 합을 배열 c에 저장하시오.
		조건2) 배열 c의 값 중에서 짝수만 배열d에 저장하시오.
		조건3) 배열 d에 저장할 때는 앞에서부터 순차적으로 저장하시오.
	[정답]
		c = {23, 74, 47, 82, 51}
		d = {74, 82, 0, 0, 0}
*/

public class 배열1_문제04_합격순차저장_정답 {
	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 50};
		int[] b = {13, 54, 17, 42, 1};
		int[] c = {0, 0, 0, 0, 0};
		int[] d = {0, 0, 0, 0, 0};
		
		/*
			[풀이]
				i = 0, index = 0	c[0] = 23(10 + 13) % 2 == 0		false	c = [23,  0,  0,  0,  0], d = [ 0, 0, 0, 0, 0]
				i = 1, index = 0	c[1] = 74(20 + 54) % 2 == 0		true	c = [23, 74,  0,  0,  0], d = [74, 0, 0, 0, 0]
				i = 2, index = 1	c[2] = 47(30 + 17) % 2 == 0		false	c = [23, 74, 47,  0,  0], d = [74, 0, 0, 0, 0]
				i = 3, index = 1	c[3] = 82(40 + 42) % 2 == 0		true	c = [23, 74, 47, 82,  0], d = [74, 82, 0, 0, 0]
				i = 4, index = 2	c[4] = 51(50 +  1) % 2 == 0		false	c = [23, 74, 47, 82, 51], d = [74, 82, 0, 0, 0]
		 */
		
		int index = 0;
		for(int i=0; i<5; i++) {
			c[i] = a[i] + b[i];
			
			if(c[i] % 2 == 0) {
				d[index] = c[i];
				index += 1;
			}
		}
		
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		
	}
}
