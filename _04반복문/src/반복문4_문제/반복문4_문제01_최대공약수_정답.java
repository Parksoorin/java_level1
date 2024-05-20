package 반복문4_문제;

/*
	[문제]
		연필 42자루와 지우개 28개를 최대한 많은 학생에게
		남김없이 똑같이 나누어 주려고한다.
		몇 명까지 나누어 줄 수 있는지 구하시오.
	[정답]
		14명
*/

public class 반복문4_문제01_최대공약수_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				42와 28의 최대공약수
		 */
		
		int 연필 = 42;
		int 지우개 = 28;
		
		int 인원수 = 0;
		
		for(int i=1; i<=지우개; i++) {
			if(연필 % i == 0 && 지우개 % i == 0) {
				인원수 = i;
			}
		}
		System.out.println(인원수 + "명");
		
	}
}
