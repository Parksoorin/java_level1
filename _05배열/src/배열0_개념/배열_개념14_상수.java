package 배열0_개념;

public class 배열_개념14_상수 {
	public static void main(String[] args) {
		
		int a = 10;
		a = 20;
		a = 30;
		
		// 상수 ==> 변하지 않는수 
		// 키워드 final ==> 말그대로 마지막값이라는뜻 (변형불가)
		
		final int b = 20;
		// b = 30; //키워드 final을 붙이면 한번정한값을 수정할수없다.
		
		// 자바는 일반적으로 상수는 대문자로 표시한다. (암묵적인룰)
		final int MAX_SIZE = 20;
		int[] arr = new int[MAX_SIZE];
		
	}
}
