package 클래스1_개념;

class Sample04 {
	int[] arr = {10, 20, 30, 40, 50};
}

public class 클래스1_개념08_메모리구조4 {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		Sample04 s4 = new Sample04();
		
		Sample04 temp = s4;
		s4 = null;
		
		// 에러가 발생한다.
		// 15번째 줄에서 null로 삭제했기 때문에
		// 새로 new를 하지 않으면 사용할 수 없다.
		// NullPointerException
		s4.arr = arr;	
		
	}
}





