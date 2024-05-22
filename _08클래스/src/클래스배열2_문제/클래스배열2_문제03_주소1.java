package 클래스배열2_문제;

class AA{
	int a;
	int b;
}

public class 클래스배열2_문제03_주소1 {
	public static void main(String[] args) {
		
		AA aa = new AA();
		aa.a = 10;
		aa = new AA();
		aa.b = 20;
		
		// 실행 전 예상하기
		System.out.println(aa.a + " ," + aa.b);
		
	}
}
