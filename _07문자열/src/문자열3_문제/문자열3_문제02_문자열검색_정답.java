package 문자열3_문제;

public class 문자열3_문제02_문자열검색_정답 {
	public static void main(String[] args) {
		
		String[][] student = {
		//	   번호	   이름    성별
			{"1001", "이만수", "남"},
			{"1002", "이영희", "여"},
			{"1003", "김민정", "여"},
			{"1004", "이철민", "남"},
			{"1005", "오만석", "남"},
			{"1006", "최이슬", "여"}
		};
		
		int[][] score = {
		//   번호  국어  수학
			{1005, 49, 100},	// 149
			{1001, 10, 20},		// 30
			{1003, 64, 65},		// 129
			{1002, 70, 30},		// 100
			{1004, 13, 87},		// 100
			{1006, 14, 90}		// 104
		};
		
		// [문제1] 여학생들 점수총합과 남학생들의 점수총합을 비교하고 점수가 더 큰쪽을 출력
		// [정답1] 남성 = 349
		int mTotal = 0;
		int wTotal = 0;
		for(int i=0; i<student.length; i++) {
			if(student[i][2].equals("남")) {
				mTotal += score[i][1] + score[i][2];
			} else if(student[i][2].equals("여")) {
				wTotal += score[i][1] + score[i][2];
			}
		}
		System.out.println("wTotal = " + wTotal);
		System.out.println("mTotal = " + mTotal);
		
		if(mTotal < wTotal) {
			System.out.println("여성 = " + wTotal);
		} else {
			System.out.println("남성 = " + mTotal);
		}
		System.out.println();
		
		// [문제2] 평균이 60점이상이면 합격 : 합격생들 번호 이름 점수 출력 
		// [정답2]
		//		1005번 = 오만석, 74.5점
		//		1003번 = 김민정, 64.5점
		for(int i=0; i<score.length; i++) {
			int korScore = score[i][1];
			int mathScore = score[i][2];
			int total = korScore + mathScore;
			double avg = total / 2.0;
			
			if(avg >= 60) {
				System.out.println(student[i][0] + "번 = " + student[i][1] + ", " + avg + "점");
			}
		}
		System.out.println();

		// [문제3] 국어점수가 수학점수 보다 큰 학생들 번호 이름 출력 
		// [정답3] 1002번 = 이영희
		for(int i=0; i<score.length; i++) {
			if(score[i][1] > score[i][2]) {
				System.out.print(score[i][0] + "번 = ");
				for(int j=0; j<student.length; j++) {
					if(score[i][0] == Integer.parseInt(student[j][0])) {
						System.out.println(student[j][1]);
						break;
					}
				}
			}
		}
		System.out.println();

		// [문제4] 1등 번호, 이름 출력 (여러명이면 전부 출력)
		// [정답4] 1005번 = 오만석
		int maxScore = 0;
		for(int i=0; i<score.length; i++) {
			int korScore = score[i][1];
			int mathScore = score[i][2];
			int total = korScore + mathScore;
			
			if(maxScore < total) {
				maxScore = total;
			}
		}		
		System.out.println("1등 점수 = " + maxScore + "점");
		
		for(int i=0; i<score.length; i++) {
			int korScore = score[i][1];
			int mathScore = score[i][2];
			int total = korScore + mathScore;
			
			if(maxScore == total) {
				System.out.print(score[i][0] + "번 = ");
				for(int j=0; j<student.length; j++) {
					if(score[i][0] == Integer.parseInt(student[j][0])) {
						System.out.println(student[j][1]);
						break;
					}
				}
			}
		}
		
		
	} 
}




