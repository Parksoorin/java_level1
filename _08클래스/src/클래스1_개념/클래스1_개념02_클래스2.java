package 클래스1_개념;

/*
 * The type Test01 is already defined
class Test01 {
	
}
*/

/*
	같은 패키지 안의 클래스는
	다른 클래스에서 사용할 수 있다.
	
	=
	
	같은 패키지 내에서는
	클래스를 중복해서 사용할 수 없다.
*/

/*
class Student {

}
*/

class Test02 {
	String name;
	int score;
}

public class 클래스1_개념02_클래스2 {
	public static void main(String[] args) {
		
		Test01 t1 = new Test01();
		t1.x = 10;
		t1.y = 20;
		System.out.println(t1.x);
		System.out.println(t1.y);
		
		Test02 t2 = new Test02();
		t2.name = "홍길동";
		t2.score = 87;
		System.out.println(t2.name);
		System.out.println(t2.score);
		
	}
}
