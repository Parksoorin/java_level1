package 클래스배열4_문제;

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

public class 클래스배열4_문제02_카트1_문제 {
	public static void main(String[] args) {
		
		String data1 = "qwer/asdf/zxcv";
		String data2 = "새우깡,1200/감자깡,3200/고구마깡,2100";
		String data3 = "qwer,새우깡/qwer,고구마깡/asdf,감자깡/qwer,새우깡/zxcv,새우깡";

		User[] userList;
		Item[] itemList;
		Cart[] cartList;
	
		// [문제] 문자열을 각각의 클래스배열에 저장하고, 회원별로 구매한 상품 총 금액을 출력하시오.
		// [정답] qwer(4500), asdf(3200), zxcv(1200)
		
	}
}
