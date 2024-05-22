package 문자열1_개념;

import java.util.Arrays;

public class 문자열1_개념07_문자열배열 {
	public static void main(String[] args) {
		
		int[] arr = new int[3];			// 0
		double[] arr2 = new double[3]; 	// 0.0
		
		String[] test = {"aaa" , "bbb" , "ccc"};
		System.out.println(Arrays.toString(test));
		
		// String 을 배열로 만들때 new 로 만들게되면
		// null로 초기화 되어있다.
		String[] temp = new String[3];		
		System.out.println(Arrays.toString(temp));
		
		for(int i = 0; i < temp.length; i++) {
			temp[i] = "";
		}
		System.out.println(Arrays.toString(temp));
		
	}
}
