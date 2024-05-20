package 반복문1_문제;

/*
	[문제]
		철수는 13살이고 철수의 아버지는 45살이다.
		몇년 후 철수의 아버지는 철수 나이의 3배가 될지 구하시오.
	[정답]
		3년
*/

public class 반복문1_문제02_부자나이_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				철수 = 13
				아버지 = 45
				
				시간 = x
				
				(철수 + x) * 3 == 아버지 + x
		 */
		
		int 철수_나이 = 13;
		int 아버지_나이 = 45;
		
		int 시간 = 0;
		
		boolean run = true;
		while(run) {
			if((철수_나이 + 시간) * 3 == 아버지_나이 + 시간) {
				System.out.println(시간 + "년");
				run = false;
			}
			
			시간 += 1;
		}
		
	}
}
