package 배열1_문제;

import java.util.Scanner;

/*
	[문제] 학번을 입력받아 성적을 출력하시오. 
	 	  단, 없는학번 입력 시 예외처리 하시오.
	[예시]
		학번 입력 : 1002		성적 : 11점
		학번 입력 : 1000		해당학번은 존재하지 않습니다. 
*/	

public class 배열1_문제01_학생성적_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numberList = {1001, 1002, 1003, 1004, 1005};
		int[] scoreList  = {  87,   11,   45,   98,   23};
		
		System.out.print("학번 입력 : ");
		int bunho = scan.nextInt();
		
		/*
			bunho = 1002
				
					bunho == numberList[i]
			i = 0	1002 == 1001			false	index = -1
			i = 1	1002 == 1002			true	index = 1
			반복문 종료
		 */
		
		int index = -1;
		for(int i=0; i<numberList.length; i++) {
			if(bunho == numberList[i]) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("해당학번은 존재하지 않습니다.");
		} else {
			System.out.println(scoreList[index]);
		}

		scan.close();
		
	}
}
