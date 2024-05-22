package 배열4_문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
	[문제]
		1. arr배열에 1~4 사이의 숫자를 랜덤하게 중복없이 저장한다.
		2. 사용자는 가장 작은수 1부터 순서대로 해당 방번호(인덱스)를 입력한다.
		3. 정답을 맞추면 해당 값을 9로 변경되어
		4. 모든 값이 9가되면 게임은 종료된다.
	[예시]
		{4, 2, 3, 1}
	
		인덱스 입력 : 3
		결과 : {4, 2, 3, 9}
		1은 가장 작은수 이므로 9로 변경한다. 
		
		인덱스 입력 : 0
		결과 : {4, 2, 3, 9}
		4는 가장 작은수가 아니므로 변화가 없다. 
*/

public class 배열4_문제01_게임1to4_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		// 중복숫자 금지 알고리즘 활용
		int[] arr = new int[4];
		boolean[] check = new boolean[4];
		
		/*
			3 0 1 3 2
			
			i = 0	rNum = 3	check[3] == false	
					check 	= [f,f,f,t]
					arr 	= [4,0,0,0]
			i = 1	rNum = 0	check[0] == false
					check 	= [t,f,f,t]
					arr 	= [4,1,0,0]	
			i = 2	rNum = 	1	check[1] == false	
					check 	= [t,t,f,t]
					arr 	= [4,1,2,0]		
			i = 3	rNum = 3	check[3] == false
			i = 3	rNum = 2	check[2] == false
					check 	= [t,t,t,t]
					arr 	= [4,1,2,3]				
			
			[4, 1, 2, 3]
		 */
		
		/*
		// for문
		for(int i=0; i<arr.length; i++) {
			int rNum = ran.nextInt(4);	// 0 ~ 3	
			System.out.println(rNum);
			
			if(check[rNum] == false) {
				check[rNum] = true;
				arr[i] = rNum + 1;
			}else {
				i -= 1;
			}
		}
		*/
		// while문
		int j = 0;
		while(j < arr.length) {
			int rNum = ran.nextInt(4);	
			
			if(check[rNum] == false) {
				check[rNum] = true;
				arr[j] = rNum + 1;
				j += 1;
			}
		}
		
		int gameNum = 1;
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr));
			
			System.out.print("가장 작은 숫자의 위치를 입력하세요 : ");
			int index = scan.nextInt();
			
			if(arr[index] == gameNum) {
				arr[index] = 9;
				gameNum += 1;
			}else {
				i -= 1;
			}
			
		}
		
		scan.close();
		
	}
}
