package 클래스배열3_문제;

/*
class Member{
	int no;
	int point;
	String name;
	boolean best;
}
*/

public class 클래스배열3_문제01_문자열3_정답 {
	public static void main(String[] args) {
		
		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";
		String data2 = "1001/이만수,1002/김철수,1003/신민아,1004/박상아";
		
		// data1은 사원번호와 판매실적이다.
		// data2는 사원번호와 이름이다.
		// 판매실적이 4이상인 사원은 best를 true로 저장하시오.
		
		// 문제1) 위데이터를 참고해서 Member 클래스 배열을 완성후 전체 출력하시오.
		// 문제2) 판매실적이 best인 회원 이름을 출력하시오. 
		Member[] memberList = null;
		
		String[] temp1 = data1.split(",");
		String[] temp2 = data2.split(",");
		memberList = new Member[temp2.length];
		for(int i=0; i<memberList.length; i++) {
			memberList[i] = new Member();
			
			String[] info1 = temp2[i].split("/");
			memberList[i].no = Integer.parseInt(info1[0]);
			memberList[i].name = info1[1];
		}
		
		for(int i=0; i<temp1.length; i++) {
			String[] info2 = temp1[i].split("/");
			
			for(int j=0; j<memberList.length; j++) {
				if(Integer.parseInt(info2[0]) == memberList[j].no) {
					memberList[j].point += Integer.parseInt(info2[1]);
				}
			}
		}
		
		for(int i=0; i<memberList.length; i++) {
			if(memberList[i].point >= 4) {
				memberList[i].best = true;
			}
			System.out.println(memberList[i].no + ", " + memberList[i].name + ", " + memberList[i].point + ", " + memberList[i].best);
		}
		
	}
}
