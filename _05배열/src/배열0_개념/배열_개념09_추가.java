package 배열0_개념;

import java.util.Scanner;

/*
	[문제]
		arr 배열에 값을 1개씩 입력받아 저장한다.
		단, 5개 이상 추가할 수 없다.
*/

public class 배열_개념09_추가 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		int[] arr = {0, 0, 0, 0, 0};	
		
		// (1) 값의 개수
		// (2) 다음 값을 추가할 위치
		int count = 0;
		
		while(true) {
			for(int i=0; i<count; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("1.추가");
			System.out.println("0.종료");
			
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}
			else if(sel == 1) {
				if(count < 5) {
					System.out.print("[추가]값을 입력하세요 : ");
					int value = scan.nextInt();
					
					arr[count] = value;
					count += 1;
				}else {
					System.out.println("더이상 추가할 수 없습니다.");
				}
			}
		}
		
		scan.close();
		
	}
}
