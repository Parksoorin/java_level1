package 배열4_문제;

import java.util.Scanner;

/*
	[문제]
		1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
		2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
		3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
		4. 한 좌석당 에매 가격은 12000원이다.
		5. 프로그램 종료 후, 해당 영화관의 총 매출 금액을 출력한다.
	[예시]
		seat = 0 0 0 0 0 0 0
		
		좌석선택 : 1
		seat = 0 1 0 0 0 0 0
		
		좌석선택 : 3
		seat = 0 1 0 1 0 0 0
		
		좌석선택 : 3
		seat = 0 1 0 1 0 0 0
		이미 예매가 완료된 자리입니다.
		-------------------------
		총 금액 : 24000원
 */

public class 배열4_문제04_영화예매_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		int[] seat = new int[7];
		
		int price = 12000;
		
		int count = 0;
		boolean run = true;
		while(run) {
			System.out.println("== 영화관 ==");				
			System.out.println("1.좌석예매");
			System.out.println("2.구매");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				for(int i = 0; i < 7; i++) {
					System.out.print(seat[i] + " ");
				}
				System.out.println();	
				
				System.out.println("예매할 좌석을 입력하세요.");
				// 이후 알아서 만들기 
				
				int index = scan.nextInt();
				if(seat[index] == 0) {
					seat[index] = 1;
					count += 1;
				} else {
					System.out.println("이미 예매가 완료된 자리입니다.");
				}
				
			}
			else if(sel == 2) {
				System.out.println("정산후종료.");
				
				int total = price * count;
				System.out.println(total + "원");
				
				run = false;
			}
		}
		
		scan.close();
		
	}
}
