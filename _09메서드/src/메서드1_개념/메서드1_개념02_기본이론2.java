package 메서드1_개념;

class Test02 {
	
	void printSum() {
		int total = 0;
		for(int i = 1; i <= 5; i++) {
			total += i;
		}
		System.out.println(total);
	}
	
}

public class 메서드1_개념02_기본이론2 {
	public static void main(String[] args) {
		
		Test02 t2 = new Test02();
		
		// 1~5의 합을 출력하는 메서드
		t2.printSum();
		
	}
}
