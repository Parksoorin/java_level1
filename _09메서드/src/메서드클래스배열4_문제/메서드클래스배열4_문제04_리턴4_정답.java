package 메서드클래스배열4_문제;

class Node4 {
	// 내용을 채워보세요.
	int number;
	String name;
	String address;
	int[] scoreList = new int[3];
	int total;
	
	void print() {
		System.out.print(number + " " + address + " ");
		
		for(int i=0; i<3; i++) {
			System.out.print(scoreList[i] + " ");
		}
		
		System.out.println(total);
	}
}

class Return4 {
	Node4[] getList(String[][] student, String[][] score) {
//		[문제1] 전체 회원리스트를 만들어서 리턴하는 메서드를 구현하시오.
		Node4[] result = null;
		
		result = new Node4[student.length];
		for(int i=0; i<result.length; i++) {
			result[i] = new Node4();
			
			result[i].number = Integer.parseInt(student[i][2]);
			result[i].name = student[i][0];
			result[i].address = student[i][1];
			
			for(int j=1; j<score.length; j++) {
				if(result[i].number == Integer.parseInt(score[j][0])) {
					if(score[j][1].equals("국어")) {
						result[i].scoreList[0] = Integer.parseInt(score[j][2]);
					} else if(score[j][1].equals("수학")) {
						result[i].scoreList[1] = Integer.parseInt(score[j][2]);
					} else if(score[j][1].equals("영어")) {
						result[i].scoreList[2] = Integer.parseInt(score[j][2]);
					}
				}
			}
			
			for(int j=0; j<result[i].scoreList.length; j++) {
				result[i].total += result[i].scoreList[j];
			}
		}
		
		return result;
	}
	Node4[] getRankList(String[][] student, String[][] score) {
//		[문제2] 각과목별 1등의 데이터만 클래스 배열로 만들어서 리턴하는 메서드를 구현하시오.
		Node4[] result = null;
		result = new Node4[3];
		for(int i=0; i<3; i++) {
			result[i] = new Node4();
		}
		
		Node4[] list = getList(student, score);
		
		int korMaxScore = 0;
		int korMaxIndex = 0;
		
		int mathMaxScore = 0;
		int mathMaxIndex = 0;
		
		int engMaxScore = 0;
		int engMaxIndex = 0;
		
		for(int i=0; i<list.length; i++) {
			if(korMaxScore < list[i].scoreList[0]) {
				korMaxScore = list[i].scoreList[0];
				korMaxIndex = i;
			}
			
			if(mathMaxScore < list[i].scoreList[1]) {
				mathMaxScore = list[i].scoreList[1];
				mathMaxIndex = i;
			}
			
			if(engMaxScore < list[i].scoreList[2]) {
				engMaxScore = list[i].scoreList[2];
				engMaxIndex = i;
			}
		}
		
		
		result[0] = list[korMaxIndex];
		result[1] = list[mathMaxIndex];
		result[2] = list[engMaxIndex];
		
		return result;
	}
}

public class 메서드클래스배열4_문제04_리턴4_정답 {
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
		
		for(int i=0; i<nodeList.length; i++) {
			nodeList[i].print();
		}
		
		System.out.println();
		
		nodeList = re.getRankList(student, score);
		for(int i=0; i<nodeList.length; i++) {
			nodeList[i].print();
		}
	
	}
}
