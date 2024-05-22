package 클래스배열5_문제;

import java.util.Scanner;

class User{
	String id;
}

class Seat{
	int y;
	int x;
	String userId;
	boolean check;
	int price;
}

public class 클래스배열5_문제_영화예매_문제 {
	public static void main(String[] args) {
		
		int seatPrice = 12000;
		
		String[] userIdList = {"aaa" , "bbb" , "ccc"};
		String[][] seatUserIdList = {
			{null	,"aaa"	,"aaa"  ,null},
			{null   ,null 	,"bbb" 	,null},
			{"ccc" 	,"bbb" 	,null 	,"bbb"}
		};
		
		User[] userList = new User[userIdList.length];
		for(int i =0; i < userList.length; i++) {
			userList[i] = new User();
			userList[i].id = userIdList[i];
		}
		
		int seatSize = 12;		
		Seat[] seatList = new Seat[seatSize];
		int index = 0;
		for(int i =0; i < seatUserIdList.length; i++) {
			for(int j = 0; j < seatUserIdList[i].length; j++) {
				seatList[index] = new Seat();
				seatList[index].y = i;
				seatList[index].x = j;
				seatList[index].userId =seatUserIdList[i][j];
				if(seatUserIdList[i][j] == null) {
					seatList[index].check = false;
				}else {
					seatList[index].check = true;
				}
				seatList[index].price = seatPrice;
				index += 1;
			}
		}	
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("[0] 종료\n"
					+ "[1] 전체출력\n"
					+ "[2] 회원 aaa가 예약한 자리와 요금출력\n"
					+ "[3] 예약가능한 자리 위치출력 \n"
					+ "[4] 예약을 가장 많이한 회원출력");
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) {
				System.out.println("===[좌석예매]===");
				for(int i = 0; i < seatSize; i++) {
					if(seatList[i].check) {
						System.out.printf("[%5s]", seatList[i].userId);
					}else {
						System.out.printf("[%5s]","");
					}			
					if(i % 4 == 3) {
						System.out.println();
					}
				}
			} else if(sel == 2) {
				/* 직접 구현해보세요. */
			} else if(sel == 3) {
				/* 직접 구현해보세요. */
			} else if(sel == 4) {
				/* 직접 구현해보세요. */
			}
		}
		
		scan.close();
		
	}
}
