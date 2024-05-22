package 배열6_문제;

/*
	[문제]
		1. seatList는 영화관 7자리를 의미한다.
		2. seatList의 값들은 예매한 회원번호를 나타낸다.
		3. find의 값들은 검색하고자하는 회원번호들이다.
		4. find의 값을 영화관에서 찾아 자리를 출력해주자.
		   단, 없는 번호는 X를 출력하시오.
	[정답]	   
	  	[1] find : 1004(은)는 없으므로 X
		[2] find : 1003(은)는 0 1 
		[3] find : 1001(은)는 6 
		[4] find : 1005(은)는 없으므로 X 
*/

public class 배열6_문제07_예매찾기_정답 {
	public static void main(String[] args) {
		
		int[] seatList = {1003,1003,0,0,1002,0,1001};	
		int[] find = {1004,1003,1001,1005};
		
		for(int i=0; i<find.length; i++) {
			System.out.printf("[%d] find : %d(은)는 ", (i+1), find[i]);
			
			boolean check = false;
			for(int j=0; j<seatList.length; j++) {
				// 일치할 때
				if(find[i] == seatList[j]) {
					System.out.print(j + " ");
					check = true;
				} 
			}
			// 불일치할 때
			if(check == false) {
				System.out.println("없으므로 X");
			} else {
				System.out.println();
			}
		}
		
	}
}





