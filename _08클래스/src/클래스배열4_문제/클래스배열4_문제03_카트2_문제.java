package 클래스배열4_문제;

import java.util.Scanner;

/*
class User{
	String id;
}

class Item{
	String name;
	int price;
}

class Cart{
	String userId;
	String itemName;
}
*/ 

public class 클래스배열4_문제03_카트2_문제 {
	public static void main(String[] args) {
		
		String[] userIdList = {"aaa" , "bbb" , "ccc"};
		
		String[] itemNameList = {"사과" , "칸초" , "귤" , "감"};
		int [] itemPriceList = {10000, 2000, 6500, 3300};
		
		String[] cartUserIdList = {"aaa" , "ccc" , "aaa" , "bbb" , "aaa" ,"ccc"};
		String[] cartItemNameList = {"칸초" , "귤" , "칸초" , "사과" , "감" ,"사과"};
		
		User[] userList = new User[userIdList.length];
		for(int i =0; i < userList.length; i++) {
			userList[i] = new User();
			userList[i].id = userIdList[i];
		}
		
		Item[] itemList = new Item[itemNameList.length];
		for(int i =0; i < itemList.length; i++) {
			itemList[i] = new Item();
			itemList[i].name = itemNameList[i];
			itemList[i].price = itemPriceList[i];
		}
		
		Cart[] cartList = new Cart[cartUserIdList.length];
		for(int i =0; i < cartList.length; i++) {
			cartList[i] = new Cart();
			cartList[i].userId = cartUserIdList[i];
			cartList[i].itemName = cartItemNameList[i];
		}
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("[0] 종료\n"
					+ "[1] 전체출력\n"
					+ "[2] 회원 aaa가 주문한 각 아이템이름과 가격들을 출력 \n"
					+ "[3] 카트내용을 전부출력(회원 별 아이템 전체와 아이템 가격을 출력)\n"
					+ "[4] 주문한 아이템 갯수가 가장많은 회원출력\n"
					+ "[5] 주문한 아이템 총액이 가장큰 회원출력");
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			} else if(sel == 1) {
				/* 직접 구현해보세요. */
			} else if(sel == 2) {
				/* 직접 구현해보세요. */
			} else if(sel == 3) {
				/* 직접 구현해보세요. */
			} else if(sel == 4) {
				/* 직접 구현해보세요. */
			} else if(sel == 5) {
				/* 직접 구현해보세요. */
			}
		}
		
		scan.close();
		
	}
}
