package 배열0_개념;

import java.util.Arrays;
import java.util.Random;

/*
	# 중복숫자 금지 해결방법 3가지
		[방법3] 전체 검사
*/

public class 배열_개념04_중복숫자종류3 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int arr[] = new int[4];
		
		/*
			[풀이]
				2 1 1 3 2 2 4
				
				i = 0, r = 2, 
					j반복X	arr = [2, 0, 0, 0]
				i = 1, r = 1,
					j = 0	check = false	arr = [2, 1, 0, 0]
				i = 2, r = 1,
					j = 0
					j = 1	check = true	arr = [2, 1, 0, 0]
				i = 2, r = 3,
					j = 0
					j = 1	check = false	arr = [2, 1, 3, 0]
				i = 3, r = 2
					j = 0
					j = 1
					j = 2	check = true
				i = 3, r = 2
					j = 0
					j = 1
					j = 2	check = true
				i = 3, r = 4
					j = 0
					j = 1
					j = 2	check = false	arr = [2, 1, 3, 4]
		 */
	
		for(int i=0; i<4; i++) {
			
			int rNum = ran.nextInt(4) + 1;
			System.out.println(rNum);
			
			boolean check = false;
			for(int j=0; j<i; j++) {
				if(rNum == arr[j]) {
					check = true;
				}
			}
			
			if(check == false) {
				arr[i] = rNum;
			}else {
				i -= 1;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
