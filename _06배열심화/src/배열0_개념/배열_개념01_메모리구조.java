package 배열0_개념;

import java.util.Arrays;

/*
	1. 문서 전체의 코드가 data영역에 로드
	2. main() 메서드 로드 = stack
	3. main() 메서드 내에 있는
		코드를 첫 줄부터 위에서 아래로
		순차적으로 실행하면서 로드
 */

public class 배열_개념01_메모리구조 {
	public static void main(String[] args) {
		
		// 데이터 영역을 구분해서 저장
		// (1) stack(=스택)
		// (2) heap(=힙)
		// (3) static(=스태틱)

		int a = 10;	
		int b = 20;
		///          힙메모리에(new)
		//           정수형 방을 3개 생성해줘!
		int[] arr = new int[3];		
		System.out.println(arr);		
		arr[0] = 200;
		System.out.println(Arrays.toString(arr));
		
	}
}






