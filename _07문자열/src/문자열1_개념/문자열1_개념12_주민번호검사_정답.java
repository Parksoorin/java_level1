package 문자열1_개념;

/*
	[문제]
		주민번호 정보를 통해 성별과 나이를 출력하시오.
	[정답]
		성별 : 여성
		나이 : 34세
*/

public class 문자열1_개념12_주민번호검사_정답 {
	public static void main(String[] args) {
	
		String jumin = "890101-2012932";
		
		char key = jumin.charAt(7);
		if(key == '1' || key == '3') {
			System.out.println("남성");
		} else if(key == '2' || key == '4') {
			System.out.println("여성");
		}
		
		String strYear = jumin.substring(0, 2);
		int year = 1900 + Integer.parseInt(strYear);
		int age = 2023 - year;
		System.out.println(age + "세");
		
	}
}
