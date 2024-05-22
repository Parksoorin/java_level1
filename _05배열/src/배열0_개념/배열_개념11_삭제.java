package 배열0_개념;

import java.util.Scanner;

/*
	[문제]
		삭제할 위치(=인덱스)를 입력받거나
		삭제할 값을 입력받아 arr배열에서 삭제하시오.
*/

public class 배열_개념11_삭제 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		int[] arr = {21, 1, 67, 2, 10};	
		
		int count = 5;
		
		while(true) {
			for(int i=0; i<count; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			System.out.println("1.삭제(인덱스)");
			System.out.println("2.삭제(값)");
			System.out.println("0.종료");
			
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}
			else if(sel == 1) {
				if(count > 0) {
					System.out.print("[삭제]인덱스를 입력하세요 : ");
					int index = scan.nextInt();
				
					if(0 <= index && index < count) {
						for(int i=index; i<count - 1; i++) {
							arr[i] = arr[i + 1];
						}
						count = count - 1;
					}else {
						System.out.println("인덱스를 잘못 입력했습니다.");
					}
				}else {
					System.out.println("더이상 삭제할 값이 없습니다.");
				}
			}else if(sel == 2) {
				if(count > 0) {
					System.out.print("[삭제]값 입력하세요 : ");
					int value = scan.nextInt();
					
					int index = -1;
					for(int i=0; i<count; i++) {
						if(arr[i] == value) {
							index = i;
						}
					}
					
					if(index == -1) {
						System.out.println("값을 잘못 입력했습니다.");
					}else {
						for(int i=index; i<count - 1; i++) {
							arr[i] = arr[i + 1];
						}
						count = count - 1;
					}
				}else {
					System.out.println("더이상 삭제할 값이 없습니다.");
				}
			}
		}
		
		scan.close();
		
	}
}
