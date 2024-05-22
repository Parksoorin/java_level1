package 배열7_문제;

import java.util.Arrays;

/*
	아래 배열은 1~9 사이의 숫자가 섞여서 저장되어 있는
	길이가 9인 배열이다.
   	arr 배열을 아래와 같이 사각형 모양으로 출력하고,
   	
	[문제1] 각 줄의 가로합을 garo배열에 차례대로 저장하고 출력하시오.
	[정답1] garo = {12, 14, 19}
		
	[문제2] 각 줄의 세로합을 sero배열에 차례대로 저장하고 출력하시오.
	[정답2] sero = {19, 12, 14}
*/


public class 배열7_문제01_가로세로합_정답 {
	public static void main(String[] args) {
		
		int arr[] = {
			2, 4, 6,
			8, 1, 5,
			9, 7, 3
		};
		
		int[] garo = {0,0,0}; 	// {2+4+6 , 8+1+5 , 9+7+3}
		int[] sero = {0,0,0}; 	// {2+8+9 , 4+1+7 , 6+5+3}
		
		/*
		 	garo[0] = arr[0] + arr[1] + arr[2]
		 	garo[1] = arr[3] + arr[4] + arr[5]
		 	garo[2] = arr[6] + arr[7] + arr[8]
		 */
		
		// 가로방법1)
		int garoIndex = 0;
		for(int i=0; i<9; i+=3) {
//			System.out.println(i + ", " + (i + 1) + ", " + (i + 2));
			garo[garoIndex] = arr[i] + arr[i + 1] + arr[i + 2];
			garoIndex += 1;
		}
		System.out.println(Arrays.toString(garo));
		
		// 가로방법2)
		/*
			arr = [
				2, 4, 6,
				8, 1, 5,
				9, 7, 3
			]
			index = 0, i = 0	garo[0] += 2	garo = [ 2,0,0]
			index = 0, i = 1	garo[0] += 4	garo = [ 6,0,0]
			index = 0, i = 2	garo[0] += 6	garo = [12,0,0]
			
			index = 1, i = 3	garo[1] += 8	garo = [12, 8,0]
			index = 1, i = 4	garo[1] += 1	garo = [12, 9,0]
			index = 1, i = 5	garo[1] += 5	garo = [12,14,0]
			
			index = 2, i = 6	garo[2] += 9	garo = [12,14, 9]
			index = 2, i = 7	garo[2] += 7	garo = [12,14,16]
			index = 2, i = 8	garo[2] += 3	garo = [12,14,19]
			i = 9
		 */
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			garo[index] += arr[i];
			
			if(i % 3 == 2) {
				index += 1;
			}
		}
		System.out.println(Arrays.toString(garo));
		
		// 세로
		/*
			i = 0	sero[0 % 3]
			i = 1	sero[1 % 3]
			i = 2	sero[2 % 3]
			i = 3	sero[3 % 3]
			i = 4	sero[4 % 3]
			i = 5	sero[5 % 3]
			i = 6	sero[6 % 3]
			i = 7	sero[7 % 3]
			i = 8	sero[8 % 3]
		 */
		for(int i=0; i<arr.length; i++) {
			sero[i % 3] += arr[i];
		}
		System.out.println(Arrays.toString(sero));
		
	}
}
