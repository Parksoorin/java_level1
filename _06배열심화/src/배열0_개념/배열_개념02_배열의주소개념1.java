package 배열0_개념;

public class 배열_개념02_배열의주소개념1 {
	public static void main(String[] args) {
	
		/*
			1. 일반 변수 = 값(정수,실수,문자,boolean)
			2. 주소 변수 = 배열
		 */
		
		int a = 0;
		
		int[] arr = { 87, 100, 24, 11, 79 };
		// int[] arr = new int[5];
		// arr[0] = 87;
		// arr[1] = 100;
		// arr[2] = 24;
		// arr[3] = 11;
		// arr[4] = 79;
		arr[1] = 600;
		
		int[] temp = arr;
	
		temp[1] = 0;		// arr[1] = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.print(temp[i] + " ");
		}

		System.out.println();
		System.out.println(arr);
		System.out.println(temp);
	
		// arr1과 arr2 의 값이 같다를 표현해보세요.
		// 아래와 같이 일일히 검사 해야한다.
		int[] arr1 = {10,20,30,40};
		int[] arr2 = {10,20,30,40};
		
		if(arr1 == arr2) {
			System.out.println("같다.1");
		}else{
			System.out.println("다르다.1");
		}
		
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				count += 1;
			} else {
				break;
			}
		}
		if (count == arr1.length) {
			System.out.println("같다.2");
		} else {
			System.out.println("다르다.2");
		}
		
	}
}
