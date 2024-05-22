package 배열4_문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
	[기억력 게임]
		1. front배열 카드 10장을 섞는다.(shuffle)
		2. front배열에서 같은 카드 두 장을 고르기 위해
		   카드의 인덱스를 입력받는다.
		3. 사용자가 선택한 두 장의 카드가 같은 카드이면,
		   back배열에 표시한다.
		4. 모든 카드가 뒤집히면(= back배열에 0이 사라지면)
		   게임은 종료된다.
*/

public class 배열4_문제05_기억력게임_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] front = {1,1,2,2,3,3,4,4,5,5};
		int[] back = {0,0,0,0,0,0,0,0,0,0};
		
		// 1. front배열 shuffle
		for(int i=0; i<50; i++) {
			int r1 = ran.nextInt(front.length);
			int r2 = ran.nextInt(front.length);
			
			int temp = front[r1];
			front[r1] = front[r2];
			front[r2] = temp;
		}
		System.out.println(Arrays.toString(front));
		
		int count = 0;
		
		// 2. 게임시작
		while(true) {
			System.out.println(Arrays.toString(front));
			System.out.println(Arrays.toString(back));
			
			// 3. 게임 종료
			if(count == front.length/2) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			// 2-1. 사용자로부터 인덱스 2개 입력받기
			System.out.print("인덱스1 입력 : ");
			int index1 = scan.nextInt();
			System.out.print("인덱스2 입력 : ");
			int index2 = scan.nextInt();
			
			// 2-2. 예외처리
			if(index1 == index2) {
				System.out.println("인덱스 선택 오류!");
				continue;
			}
			if(back[index1] != 0 || back[index2] != 0) {
				continue;
			}
			
			// 2-3. 선택한 카드가 같은 숫자인지 확인
			if(front[index1] == front[index2]) {
				back[index1] = front[index1];
				back[index2] = front[index2];
				
				count += 1;
			}
		}
		
		scan.close();
		
	}
}