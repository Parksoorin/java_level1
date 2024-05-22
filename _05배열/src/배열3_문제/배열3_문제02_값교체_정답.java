package 배열3_문제;

import java.util.Arrays;
import java.util.Scanner;

/*
	[문제]
		값 2개를 입력받아 arr배열에서 두 값을 교체하시오.
		단, 없는 값을 입력했을 시 예외처리를 하시오.
	[예시]
		값1 입력 : 40
		값2 입력 : 20
		결과 : {10, 40, 30, 20, 50}
		
		값1 입력 : 87
		값2 입력 : 20
		결과 : 값을 잘못 입력했습니다.
*/

public class 배열3_문제02_값교체_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = { 10, 20, 30, 40, 50 };	
		
		System.out.print("값1 입력 : ");
		int value1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		int value2 = scan.nextInt();
		
		int index1 = -1;
		int index2 = -1;
		for(int i=0; i<arr.length; i++) {
			if(value1 == arr[i]) {
				index1 = i;
			}
			if(value2 == arr[i]) {
				index2 = i;
			}
		}
		
		if(index1 == -1 || index2 == -1) {
			System.out.println("값을 잘못 입력했습니다.");
		} else {
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
			
			System.out.println(Arrays.toString(arr));
		}
		
		scan.close();
		
	}
}
