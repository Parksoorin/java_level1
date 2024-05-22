package 배열0_개념;

import java.util.Scanner;

/*
	[문제]
		수정할 인덱스를 입력받고
		수정할 값을 입력받아 해당 위치의 값을 수정하시오.
*/

public class 배열_개념10_수정 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		int[] arr = {21, 1, 67, 2, 0};	
		
		int count = 4;
		
		while(true) {
			for(int i=0; i<count; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();			
			System.out.println("1.수정");
			System.out.println("0.종료");
			
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}
			else if(sel == 1) {
				System.out.print("[수정]인덱스를 입력하세요 : ");
				int index = scan.nextInt();
				
				if(0 <= index && index < count) {
					System.out.print("[수정]값을 입력하세요 : ");
					int value = scan.nextInt();
					
					arr[index] = value; 
				}else {
					System.out.println("인덱스를 잘못 입력했습니다.");
				}
			}
		}
		
		scan.close();
		
	}
}
