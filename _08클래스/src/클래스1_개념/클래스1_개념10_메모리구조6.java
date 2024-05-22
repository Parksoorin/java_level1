package 클래스1_개념;

import java.util.Arrays;

class Sample06 {
	int[] arr = {1, 2, 3, 4, 5};
}

class Sample07 {
	int[] arr = {5, 4, 3, 2, 1};
}

public class 클래스1_개념10_메모리구조6 {
	public static void main(String[] args) {
		
		Sample06 s6 = new Sample06();
		Sample07 s7 = new Sample07();
		
		s6.arr = s7.arr;
		s7.arr = s6.arr;
		
		System.out.println(Arrays.toString(s6.arr));
		System.out.println(Arrays.toString(s7.arr));
		
	}
}





