package 배열5_문제;

import java.util.Arrays;
import java.util.Scanner;

/*
	[문제]
		아래 번호를 입력받아, 각 방향으로 0이 아닌 숫자를 모으시오.
		1)left 2)right
		
		예) 1)left
		   arr = {2,3,4,5,0,0,0,0,0}
		
		예) 2)right
		   arr = {0,0,0,0,0,2,3,4,5}
	
*/

public class 배열5_문제04_왼쪽오른쪽_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {0,2,0,3,4,0,0,5,0};
		
		while(true) {
			
			System.out.println(Arrays.toString(arr));
			
			System.out.println("1)left");
			System.out.println("2)right");
			System.out.println("0)exit");
			
			System.out.print("메뉴 선택 : ");
			int select = scan.nextInt();
			
			if(select == 1) {
				// [0, 2, 0, 3, 4, 0, 0, 5, 0]
				
				int index = 0;
				for(int i=0; i<arr.length; i++) {
					if(arr[i] != 0) {
						int temp = arr[i];
						arr[i] = arr[index];
						arr[index] = temp;
						index += 1;
					}
				}
			}
			else if(select == 2) {
				int index = arr.length - 1;
				for(int i=arr.length - 1; i>=0; i--) {
					if(arr[i] != 0) {
						int temp = arr[i];
						arr[i] = arr[index];
						arr[index] = temp;
						index -= 1;
					}
				}
			}
			else if(select == 0) {
				break;
			}
		}
		
		scan.close();
		
	}
}
