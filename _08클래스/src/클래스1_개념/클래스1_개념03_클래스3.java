package 클래스1_개념;

class Test03 {
	// int[] arr = new int[5];
	// arr[0] = 87;
	// ...
	int[] arr = {87, 100, 11, 72, 92};
}

public class 클래스1_개념03_클래스3 {
	public static void main(String[] args) {
		
		Test03 t3 = new Test03();
		
		// [문제1] 전체 합 출력
		// [정답1] 362
		int total = 0;
		for(int i=0; i<t3.arr.length; i++) {
			total += t3.arr[i];
		}
		System.out.println(total);
		
		// [문제2] 4의 배수의 합 출력
		// [정답2] 264
		total = 0;
		for(int i=0; i<t3.arr.length; i++) {
			if(t3.arr[i] % 4 == 0) {
				total += t3.arr[i];
			}
		}
		System.out.println(total);
		
		// [문제3] 4의 배수의 개수 출력
		// [정답3] 3
		int count = 0;
		for(int i=0; i<t3.arr.length; i++) {
			if(t3.arr[i] % 4 == 0) {
				count += 1;
			}
		}
		System.out.println(count);
		
		// [문제4] 짝수의 개수 출력
		// [정답4] 3
		count = 0;
		for(int i=0; i<t3.arr.length; i++) {
			if(t3.arr[i] % 2 == 0) {
				count += 1;
			}
		}
		
		System.out.println(count);
		
	}
}
