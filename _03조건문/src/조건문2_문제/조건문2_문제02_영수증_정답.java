package 조건문2_문제;

import java.util.Scanner;

/*
	[문제]
		1. 메뉴판을 출력한다.
		2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
		3. 현금을 입력받는다.
		4. 입력받은 현금과 메뉴가격을 확인해 영수증을 출력한다.
		5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
*/

public class 조건문2_문제02_영수증_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		
		// 1. 메뉴판을 출력한다.
		System.out.println("=== 롯데리아 ===");
		System.out.println("1. 새우버거 : " + price1 + "원");
		System.out.println("2. 치즈버거 : " + price2 + "원");
		
		// 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
		System.out.print("메뉴를 선택하세요 : ");
		int select = scan.nextInt();
		
		if(select == 1) {
			// 3. 현금을 입력받는다.
			System.out.print("현금을 입력하세요 : ");
			int money = scan.nextInt();
			// 4. 입력받은 현금과 메뉴가격을 확인해 영수증을 출력한다.
			// 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
			if(money < price1) {
				System.out.println("현금이 부족합니다.");
			}
			if(money >= price1) {
				int charge = money - price1;
				System.out.println("새우버거를 구매합니다.");
				System.out.println("거스름돈은 " + charge + "원 입니다.");
			}
		}
		if(select == 2) {
			// 3. 현금을 입력받는다.
			System.out.print("현금을 입력하세요 : ");
			int money = scan.nextInt();
			// 4. 입력받은 현금과 메뉴가격을 확인해 영수증을 출력한다.
			// 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
			if(money < price2) {
				System.out.println("현금이 부족합니다.");
			}
			if(money >= price2) {
				int charge = money - price2;
				System.out.println("치즈버거를 구매합니다.");
				System.out.println("거스름돈은 " + charge + "원 입니다.");
			}
		}
		
		if(select != 1 && select != 2) {
			System.out.println("오류");
		}
		
		scan.close();
		
	}
}
