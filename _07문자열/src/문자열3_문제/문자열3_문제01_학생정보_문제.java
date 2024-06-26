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

public class 문자열3_문제01_학생정보_문제 {
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
		
	}
}
