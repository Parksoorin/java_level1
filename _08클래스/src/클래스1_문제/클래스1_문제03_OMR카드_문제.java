package 클래스1_문제;

/*
	[문제]
		1. 배열 answer는 시험문제의 정답지이다.
		2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
		3. answer와 hgd 값을 비교해 정오표를 출력한다.
		4. 한 문제당 20점이다.
		
		answer = {1, 3, 4, 2, 5}
		hgd    = {1, 1, 4, 4, 3}
		성적    = 40점		 
*/

class OMR {
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 홍길동 학생답안	
	int cnt = 0;						// 정답 맞춘 개수
	int score = 0;						// 성적
}

public class 클래스1_문제03_OMR카드_문제 {
	public static void main(String[] args) {
		
		OMR card = new OMR();
		
	}
}
