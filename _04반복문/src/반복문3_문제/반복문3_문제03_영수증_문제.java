package 반복문3_문제;


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

public class 반복문3_문제03_영수증_문제 {
	public static void main(String[] args) {
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.새우 버거 : " + price1 + "원");
		System.out.println("2.치즈 버거 : " + price2 + "원");
		System.out.println("3.콜 라 : " + price3 + "원");
		
	}
}
