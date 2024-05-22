package 문자열3_문제;

/*
	student배열은 차례대로 이름, 지역, 번호를 의미한다.
	score배열은 차례대로 번호, 국어, 수학, 영어성적을 의미한다.
	
	[문제1] 
		아래 순서대로 전체 학생의 정보를 출력하시오.
	    [학생번호] [이름] [지역] [국어] [수학] [영어] [총합] [평균]
	[정답1]
		[학생번호][  이름][지역][국어][수학][영어][총합][  평균]
		[  1001][이만수][신촌][100][ 20][ 30][150][50.00]
		[  1002][김철민][강남][ 10][ 60][ 60][130][43.33]
		[  1003][심장호][대치][ 23][ 63][ 31][117][39.00]
		[  1004][유재석][강동][ 45][ 30][ 35][110][36.67]
	
	[문제2] 
		각 과목별 1등 학생의 이름과 전체 1등의 이름을 출력하시오.
	[정답2] 
		1등 학생 = 이만수
		국어 1등 = 이만수
		수학 1등 = 심장호
		영어 1등 = 김철민
*/

public class 문자열3_문제01_학생정보_정답 {
	public static void main(String[] args) {
		
		String[][] student = {
			{"이만수","신촌","1001"}, 
			{"김철민","강남","1002"},
			{"심장호","대치","1003"}, 
			{"유재석","강동","1004"}
		};
		
		String[][] score = {
			{"1001","100","20","30"},
			{"1002","10" ,"60","60"},
			{"1003","23" ,"63","31"},
			{"1004","45" ,"30","35"}
		};
		
		// 문제1
		System.out.printf("[%4s][%4s][%2s][%s][%s][%s][%s][%4s]\n", "학생번호", "이름", "지역", "국어", "수학", "영어", "총합", "평균");
		for(int i=0; i<score.length; i++) {
			
			int kor = Integer.parseInt(score[i][1]);
			int math = Integer.parseInt(score[i][2]);
			int eng = Integer.parseInt(score[i][3]);
			int total = kor + math + eng;
			double avg = total / 3.0;
			
			System.out.printf("[%6s][%s][%2s][%3s][%3s][%3s][%3d][%4.2f]\n",
			score[i][0], student[i][0], student[i][1], score[i][1], score[i][2], score[i][3], total, avg);
		}
		
		// 문제2
		int maxKor 	= 0, maxKorIndex 	= 0;
		int maxMath = 0, maxMathIndex 	= 0;
		int maxEng 	= 0, maxEngIndex 	= 0;
		int max 	= 0, maxIndex 		= 0;
		for(int i=0; i<score.length; i++) {
			
			int kor = Integer.parseInt(score[i][1]);
			int math = Integer.parseInt(score[i][2]);
			int eng = Integer.parseInt(score[i][3]);
			int total = kor + math + eng;
			double avg = total / 3.0;
			
			if(maxKor < kor) {
				maxKor = kor;
				maxKorIndex = i;
			}
			if(maxMath < math) {
				maxMath = math;
				maxMathIndex = i;
			}
			if(maxEng < eng) {
				maxEng = eng;
				maxEngIndex = i;
			}
			
			if(max < total) {
				max = total;
				maxIndex = i;
			}
		}
		
		System.out.println("1등 학생 = " + student[maxIndex][0]);
		System.out.println("국어 1등 = " + student[maxKorIndex][0]);
		System.out.println("수학 1등 = " + student[maxMathIndex][0]);
		System.out.println("영어 1등 = " + student[maxEngIndex][0]);
		
	}
}
