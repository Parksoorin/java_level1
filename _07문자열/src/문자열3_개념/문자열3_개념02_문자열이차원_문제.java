package 문자열3_개념;

/*
	[문제]
		userData는 회원번호와 이름이다.
		pointData는 포인트점수와 회원번호이다.
		번호가 여러개면 누적할 수 있다.
		점수가 가장 높은 회원의 이름을 출력하시오.
	[정답]
		1002회원 : 3점
*/

public class 문자열3_개념02_문자열이차원_문제 {
	public static void main(String[] args) {
		
		String userData = "1001/김철수\n";
		userData += "1002/이만수\n";
		userData += "1003/이영희";
		
		
		String pointData = "1,1001\n";
		pointData += "1,1002\n";
		pointData += "2,1003\n";
		pointData += "1,1001\n";
		pointData += "2,1002";
		
	}
}
