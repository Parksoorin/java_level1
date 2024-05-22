package 메서드클래스배열4_문제;

class Node3 {
	int number;
	String name;
	String address;
	int[] scoreList = new int[3];
	int total;
	double avg;
	int rank;
	
	void print() {
		System.out.print(number + " " + address + " ");
		
		for(int i=0; i<3; i++) {
			System.out.print(scoreList[i] + " ");
		}
		
		System.out.println(total + " " + avg + " " + rank);
	}
}

class Return3 {
	
	Node3[] getList(String[][] student, String[][] score) {
		
//		[문제] 아래 순서대로 전체 학생 정보를 저장해
//		리턴해주는 메서드를 구현하시오.
//		[학생번호] [이름] [지역] [국어] [수학] [영어] [총합] [평균] [등수]
		
		Node3[] result = null;
		result = new Node3[student.length];
		
		for(int i=0; i<result.length; i++) {
			result[i] = new Node3();
			
			result[i].number = Integer.parseInt(student[i][2]);
			result[i].name = student[i][0];
			result[i].address = student[i][1];
			
			for(int j=0; j<result[i].scoreList.length; j++) {
				result[i].scoreList[j] = Integer.parseInt(score[i][j + 1]);
				result[i].total += result[i].scoreList[j];
			}
			result[i].avg = result[i].total / 3.0;
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result.length; j++) {
				if(result[i].total <= result[j].total) {
					result[i].rank += 1;
				}
			}
		}
		
		return result;
	}
	
}


public class 메서드클래스배열4_문제03_리턴3_정답 {
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
		
		for(int i=0; i<list.length; i++) {
			list[i].print();
		}
			
	}
}
