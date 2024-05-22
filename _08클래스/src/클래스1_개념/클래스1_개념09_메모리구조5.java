package 클래스1_개념;

import java.util.Arrays;

class Sample05 {
	int[][] arr = new int[4][];
}

public class 클래스1_개념09_메모리구조5 {
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {6, 7, 8, 9, 10};
		
		Sample05 s5 = new Sample05();
		
		System.out.println(s5.arr[0]);
		
		s5.arr[0] = arr1;
		s5.arr[1] = arr2;
		s5.arr[2] = arr1;
		s5.arr[3] = arr2;
		
		s5.arr[1][1] = 100;
		
		for(int i=0; i<s5.arr.length; i++) {
			System.out.println(Arrays.toString(s5.arr[i]));
		}
		
	}
}





