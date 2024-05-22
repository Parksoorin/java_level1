package 클래스배열4_문제;

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

public class 클래스배열4_문제02_카트1_정답 {
	public static void main(String[] args) {
		
		String data1 = "qwer/asdf/zxcv";
		String data2 = "새우깡,1200/감자깡,3200/고구마깡,2100";
		String data3 = "qwer,새우깡/qwer,고구마깡/asdf,감자깡/qwer,새우깡/zxcv,새우깡";

		User[] userList;
		Item[] itemList;
		Cart[] cartList;
	
		// [문제] 문자열을 각각의 클래스배열에 저장하고, 회원별로 구매한 상품 총 금액을 출력하시오.
		// [정답] qwer(4500), asdf(3200), zxcv(1200)
		String[] tempData1 = data1.split("/");
		String[] tempData2 = data2.split("/");
		String[] tempData3 = data3.split("/");
		
		userList = new User[tempData1.length];
		for(int i=0; i<userList.length; i++) {
			userList[i] = new User();
			
			userList[i].id = tempData1[i];
		}
		
		itemList = new Item[tempData2.length];
		for(int i=0; i<itemList.length; i++) {
			itemList[i] = new Item();
			
			String[] info = tempData2[i].split(",");
			itemList[i].name = info[0];
			itemList[i].price = Integer.parseInt(info[1]);
		}
		
		cartList = new Cart[tempData3.length];
		for(int i=0; i<cartList.length; i++) {
			cartList[i] = new Cart();
			
			String[] info = tempData3[i].split(",");
			cartList[i].userId = info[0];
			cartList[i].itemName = info[1];
		}
		
		int[] total = new int[userList.length];
		for(int i=0; i<cartList.length; i++) {
			for(int j=0; j<userList.length; j++) {
				if(userList[j].id.equals(cartList[i].userId)) {
					
					for(int k=0; k<itemList.length; k++) {
						if(cartList[i].itemName.equals(itemList[k].name)) {
							total[j] += itemList[k].price;
						}
					}
					
				}
			}
		}
		
		for(int i=0; i<userList.length; i++) {
			System.out.println(userList[i].id + "(" + total[i] + ")");
		}
		
	}
}
