package 문자열3_개념;

import java.util.Arrays;

/*
	[문제]
		사전순으로 이름을 정렬해 출력하시오.
	[정답]
		김유신, 마동석, 서동요, 자바킹, 홍길동
 */

public class 문자열3_개념03_문자열정렬_정답 {
	public static void main(String[] args) {
		
		String[] names = { "홍길동", "김유신", "마동석", "자바킹", "서동요" };
		
		for(int i=0; i<names.length; i++) {
			String name = names[i];
			int index = i;
			
			for(int j=i; j<names.length; j++) {
				if(name.compareTo(names[j]) > 0) {
					name = names[j];
					index = j;
				}
			}
			
			String temp = names[i];
			names[i] = names[index];
			names[index] = temp;
		}
		System.out.println(Arrays.toString(names));
		
	}
}
