package 배열2_문제;

import java.util.Arrays;

/*
	[문제]
		아래는 시험결과이다. 60점 이상이면 합격이다.
		시험에 합격한 사람의 번호만 win 배열에 저장하시오.
		단, 앞에서부터 저장하시오.
	[정답]
		win = {1001, 1003, 0}
*/

public class 배열2_문제03_합격순차저장_정답 {
	public static void main(String[] args) {
		
		int[] student = {1001, 80, 1002, 23, 1003, 78};
		int[] win = {0, 0, 0};
		
		int index = 0;
		for(int i=0; i<student.length; i++) {
			if(i % 2 == 1) {
				if(student[i] >= 60) {
					win[index] = student[i - 1];
					index += 1;
				}
			}
		}
		System.out.println(Arrays.toString(win));
		
	}
}
