package 배열1_문제;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_문제01_종합예제1_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		// [문제1] 인덱스 2개를 입력받아 값 출력
		// 예1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//	    값 출력 : 60 
		System.out.print("인덱스1 입력 : ");
		int index1 = scan.nextInt();
		System.out.print("인덱스2 입력 : ");
		int index2 = scan.nextInt();
		System.out.println(arr[index1][index2]);
		

		// [문제2] 값을 입력받아 인덱스 2개 출력
		// 예2) 값 입력 : 60
		//	    인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.print("값 입력 : ");
		int value = scan.nextInt();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(value == arr[i][j]) {
					System.out.println("인덱스1 : " + i + ", 인덱스2 : " + j);
				}
			}
		}
				
		// [문제3] 가장 큰 값의 인덱스 2개 출력
		// [정답3] 2 2
		int maxNum = 0;
		int maxIndexI = 0;
		int maxIndexJ = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(maxNum < arr[i][j]) {
					maxNum = arr[i][j];
					
					maxIndexI = i;
					maxIndexJ = j;
				}
			}
		}
		System.out.println(maxIndexI + " " + maxIndexJ);
		
		// [문제4] 값 2개를 입력받아 값 교체
		System.out.print("갑1 입력 : ");
		int value1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		int value2 = scan.nextInt();
		
		int i1 = 0;
		int j1 = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(value1 == arr[i][j]) {
					i1 = i;
					j1 = j;
				}
			}
		}
		
		int i2 = 0;
		int j2 = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(value2 == arr[i][j]) {
					i2 = i;
					j2 = j;
				}
			}
		}
		
		int temp = arr[i1][j1];
		arr[i1][j1] = arr[i2][j2];
		arr[i2][j2] = temp;
		for(int i=0; i<3; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		scan.close();
		
	}
}






