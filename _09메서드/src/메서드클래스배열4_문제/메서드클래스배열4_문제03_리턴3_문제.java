package 메서드클래스배열4_문제;

/*

class Node3 {
	int number;
	String name;
	String address;
	int[] scoreList = new int[3];
	int total;
	double avg;
	int rank;
}

class Return3 {
	
	Node3[] getList(String[][] student, String[][] score) {
		
//		[문제] 아래 순서대로 전체 학생 정보를 저장해
//		리턴해주는 메서드를 구현하시오.
//		[학생번호] [이름] [지역] [국어] [수학] [영어] [총합] [평균] [등수]
		
		Node3[] result = null;
		return result;
	}
	
}

*/


public class 메서드클래스배열4_문제03_리턴3_문제 {
	public static void main(String[] args) {
		
		String[][] student = {
			{"이만수","신촌","1001"}, 
			{"김철민","강남","1002"},
			{"심장호","대치","1003"} , 
			{"유재석","강동","1004"}};
		String[][] score = {
			{"1001","10" ,"60","60"},
			{"1002","100","20","30"},
			{"1003","23" ,"63","31"},
			{"1004","45" ,"30","35"},
		};
		
		Return3 re = new Return3();
		Node3[] list = re.getList(student, score);
			
	}
}
