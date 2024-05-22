package 클래스배열2_개념;

class Member{
	int number; 
	String id; 
	String pw; 
	String name; 
	int score;
}

public class 클래스배열2_개념01_기본이론1 {
	public static void main(String[] args) {
		
		String data1 = "1001/1234/qwer/김철수/10";	
		String[] dataList1 = {"1001", "1234", "qwer", "김철수", "10"};		
		
		Member member = new Member();
		member.number = 1001;
		member.id = "qwer";
		member.pw = "1234";
		member.name = "김철수";
		member.score = 10;
		
		//-------------------------------------------------	
		String data2 = "";
		data2 +="1001/qwer/1234/김철수/10\n";	
		data2 += "1002/asdf/2345/이영희/30";
		
		String[][] dataList2 ={
			{"1001" , "qwer" ,"1234", "김철수" , "10"},
			{"1002" , "asdf" ,"2345", "이영희" , "30"},
		};	
		
		int[]    arr        = new int[2];
		// 클래스 =  사용자 정의 데이터 타입
		Member[] memberList = new Member[2];
		System.out.println(memberList[0]);
		System.out.println(memberList[1]);
		
		Member m1 = new Member();
		m1.number = 1001;
		m1.id = "qwer";
		m1.pw = "1234";
		m1.name = "김철수";
		m1.score = 10;
		memberList[0] = m1;
		
		Member m2 = new Member();
		m2.number = 1002;
		m2.id = "asdf";
		m2.pw = "2345";
		m2.name = "이영희";
		m2.score = 30;
		memberList[1] = m2;
		
		System.out.println(arr);
		for(int i=0; i<memberList.length; i++) {
			System.out.println(memberList[i].name);
		}
		
	}
}







