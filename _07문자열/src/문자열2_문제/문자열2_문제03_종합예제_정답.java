package 문자열2_문제;

/*
	[문제]
		1. numList배열은 학생번호를 저장한 것이다.
		2. nameList배열은 이름을 저장한 것이다.
		3. 위 두 배열을 정답과 같이 data변수에
		   하나의 문자열로 저장하시오.
	[정답]
		"1001/김철수,1002/이만수,1003/이영희"
*/

public class 문자열2_문제03_종합예제_정답 {
	public static void main(String[] args) {
		
		String data = "";
		
		int[] numList = {1001, 1002, 1003};
		String[] nameList = {"김철수", "이만수", "이영희"};
		
		for(int i=0; i<numList.length; i++) {
			data += numList[i];
			data += "/";
			data += nameList[i];
			if(i < numList.length - 1) {
				data += ",";
			}
		}
		System.out.println(data);
		
	}
}
