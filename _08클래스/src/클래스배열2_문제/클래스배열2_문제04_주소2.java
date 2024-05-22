package 클래스배열2_문제;

class BB{
	int a;
	int b;
}

public class 클래스배열2_문제04_주소2 {
	public static void main(String[] args) {
		
		BB [] bb = new BB[3];
		for(int i = 0; i < bb.length; i++) {
			bb[i] = new BB();
			bb[i].a = 10;
			bb[i].b = 20;
		}
		
		// 실행 전 예상하기
		for(int i = 0; i  < bb.length; i++) {
			System.out.println(bb[i].a + bb[i].b);
		}
		
	}
}
