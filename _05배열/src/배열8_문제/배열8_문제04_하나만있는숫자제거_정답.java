package 배열8_문제;

import java.util.Arrays;
import java.util.Scanner;

/*
	[문제]
		test배열에서 혼자 있는 숫자를 제거해
		temp배열에 저장하시오.
	[정답]
		test1 = {1, 2, 2, 1}
		test2 = {4, 4}
		test3 = {1, 1, 1, 1, 1}
*/

public class 배열8_문제04_하나만있는숫자제거_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] test1 = {1, 2, 3, 2, 1};
		int[] test2 = {1, 3, 4, 4, 2};
		int[] test3 = {1, 1, 1, 1, 1};
		
		int[] temp = null;
		
		/*
		 	1. test1배열에서 혼자만 있는 숫자를 제외한
		 	   수의 개수를 구한다.
		 	   정답) 4개(3을 제외)
		 	2. 1번에서 구한 길이만큼 temp배열을 생성한다. (중요!)
		 	   temp = new int[4];
		 	3. temp배열에 3을 제외한 나머지 숫자를 순차적으로 저장한다.
		 	   temp = [1, 2, 2, 1]
		 */
		
		while(true) {
			System.out.println("(1) test1 결과");
			System.out.println("(2) test2 결과");
			System.out.println("(3) test3 결과");
			System.out.println("(0) 종료");
			
			int choice = scan.nextInt();
			
			if(choice == 0) { break; }
			else if(choice == 1) {
				// 1, 2, 3, 2, 1
				int total = 0;
				for(int i=0; i<test1.length; i++) {
					int count = 0;
					for(int j=0; j<test1.length; j++) {
						if(test1[i] == test1[j]) {
							count += 1;
						}
					}
					if(count > 1) {
						total += 1;
					}
				}
				System.out.println(total);
				
				temp = new int[total];
				int index = 0;
				for(int i=0; i<test1.length; i++) {
					int count = 0;
					for(int j=0; j<test1.length; j++) {
						if(test1[i] == test1[j]) {
							count += 1;
						}
					}
					if(count > 1) {
						temp[index] = test1[i];
						index += 1;
					}
				}
				System.out.println(Arrays.toString(temp));
			}
			else if(choice == 2) {
				int total = 0;
				for(int i=0; i<test2.length; i++) {
					int count = 0;
					for(int j=0; j<test2.length; j++) {
						if(test2[i] == test2[j]) {
							count += 1;
						}
					}
					if(count > 1) {
						total += 1;
					}
				}
				System.out.println(total);
				
				temp = new int[total];
				int index = 0;
				for(int i=0; i<test2.length; i++) {
					int count = 0;
					for(int j=0; j<test2.length; j++) {
						if(test2[i] == test2[j]) {
							count += 1;
						}
					}
					if(count > 1) {
						temp[index] = test2[i];
						index += 1;
					}
				}
				System.out.println(Arrays.toString(temp));
			}
			else if(choice == 3) {
				int total = 0;
				for(int i=0; i<test3.length; i++) {
					int count = 0;
					for(int j=0; j<test3.length; j++) {
						if(test3[i] == test3[j]) {
							count += 1;
						}
					}
					if(count > 1) {
						total += 1;
					}
				}
				System.out.println(total);
				
				temp = new int[total];
				int index = 0;
				for(int i=0; i<test3.length; i++) {
					int count = 0;
					for(int j=0; j<test3.length; j++) {
						if(test3[i] == test3[j]) {
							count += 1;
						}
					}
					if(count > 1) {
						temp[index] = test3[i];
						index += 1;
					}
				}
				System.out.println(Arrays.toString(temp));
			}
		}
		
		scan.close();
		
	}
}
