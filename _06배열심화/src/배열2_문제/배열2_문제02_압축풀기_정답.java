package 배열2_문제;

import java.util.Arrays;

/*
	[문제]
		아래 arr배열은 압축한 데이터이다.
		데이터는 2개씩 짝을 이룬다는 규칙이 있다.
		(1) 앞의 숫자 : 데이터
		(2) 뒤의 숫자 : 개수
		
		예) 
		    {3, 2}	=> 33
		   	{5, 6}  => 555555
			...
			결국 실제 데이터는 335555552444 인 것이다.
		
			아래 temp 배열을 위 데이터의 크기만큼 생성하고,
			각각의 값을 저장 후 출력하시오.
	[정답]
		temp = {3,3,5,5,5,5,5,5,2,4,4,4}
*/	

public class 배열2_문제02_압축풀기_정답 {
	public static void main(String[] args) {
		
		int[][] arr = {
			{3, 2},
			{5, 6},
			{2, 1},
			{4, 3}
		};
		
		int[] temp = null;
		// 1. temp배열의 길이 구하기
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			count += arr[i][1];
		}
		System.out.println("count = " + count);
		
		// 2. 1번에서 구한 길이만큼의 temp배열을 생성
		temp = new int[count];
		
		// 3. 문제에서 요구한 데이터를 temp배열에 저장
		/*
			index = 0
			i = 0, value=3, size=2
				j = 0  temp = [3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]	index = 1
				j = 2  temp = [3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]	index = 2
			i = 1, value=5, size=6
				j = 0  temp = [3, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0]	index = 3
				j = 1  temp = [3, 3, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0]	index = 4
				....
		 */
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			int value = arr[i][0];		// 3값
			int size = arr[i][1];		// 2회
			for(int j=0; j<size; j++) {
				temp[index] = value;
				index += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
		
	}
}





