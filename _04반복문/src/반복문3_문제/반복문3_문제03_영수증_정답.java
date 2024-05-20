package 반복문3_문제;

import java.util.Scanner;

/*
	[문제]
		1. 5번 주문을 받는다.
		2. 주문이 끝난 후, 돈을 입력받는다.
		3. 각 메뉴별 주문 수량과 총 금액을 출력한다.
	[예시]
		메뉴 선택 : 1
		메뉴 선택 : 1
		메뉴 선택 : 2
		메뉴 선택 : 2
		메뉴 선택 : 3
		총 금액 = 31300원
		현금 입력 : 32000원
		
		=== 롯데리아 영수증 ===
		1. 새우 버거 : 2개
		2. 치즈 버거 : 2개
		3. 콜라 : 1개
		4. 총 금액 : 31300원
		5. 잔돈 : 700원
 */

public class 반복문3_문제03_영수증_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.새우 버거 : " + price1 + "원");
		System.out.println("2.치즈 버거 : " + price2 + "원");
		System.out.println("3.콜 라 : " + price3 + "원");
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		int total = 0;
		for(int i=1; i<=5; i++) {
			System.out.print("메뉴 선택 : ");
			int select = scan.nextInt();
			
			if(select == 1) {
				total += price1;
				count1 += 1;
			} else if(select == 2) {
				total += price2;
				count2 += 1;
			} else if(select == 3) {
				total += price3;
				count3 += 1;
			}
		}
		System.out.println("총 금액 : " + total + "원");
		
		System.out.print("현금 입력 : ");
		int money = scan.nextInt();
		
		if(total <= money) {
			int charge = money - total;
			
			System.out.println("=== 롯데리아 영수증 ===");
			System.out.println("1. 새우 버거 : " + count1 + "개");
			System.out.println("2. 치즈 버거 : " + count2 + "개");
			System.out.println("3. 콜라 : " + count3 + "개");
			System.out.println("4. 총 금액 : " + total + "원");
			System.out.println("5. 잔돈 : " + charge + "원");
		} else {
			System.out.println("현금이 부족합니다.");
		}
		
		scan.close();
		
	}
}








