package 메서드클래스배열5_문제;

class User {
	int userNumber;
	String userName;
}

class UserDAO {
	User[] userList = null;
	
	void setData(String userData) {
		String[] temp = userData.split(",");
		userList = new User[temp.length];
		
		for(int i=0; i<temp.length; i++) {
			User user = new User();
			String[] info = temp[i].split("/");
			user.userNumber = Integer.parseInt(info[0]);
			user.userName = info[1];
			
			userList[i] = user;
		}
	}
}

class Item {
	int itemNumber;
	String itemName;
}

class ItemDAO {
	Item[] itemList = null;
	
	void setData(String itemData) {
		String[] temp = itemData.split(",");
		itemList = new Item[temp.length]; 
		
		for(int i=0; i<itemList.length; i++) {
			Item item = new Item();
			String[] info = temp[i].split("/");
			item.itemNumber = Integer.parseInt(info[0]);
			item.itemName = info[1];
			
			itemList[i] = item;
		}
	}
}

class Cart {
	int userNumber;
	int itemNumber;;
}

class CartDAO {
	Cart[] cartList = null;
	
	void setData(String cartData) {
		String[] temp = cartData.split("\n");
		cartList = new Cart[temp.length];
		for(int i=0; i<cartList.length; i++) {
			Cart cart = new Cart();
			String[] info = temp[i].split("/");
			cart.userNumber = Integer.parseInt(info[0]);
			cart.itemNumber = Integer.parseInt(info[1]);
			
			cartList[i] = cart;
		}
	}
}

public class 메서드클래스배열5_문제06_카트DAO {
	public static void main(String[] args) {
		
		String userData = "3001/이만수,3002/김철민,3003/이영희";
		String itemData = "1001/고래밥,1002/새우깡,1003/칸쵸";
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
		
		UserDAO userDAO = new UserDAO();
		userDAO.setData(userData);
		
		ItemDAO itemDAO = new ItemDAO();
		itemDAO.setData(itemData);
		
		CartDAO cartDAO = new CartDAO();
		cartDAO.setData(cartData);
		
		/*
		 	[문제1]
		 		회원별 아이템 구매목록을 출력하시오.
		 	[정답1]
		 		이만수 ==> 고래밥3 칸쵸1 
				김철민 ==> 고래밥1 
				이영희 ==> 고래밥1 새우깡2 
		 */
		User[] userList = userDAO.userList;
		Cart[] cartList = cartDAO.cartList;
		Item[] itemList = itemDAO.itemList;
		
		for(int i=0; i<userList.length; i++) {
			System.out.print(userList[i].userName + " ==> ");
			for(int j=0; j<itemList.length; j++) {
				
				int count = 0;
				for(int k=0; k<cartList.length; k++) {
					if(userList[i].userNumber == cartList[k].userNumber
							&& itemList[j].itemNumber == cartList[k].itemNumber) {
						count += 1;
					}
				}
				if(count > 0) {
					System.out.print(itemList[j].itemName + count + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		/*
			[문제2]
			 아이템별로 구입한 회원이름을 출력하시오.
			[정답2]
			 고래밥 ==> 이만수 김철민 이영희 
			새우깡 ==> 이영희 
			칸쵸 ==> 이만수 
		 */
		for(int i=0; i<itemList.length; i++) {
			System.out.print(itemList[i].itemName + " ==> ");
			
			for(int j=0; j<userList.length; j++) {
				int index = -1;
				for(int k=0; k<cartList.length; k++) {
					if(itemList[i].itemNumber == cartList[k].itemNumber
							&& userList[j].userNumber == cartList[k].userNumber) {
						index = j;
						break;
					}
				}
				
				if(index != -1) {
					System.out.print(userList[index].userName + " ");
				}
			}
			System.out.println();
		}
				
	}
}




