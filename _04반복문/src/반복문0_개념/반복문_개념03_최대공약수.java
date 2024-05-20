package 반복문0_개념;

/*
	[문제]
		6과 8의 최대공약수를 구하시오.
		최대 공약수란, 위 두 수의 공통인 약수 중에 가장 큰 수를 의미한다.
		
		예)
			6의 약수는 1, 2, 3, 6 이다.
			8의 약수는 1, 2, 4, 8 이다.
			
			6과 8의 공약수는 1, 2 이다.
			6과 8의 최대공약수는 2 이다.
	[정답]
		2
*/

public class 반복문_개념03_최대공약수 {
	public static void main(String[] args) {
		
		int x = 6;
		int y = 8;
		
		int answer = 0;
		for(int i=1; i<=x; i++) {
			if(x % i == 0 && y % i == 0) {
				answer = i;
			}
		}
		System.out.println(answer);
		
	}
}
