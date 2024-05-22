package 배열1_문제;

import java.util.Scanner;

/*
	[문제]
		인덱스 2개를 입력받고
		작은 인덱스에서부터 큰 인덱스까지의 값들의 합을 출력하시오.
		단, index1이 index2보다 더 크더라도
		작은 인덱스부터 큰 인덱스까지의 합을 출력하시오.
	[예시]
		인덱스1 입력 : 1
		인덱스2 입력 : 3
		출력 : 43 + 25 + 76 = 144
		
		인덱스1 입력 : 4
		인덱스2 입력 : 1
		출력 : 43 + 25 + 76 + 3 = 147
*/

public class 배열1_문제03_일정범위합_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] array = {10, 43, 25, 76, 3, 100, 56};	
		
		System.out.print("인덱스1 입력 : ");
		int index1 = scan.nextInt();
		
		System.out.print("인덱스2 입력 : ");
		int index2 = scan.nextInt();
		
		/*
			[풀이]
				index1 = 1
				index2 = 3
				
				i = 1	total =  0 + 43		i < 3	true	출력 : 43 +
				i = 2	total = 43 + 25		i < 3	true	출력 : 43 + 25 +
				i = 3	total = 68 + 76		i < 3	false	출력 : 43 + 25 + 76
		 */
		
		if(0 <= index1 && index1 < array.length
				&& 0 <= index2 && index2 < array.length) {
			
			if(index1 > index2) {
				int temp = index1;
				index1 = index2;
				index2 = temp;
			}
			
			int total = 0;
			for(int i=index1; i<=index2; i++) {
				total += array[i];
				
				System.out.print(array[i]);
				
				if(i < index2) {
					System.out.print(" + ");
				}
			}
			System.out.println(" = " + total);
			
			
		} else {
			System.out.println("인덱스를 잘못입력했습니다.");
		}
		
		
		
		scan.close();
		
	}
}
