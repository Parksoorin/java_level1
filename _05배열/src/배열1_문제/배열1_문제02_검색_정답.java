package 배열1_문제;

import java.util.Scanner;

/*
	array배열은 학번과 점수가 한쌍으로 이루어진 데이터이다.
	
	[문제1] 
		학번을 입력하면, 점수를 출력하시오.
	[예시1]
		입력 : 1001
		출력 : 20
	[문제2] 
		점수를 입력하면, 학번을 출력하시오.
	[예시2]
		입력 : 20
		출력 : 1001
*/


public class 배열1_문제02_검색_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 학번	         0         2         4 (짝수)
		// 성적				  1         3         5(홀수)
		int[] array = {1001, 20, 1002, 45, 1003, 54};
		
		// 문제1
		System.out.print("입력 : ");
		int bunho = scan.nextInt();
		
		int index = -1;
		for(int i=0; i<array.length; i++) {
			if(i % 2 == 0 && bunho == array[i]) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("번호를 잘못입력했습니다.");
		} else {
			System.out.println(array[index + 1]);
		}
		
		// 문제2
		System.out.print("입력 : ");
		int score = scan.nextInt();
		
		index = -1;
		for(int i=0; i<array.length; i++) {
			if(i % 2 == 1 && score == array[i]) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("성적을 잘못입력했습니다.");
		} else {
			System.out.println(array[index - 1]);
		}
		
		scan.close();
		
	}
}
