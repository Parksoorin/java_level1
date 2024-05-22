package 문자열1_문제;

/*
	[문제]
		userData안에 user의 값이 있는지 검사하시오.
	[정답]
		true
*/

public class 문자열1_문제02_문자열검색_정답 {
	public static void main(String[] args) {
		
		String userData = "1001,1002,1003,1004";
		int user = 1003;
		
		String[] temp = userData.split(",");
		
		boolean check = false;
		for(int i=0; i<temp.length; i++) {
			if(user == Integer.parseInt(temp[i])) {
				check = true;
				break;
			}
		}
		
		System.out.println(check);
	}
}
