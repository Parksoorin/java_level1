package 배열8_문제;

import java.util.Scanner;

/*
	[문제]
		input배열 안의 값들이 arr배열의 값들과
		연속해서 일치하면, true
		그렇지않으면, false를 출력하시오.
	[정답]
		input1 ==> true
		input2 ==> false
*/

public class 배열8_문제02_순서숫자찾기_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {1, 3, 3, 6, 5, 6, 1, 8, 9};
		
		int[] input1 = {6, 1, 8};
		int[] input2 = {6, 3};
		
		/*
			arr[0] == input1[0]
			arr[1] == input1[1]
			arr[2] == intpu1[2]
			i = 0
				j = 0		i + j = 0
				j = 1		i + j = 1
				j = 2		i + j = 2
			
			arr[1] == input1[0]
			arr[2] == input1[1]
			arr[3] == intpu1[2]
			i = 1
				j = 0	i + j = 1
				j = 1	i + j = 2
				j = 2	i + j = 3
			
			arr[2] == input1[0]
			arr[3] == input1[1]
			arr[4] == intpu1[2]
		
			...
		 */
		
		while(true) {
			System.out.println("[1] input1 정답 확인");
			System.out.println("[2] input2 정답 확인");
			System.out.println("[0] 종료");
			
			System.out.print("번호 입력 : ");
			int select = scan.nextInt();
			
			if(select == 0) { 
				break; 
			}
			else if(select == 1) {
				boolean check = false;
				for(int i=0; i<arr.length - input1.length + 1; i++) {
					int count = 0;
					for(int j=0; j<input1.length; j++) {
						if(arr[i + j] == input1[j]) {
							count += 1;
						}
					}
					
					if(count == input1.length) {
						check = true;
						break;
					}
				}
				
				System.out.println(check);
			}
			else if(select == 2) {
				boolean check = false;
				for(int i=0; i<arr.length - input2.length + 1; i++) {
					int count = 0;
					for(int j=0; j<input2.length; j++) {
						if(arr[i + j] == input2[j]) {
							count += 1;
						}
					}
					
					if(count == input2.length) {
						check = true;
						break;
					}
				}
				
				System.out.println(check);
			}
		}
		
		scan.close();
		
	}
}
