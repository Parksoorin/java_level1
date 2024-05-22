package 배열0_개념;

import java.util.Arrays;
import java.util.Random;

/*
	# 중복숫자 금지 해결방법 3가지
		[방법2] check배열 활용
*/

public class 배열_개념03_중복숫자종류2 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = new int[4];
		
		boolean[] check = new boolean[4];
		
		/*
			2 2 3 2 3 1 0
			
			i = 0, r = 2	check[2] == false	true	arr = [3, 0, 0, 0], check = [false, false, true, false]
			i = 1, r = 2	check[2] == false	false	arr = [3, 0, 0, 0], check = [false, false, true, false]
			i = 1, r = 3	check[3] == false	true	arr = [3, 4, 0, 0], check = [false, false, true, true]
			i = 2, r = 2	check[2] == false	false	arr = [3, 4, 0, 0], check = [false, false, true, true]
			i = 2, r = 3	check[3] == false 	false	arr = [3, 4, 0, 0], check = [false, false, true, true]
			i = 2, r = 1	check[1] == false	true	arr = [3, 4, 2, 0], check = [false, true, true, true]
			i = 3, r = 0	check[0] == false	true	arr = [3, 4, 2, 1], check = [true, true, true, true]
		 */
		
		// while문 해결해보기!
		for(int i=0; i<4; i++) {
			int r = ran.nextInt(4);
			System.out.println(r);
			
			if(check[r] == false) {
				check[r] = true;
				arr[i] = r + 1;
			}else {
				i -= 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(check));
		
	}
}
