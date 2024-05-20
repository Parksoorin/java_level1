package 반복문1_문제;

/*
	[문제]
		철수는 두 번의 시험에서 각각 80점과 72점을 받았다.
		세 번째 시험에서 최소 몇 점 이상을 받아야
		평균 82점 이상이 되는지 구하시오.
	[정답]
		94점
*/

public class 반복문1_문제03_시험점수_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				성적1 = 80
				성적2 = 72
				성적3 = x
				
				(성적1 + 성적2 + 성적3) / 3 >= 82
		 */
		
		int score1 = 80;
		int score2 = 72;
		int score3 = 0;
		
		boolean run = true;
		while(run) {
			int total = score1 + score2 + score3;
			double avg = total / 3.0;

			if(avg >= 82) {
				System.out.println(score3 + "점");
				run = false;
			}
			
			score3 += 1;
		}
		
	}
}
