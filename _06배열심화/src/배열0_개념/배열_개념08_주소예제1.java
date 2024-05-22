package 배열0_개념;

public class 배열_개념08_주소예제1 {
	public static void main(String[] args) {
		
		
		int[] arr1 = {10,20,30,40};
		int[] arr2 = {10,20,30,40};
		
		// [문제1] 아래 주석을 풀고 실행했을 때 어떤 값이 나올지 예상하고 주석을 푸시오.
		/*
		if(arr1 == arr2) {
			System.out.println("같다1");
		}else {
			System.out.println("다르다1");
		}
		*/
		
		// [문제2] 아래 주석을 풀고 실행했을 때 어떤 값이 나올지 예상하고 주석을 푸시오.
		int[] arr3 = {10,20,30,40};
		int[] temp = arr3;
		int[] arr4 = temp;
		/*
		if(arr3 == arr4) {
			System.out.println("같다2");
		}else {
			System.out.println("다르다2");
		}
		*/
		
	}
}
