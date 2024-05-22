package 클래스1_개념;

class Sample03 {
	int[] arr = {10, 20, 30, 40, 50};
}

public class 클래스1_개념07_메모리구조3 {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		Sample03 s3 = new Sample03();
		s3.arr = arr;
		
		System.out.println(s3.arr[0]);
		System.out.println(s3.arr[1]);
		System.out.println(s3.arr[2]);
		System.out.println(s3.arr[3]);
		System.out.println(s3.arr[4]);
		
	}
}
