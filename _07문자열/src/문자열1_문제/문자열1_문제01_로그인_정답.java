package 문자열1_문제;

/*
	[문제]
		id 배열은 아이디를 저장해 놓은 것이다.
		find 변수는 로그인할 아이디이다.
		find의 값이 id배열에 있으면 "로그인 성공",
		없으면 "로그인 실패"를 출력하시오.
*/

public class 문자열1_문제01_로그인_정답 {
	public static void main(String[] args) {
		
		String[] id = {"qwer", "asdf", "zxc"};
		String find = "asdf";
		
		boolean check = false;
		for(int i=0; i<id.length; i++) {
			if(find.equals(id[i])) {
				check = true;
				break;
			}
		}
		
		if(check) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
	}
}
