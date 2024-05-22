package 배열4_문제;

import java.util.Scanner;

/*
	[문제]
		1. 추가
			(1) 값을 5개까지만 저장 가능
			(2) 중복되는 값은 저장 불가
			(3) 차례대로 뒤로 저장
		3. 수정
			(1) 인덱스를 입력받아 수정
			(2) 인덱스를 올바르게 입력했는지 검사
			(3) 중복되는 값으로 수정 불가
		4. 삭제(값)
			(1) 삭제할 값을 입력받아 해당 값 삭제
			(2) 입력받은 값이 올바른지 검사
			(3) count == 0 이 되면, 더이상 삭제할 값이 없다는 메세지 출력
		5. 삽입
			(1) 삽입할 위치값 입력받기
			(2) 삽입할 값 입력받기
			(3) 입력받은 값의 중복검사
			(4) 5개까지 삽입 가능
 */


public class 배열4_문제02_회원관리_문제 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {0, 0, 0, 0, 0};
		
		int count = 0;
		while(true) {
			for(int i=0; i<count; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			System.out.println("===[회원가입]===");
			System.out.println("0.종료");
			System.out.println("1.추가");
			System.out.println("2.수정");
			System.out.println("3.삭제(인덱스)");
			System.out.println("4.삭제(값)");
			System.out.println("5.삽입");
			
			int sel = scan.nextInt();
			
			if(sel == 0) {
				break;
			}
			else if(sel == 1) {
				
			}else if(sel == 2) {
				
			}else if(sel == 3) {
				
			}
			else if(sel == 4) {
				
			}else if(sel == 5) {
				
			}
		}
		
		scan.close();
		
	}
}
