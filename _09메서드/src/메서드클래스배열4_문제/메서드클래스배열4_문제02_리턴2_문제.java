package 메서드클래스배열4_문제;

/*
class Node2 {
	int number;
	String name;
	int price;
	
	void print() {
		System.out.println(number + " " + name + " " + price);
	}
}

class Return2 {
	
	Node2[] getList(String data) {
		
//		[문제1] result 배열에 아래와 같은 형태로
//		데이터를 저장해 리턴하는 메서드를 구현하시오.
//		10001 김철수 2670
//		10002 이영희 1950
//		10003 유재석 4080
//		10004 박명수 7130
		
		Node2[] result = null;
		return result;
	}
	
	Node2 getRank(String data) {
//		[문제2] 판매금액이 1등인 회원정보를 리턴하는
//		메서드를 구현하시오.
		
		Node2 result = null;
		return result;
	}
	
	
}
*/

public class 메서드클래스배열4_문제02_리턴2_문제 {
	public static void main(String[] args) {				

		String data ="";
		data += "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800\n";
		data = data.substring(0 , data.length()-1); // 마지막 글삭제 
		System.out.println(data);
		
		Return2 re = new Return2();
		Node2[] list = re.getList(data);
		for(int i = 0; i < list.length; i++) {
			list[i].print();
		}
		//------------------------------------------------
		Node2 rank1 = re.getRank(data);
		rank1.print();
		
	}
}
