package 메서드클래스배열4_문제;


/*
class Node1 {
	int number;
	int score;
	
	void print() {
		System.out.println(number + ", " + score);
	}
}

class Return1 {
	
//		[문제1]
//			점수가 60점 이상이면, 합격이다.
//			합격생들의 정보를 result에 저장후 리턴하는
//			메서드를 완성하시오.
	Node1[] getWinnerList(String[][] data) {
		Node1[] result = null;
		return null;
	}
	
//		[문제2]
//			전체 학생 중 1등 학생 한명의 데이터를
//			리턴하는 메서드를 완성하시오.
	Node1 getRank(String[][] data) {
		Node1 result = null;
		return null;
	}
}

*/

public class 메서드클래스배열4_문제01_리턴1_문제 {
	public static void main(String[] args) {
				
		String data[][] = {
				{"1001","34"},
				{"1002","46"},
				{"1003","81"},
				{"1004","10"},
		};	
			
		Return1 re = new Return1();
		Node1 winList[] = re.getWinnerList(data);
		for(int i = 0; i < winList.length; i++) {
			winList[i].print();
		}
		//------------------------------------------
		
		Node1 getRank = re.getRank(data);
		getRank.print();
		
	}
}
