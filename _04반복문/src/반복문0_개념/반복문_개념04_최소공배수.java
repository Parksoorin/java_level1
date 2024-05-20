package 반복문0_개념;

/*
	[문제]
		8과 12의 최소공배수를 구하시오.
		최소 공배수란, 각 수의 배수를 나열한 다음 처음으로 같은 숫자를 의미한다.
		
		예)
			8,  16, 24, ...
			12, 24, ...
			
			8과 12의 최소공배수는 24이다.
	[정답]
		24
*/

public class 반복문_개념04_최소공배수 {
	public static void main(String[] args) {
		
		int x = 8;
		int y = 12;
		
		int answer = 0;
		
		int i = y;
		boolean run = true;
		while(run) {
			if(i % x == 0 && i % y == 0) {
				answer = i;
				run = false;
			}
			
			i += 1;
		}
		
		System.out.println(answer); 
	}
}
