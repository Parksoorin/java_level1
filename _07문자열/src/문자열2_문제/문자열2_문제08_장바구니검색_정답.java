package 문자열2_문제;

import java.util.Arrays;

/*
	[문제1] 
		회원별로 아이템 구매목록을 출력하시오.
	[정답1] 
		이만수(고래밥 3개, 칸쵸 1개)
		김철민(고래밥 1개)
		이영희(고래밥 1개, 새우깡 2개)
	
	[문제2]
		아이템별로 구입한 회원이름을 출력하시오.
	[정답2]
		고래밥(이만수, 김철민, 이영희)
		새우깡(이영희)
		칸쵸(이만수)
*/


public class 문자열2_문제08_장바구니검색_정답 {
	public static void main(String[] args) {
		
		String itemData = "1001/고래밥,1002/새우깡,1003/칸쵸";
		String userData = "3001/이만수,3002/김철민,3003/이영희";
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
		
		String[] itemTemp = itemData.split(",");
		String[] userTemp = userData.split(",");
		String[] cartTemp = cartData.split("\n");
		
		String[][] itemList = new String[itemTemp.length][2];
		String[][] userList = new String[userTemp.length][2];
		String[][] cartList = new String[cartTemp.length][2];
		
		for(int i=0; i<itemTemp.length; i++) {
			String[] info = itemTemp[i].split("/");
			itemList[i][0] = info[0];
			itemList[i][1] = info[1];
			
			info = userTemp[i].split("/");
			userList[i][0] = info[0];
			userList[i][1] = info[1];
		}
		
		for(int i=0; i<cartTemp.length; i++) {
			String[] info = cartTemp[i].split("/");
			
			cartList[i][0] = info[0];
			cartList[i][1] = info[1];
		}
		
		for(int i=0; i<itemList.length; i++) {
			System.out.println(Arrays.toString(itemList[i]));
		}
		System.out.println();
		for(int i=0; i<userList.length; i++) {
			System.out.println(Arrays.toString(userList[i]));
		}
		System.out.println();
		for(int i=0; i<cartList.length; i++) {
			System.out.println(Arrays.toString(cartList[i]));
		}
		
		int[][] resultList = new int[userList.length][itemList.length];
		for(int i=0; i<userList.length; i++) {
			
			for(int j=0; j<cartList.length; j++) {
				if(userList[i][0].equals(cartList[j][0])) {
					
					for(int k=0; k<itemList.length; k++) {
						if(itemList[k][0].equals(cartList[j][1])) {
							resultList[i][k] += 1;
						}
					}
					
				}
			}
		}
		
		for(int i=0; i<resultList.length; i++) {
			System.out.println(Arrays.toString(resultList[i]));
		}
		
	}
}


















