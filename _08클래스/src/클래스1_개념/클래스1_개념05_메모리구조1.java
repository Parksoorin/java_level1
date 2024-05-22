package 클래스1_개념;

import java.util.Scanner;

class Sample01 {
	int a;
	int b;
}

public class 클래스1_개념05_메모리구조1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Sample01 s1 = new Sample01();
		s1 = new Sample01();
		s1.a = scan.nextInt();
		
		// s1 = null;		
		
		// s1을 null로 저장하지 않아도
		// GC(Garbage Collector)가 알아서 메모리를 해제해준다.
		s1 = new Sample01();
		
		scan.close();
		
	}
}
