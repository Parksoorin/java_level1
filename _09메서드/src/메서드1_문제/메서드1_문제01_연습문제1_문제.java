package 메서드1_문제;

/*
class Test01 {
	void printEvenOrOdd(int x) {
		if(x % 2 == 1) {
			System.out.println("홀수");
		}
	}
	
	void sumBetweenValues(int x, int y) {
	}

	void printPrimeNums(int primeNumber) {
	}
}
*/

public class 메서드1_문제01_연습문제1_문제 {
	public static void main(String[] args) {
		
		Test01 test = new Test01();
		// 문제 1) a 가 홀수인지 짝수인지 출력 
		int a = 19;
		test.printEvenOrOdd(a);

		// 문제 2) x부터 y까지의 합을 출력하는 메서드
		int x = 1;
		int y = 10;
		test.sumBetweenValues(x, y);

		// 문제3) 숫자 1개를 인자로 사용해서 2부터 인자까지의  소수 전부 출력 
		int primeNumber = 20;
		
	}
}
