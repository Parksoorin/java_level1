package 배열5_문제;

import java.util.Arrays;
import java.util.Scanner;

/*
	[문제] 
		값을 입력받고 data 배열에서 해당 값을 제외한 나머지를
		b배열에 순차적으로 저장하시오.
		단, 같은 값이 여러개 있으면 가장 첫번째의 값 한개만 삭제후 저장하시오. 
	[예시]
	   data = {5,2,6,8,5,6};
	   
	   입력 : 2
	   b = {5,6,8,5,6,0}
	   
	   입력 : 6
	   b = {5,2,8,5,6,0}
	*/

public class 배열5_문제01_배열중복삭제_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] data = {5,2,6,8,5,6};
		int[] b  = {0,0,0,0,0,0};
		
		System.out.print("입력 : ");
		int value = scan.nextInt();
		
		int index = -1;
		for(int i=0; i<data.length; i++) {
			if(value == data[i]) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("값 입력 오류");
		} else {
			int bIndex = 0;
			for(int i=0; i<data.length; i++) {
				if(i != index) {
					b[bIndex] = data[i];
					bIndex += 1;
				}
			}
			System.out.println(Arrays.toString(b));
		}
		
		scan.close();
		
	}
}
