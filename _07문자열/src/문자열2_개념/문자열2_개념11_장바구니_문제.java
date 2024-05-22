package 문자열2_개념;

import java.util.Scanner;

/*
	[문제]
		1. 로그인 후, 쇼핑 메뉴를 선택하면
		   다음과 같은 상품 목록을 출력한다.
		   (1)사과 (2)바나나 (3)딸기
		2. 번호를 선택해 상품을 장바구니에 담는다.
		3. 로그인 회원의 아이디는 cartList배열의 0열에 저장한다.
		4. 해당 회원이 구매한 상품은 cartList배열의 1열에 저장한다.
		
			예)
				{qwer,  사과},
				{javaking,  바나나},
				{abcd,  사과},
				{qwer,  딸기},
				{qwer,  사과},
				...
		5. 장바구니 메뉴를 선택하면, 로그인 한 회원의 구매 물품만 출력한다.
			예)
				qwer = 사과, 딸기, 사과
*/

public class 문자열2_개념11_장바구니_문제 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] idList = {"qwer", "javaking", "abcd"};
		String[] pwList = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		String[][] cartList = new String[MAX_SIZE][2];
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int log = -1;
		int count = 0;
		while(true) {
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {}
			else if(sel == 2) {}
			else if(sel == 3) {}
			else if(sel == 4) {}
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}		
		}
		
		scan.close();
		
	}
}
