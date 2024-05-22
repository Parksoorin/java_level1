package 클래스1_문제;

import java.util.Arrays;
import java.util.Random;

/*
class School {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}
 */

public class 클래스1_문제01_기본예제1_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		School green = new School();
		
		int size = green.hakbuns.length;
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		for(int i=0; i<size; i++) {
			green.scores[i] = ran.nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(green.scores));

		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		int total = 0;
		for(int i=0; i<size; i++) {
			total += green.scores[i];
		}
		double avg = (double)total / size;
		System.out.println("총점 = " + total);
		System.out.println("평균 = " + avg);
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		int count = 0;
		for(int i=0; i<size; i++) {
			if(green.scores[i] >= 60) {
				count += 1;
			}
		}
		System.out.println(count + "명");

		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		int index = 1;
		System.out.println(green.scores[index] + "점");

		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		int score = 11;
		index = -1;
		for(int i=0; i<size; i++) {
			if(green.scores[i] == score) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("성적 입력 오류");
		} else {
			System.out.println(index);
		}

		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 92점
		int hakbun = 1003;
		for(int i=0; i<size; i++) {
			if(green.hakbuns[i] == hakbun) {
				System.out.println(green.scores[i] + "점");
			}
		}

		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		hakbun = 1003;
		index = -1;
		for(int i=0; i<size; i++) {
			if(green.hakbuns[i] == hakbun) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("해당학번은 존재하지 않습니다.");
		} else {
			System.out.println(green.scores[index] + "점");
		}

		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1003번(92점)
		int maxScore = 0;
		int maxIndex = 0;
		for(int i=0; i<size; i++) {
			if(maxScore < green.scores[i]) {
				maxScore = green.scores[i];
				maxIndex = i;
			}
		}
		
		System.out.println(green.hakbuns[maxIndex] + "번(" + green.scores[maxIndex] + "점)");
		
	}
}