package 문자열1_개념;

import java.util.Arrays;

public class 문자열1_개념04_문자열함수 {
	public static void main(String[] args) {
	
		//            012345678
		String str = "itacademy";
		
		// 1. 문자열의 길이 : length()
		int[] arr = {10, 20, 30};
		System.out.println("배열의 길이 = " + arr.length);
		System.out.println("문자열의 길이 = " + str.length());
		
		int size = str.length();
		
		// 2. 문자 한 개 추출(인덱싱) : charAt(index)
		char ch = str.charAt(0);
		System.out.println(ch);
		
		ch = str.charAt(str.length() - 1);
		// ch = str.charAt(8);
		System.out.println(ch);
		
		// 3. 문자 여러개 추출(슬라이싱)
		// 1) substring(index1, index2)
		//     index1 <= 문자열 < index2
		String rs = str.substring(2, 9);
		System.out.println(rs);
		// 2) substring(index)
		//    index부터 문자열의 맨 끝까지~
		rs = str.substring(2);
		System.out.println(rs);
		
		// 4. split(구분자 문자) : 구분자로 잘라내어 배열에 저장
		str = "서울시,송파구,1234";
		String[] temp = str.split(",");
		System.out.println(Arrays.toString(temp));
		
		// 5. trim() : 앞뒤 공백 제거
		String str1 = "   Hello Java!  ";
		// 가운데 공백은 제거 안됨
		str1 = str1.trim();
		System.out.println("[" + str1 + "]");
		
		// 6. replaceAll("기존단어","대체단어") : 문자열 변경
		str1 = str1.replaceAll("Java", "JSP");
		System.out.println(str1);
		
		String str2 = "a b c d";
		str2 = str2.replaceAll(" ", "");
		System.out.println(str2);
		
	}
}






