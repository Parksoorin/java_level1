package 문자열1_개념;

/*
	문자들은 기본적으로 숫자를 가지고있다.
	compareTo는 빼기를 의미한다.
	"a"가 숫자 97이라면 "b"는 98이다.
	a에서 b를 뺀다면, 음수가 나올것이다.
*/

public class 문자열1_개념03_문자열비교 {
	public static void main(String[] args) {
		
		String str1 = "가";		
		String str2 = "나";		
		
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// 음수
		
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);			// 양수
		
		String str3 = "가";
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);			// 0
		
	}
}
