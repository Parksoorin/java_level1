package 배열2_문제;

import java.util.Arrays;

/*
	[문제]
		아래배열들은 3명의 학생데이터이다.
		각 학생은 세로로 3개씩 데이터로 표현하였다. 
	[예시]
		1001번 , 국어 20 , 수학 30
		1002번 , 국어 43 , 수학 23
		1003번 , 국어 45 , 수학 1
		아래 학생 3명중 국어점수가 수학점수 보다 높은 학생의 학번을
		answer 배열에 저장해 출력하시오. 
	[정답]
		answer = {1002, 1003, 0}
*/

public class 배열2_문제01_학생검색_정답 {
	public static void main(String[] args) {
		
		int[] 번호배열 = {1001 , 1002, 1003};
		int[] 국어배열 = {20,      43,   45};
		int[] 수학배열 = {30,      23,    1};
		
		int[] answer = new int[3];
		
		int index = 0;
		for(int i=0; i<번호배열.length; i++) {
			if(국어배열[i] > 수학배열[i]) {
				answer[index] = 번호배열[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(answer));
		
	}
}
