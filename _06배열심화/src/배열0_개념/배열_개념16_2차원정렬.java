package 배열0_개념;

import java.util.Arrays;
import java.util.Random;

public class 배열_개념16_2차원정렬 {
	public static void main(String[] args) {
		
		int[][] darr = {
			{43, 35, 50},
			{36, 76, 37},
			{98, 25, 19}
		};
		
		// 1. 2차원배열의 크기만큼 1차원배열을 생성한다.
		int[] arr = new int[9];
		
		// 2. 2차원배열의 값을 생성한 1차원 배열에 저장한다.
		int index = 0;
		for(int i=0; i<darr.length; i++) {
			for(int j=0; j<darr[i].length; j++) {
				arr[index] = darr[i][j];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		// 3. 1차원배열 정렬 알고리즘을 사용해 정렬한다.
		for(int i=0; i<arr.length; i++) {
			int maxNum = arr[i];
			int maxIndex = i;
			for(int j=i; j<arr.length; j++) {
				if(maxNum < arr[j]) {
					maxNum = arr[j];
					maxIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
		// 4. 마지막으로 1차원배열의 값을 2차원 배열에 순차적으로 저장한다.
		index = 0;
		for(int i=0; i<darr.length; i++) {
			for(int j=0; j<darr[i].length; j++) {
				darr[i][j] = arr[index];
				index += 1;
			}
		}
		
		// 5. 출력
		for(int i=0; i<darr.length; i++) {
			System.out.println(Arrays.toString(darr[i]));
		}
		
	}
}
