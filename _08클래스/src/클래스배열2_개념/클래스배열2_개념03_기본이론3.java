package 클래스배열2_개념;

/*
class Member{
	int number; 
	String id; 
	String pw; 
	String name; 
	int score;
}
 */

public class 클래스배열2_개념03_기본이론3 {
	public static void main(String[] args) {
		
		String[][] dataList ={
			{"1001" , "qwer" , "1234", "김철수" , "10"},
			{"1002" , "asdf" , "2345", "이영희" , "30"},
		};	
		
		int size = dataList.length;
		Member[] memberList = new Member[size];
		
		// 방법1
		for(int i = 0; i < size; i++) {
			Member m = new Member();
			m.number = Integer.parseInt(dataList[i][0]);
			m.id = dataList[i][1];
			m.pw = dataList[i][2];
			m.name =  dataList[i][3];
			m.score = Integer.parseInt(dataList[i][4]);
			
			memberList[i] = m;
		}
		
		// 방법2
		for(int i = 0; i < size; i++) {
			memberList[i] = new Member();
			
			memberList[i].number = Integer.parseInt(dataList[i][0]);
			memberList[i].id = dataList[i][1];
			memberList[i].pw = dataList[i][2];
			memberList[i].name =  dataList[i][3];
			memberList[i].score = Integer.parseInt(dataList[i][4]);
		}
		
	}
}







