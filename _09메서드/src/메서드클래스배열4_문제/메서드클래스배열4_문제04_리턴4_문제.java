package 메서드클래스배열4_문제;

/*
class Node4 {
	// 내용을 채워보세요.
}

class Return4 {
	Node4[] getList(String[][] student, String[][] score) {
//		[문제1] 전체 회원리스트를 만들어서 리턴하는 메서드를 구현하시오.
		Node4[] result = null;
		return result;
	}
	Node4[] getRankList(String[][] student, String[][] score) {
//		[문제2] 각과목별 1등의 데이터만 클래스 배열로 만들어서 리턴하는 메서드를 구현하시오.
		Node4[] result = null;
		return result;
	}
}
*/

public class 메서드클래스배열4_문제04_리턴4_문제 {
	public static void main(String[] args) {
		
		String[][] student = {
			{"김철만","신촌","1001"}, 
			{"오상덕","강남","1002"},
			{"민철이","대치","1003"} ,
			{"유재석","강동","1004"}};
		String[][] score = {
			{"번호","과목","점수"},
			{"1001" ,"국어","20"},
			{"1002" ,"국어","50"},
			{"1003" ,"국어","60"},
			{"1004" ,"국어","17"},
			{"1001" ,"수학","65"},
			{"1002" ,"수학","15"},
			{"1003" ,"수학","80"},
			{"1004" ,"수학","70"},
			{"1001" ,"영어","43"},
			{"1002" ,"영어","90"},
			{"1003" ,"영어","30"},
			{"1004" ,"영어","70"}
		};
		
		Return4 re = new Return4();
		Node4[] nodeList = re.getList(student, score);
		
	}
}
