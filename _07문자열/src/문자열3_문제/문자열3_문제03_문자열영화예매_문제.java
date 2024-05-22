package 문자열3_문제;

import java.util.Scanner;

/*
	[문제]
		seatList배열은 영화좌석이다.
		1. 영화예매 시, 좌석을 출력해준다.
		   이미 예매한 곳은 [X], 빈 자리는 [ ] 이렇게 표현한다.
		   예매성공 시 seatList 배열에 아이디를 저장한다.
		2. 예매취소 시, 2차원 배열이므로
		   y와 x의 위치값을 입력받아 처리한다.
		3. 예매확인 시, seatList에서 로그인한 아이디의 자리를 전부 출력한다.
*/

public class 문자열3_문제03_문자열영화예매_문제 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] seatList = new String[6][6];
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				// null을 빈문자열로 초기화해준다.
				seatList[i][j] = "";
			}
		}
		
		String[] idList = {"qwer", "abcd", "haha", "hello"};
		
		int log = -1;
		
		while(true) {
			
			System.out.println("[영화 예매사이트]");
			System.out.println("[1]로그인");
			System.out.println("[0]종료");
			
			int select = scan.nextInt();
			
			if(select == 0) { break; }
			else if(select == 1) {
				
				while(true) {
					System.out.println("[1]영화예매");
					System.out.println("[2]예매취소");
					System.out.println("[3]예매확인");
					System.out.println("[0]로그아웃");
					
					int menu = scan.nextInt();
					if(menu == 0) { break; }
					else if(menu == 1) {}
					else if(menu == 2) {}
					else if(menu == 3) {}
				}
			}
		}
		
		scan.close();
		
	}
}
