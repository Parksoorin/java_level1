package 문자열1_개념;

/*
	# 형변환(type conversion)
		- 자료형(data type)을 바꾸는 것을 의미
*/

public class 문자열1_개념05_형변환 {
	public static void main(String[] args) {
		
		// 1. 기본 자료형 형변환하는 방법 : (자료형)변수
		// * 문자 -> 숫자
		
		// 글자도 사실 숫자로 되어있다.
		char ch = 'a';
		int chNum = (int)ch;
		System.out.println(chNum);			// 97
		
		ch = (char)(chNum + 1);
		System.out.println(ch);				// b
		
		// 2. 문자열 형변환하는 방법 : 특수함수를 사용해야한다.
		// * 문자열 -> 숫자
		String strNum = "10";
		int num = Integer.parseInt(strNum);
		System.out.println(num + 1);		// 11
		
		// * 숫자 -> 문자열
		// 방법1) 꼼수
		strNum = num + "";
		System.out.println(strNum + 1);		// 101
		
		// 방법2) 정식
		strNum = String.valueOf(num);
		System.out.println(strNum + 1);		// 101
		
	}
}
