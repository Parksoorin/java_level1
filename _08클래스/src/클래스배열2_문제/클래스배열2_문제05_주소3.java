package 클래스배열2_문제;

class CC {
	int a;
	int b;
}

public class 클래스배열2_문제05_주소3 {
	public static void main(String[] args) {
		
		CC[] ccList = new CC[3];
		for (int i = 0; i < ccList.length; i++) {
			ccList[i] = new CC();
			ccList[i].a = 10;
			ccList[i].b = 20;
		}
		// 실행 전 예상하기
		for (int i = 0; i < ccList.length; i++) {
			System.out.println(ccList[i].a + " " + ccList[i].b);
		}
		System.out.println("----------------------------");
		CC cc = ccList[0];
		cc.a = 100;

		// 실행전 예상하기
		for (int i = 0; i < ccList.length; i++) {
			System.out.println(ccList[i].a + " " + ccList[i].b);
		}
		
	}
}
