package 배열1_문제;

/*
	[문제]
		nameList배열은 상품의 이름을,
		dataList는 각각 가격과 상품의 개수를 의미한다.
		현재 재고 수량은 새우깡 3개, 감자깡 1개, 고래밥 1개이다.
		아래 input 배열은 오늘 주문이 들어온 순서이다.
		총 매출을 출력해보시오.
		
	[정답]
		주문은 총 새우깡 2개, 감자깡 3개, 고래밥 3개가 들어왔지만,
		실제 판매한 품목은 새우깡 2개, 감자깡 1개, 고래밥 1개이다.
		7400원
*/

public class 배열1_문제06_인풋쇼핑_정답 {
	public static void main(String[] args) {
		
		String[] nameList = {"새우깡", "감자깡", "고래밥"};
		int[][] dataList = {
			{1000, 3},
			{2300, 1},
			{3100, 1}
		};
		int[] input = {1, 2, 2, 0, 0, 2, 1, 1};
		
		/*
			i = 0	
				dataList[1][1] > 0	true	
				total = 0 + 2300	
				dataList[1][1](0)
				{1000, 3},
				{2300, 0},
				{3100, 1}
			i = 1
				dataList[2][1] > 0	true	
				total = 2300 + 3100	
				dataList[2][1](0)
				{1000, 3},
				{2300, 0},
				{3100, 0}
			i = 2
				dataList[2][1] > 0	false	
			i = 3
				dataList[0][1] > 0	true	
				total = 5400 + 1000	
				dataList[0][1](2)
				{1000, 2},
				{2300, 0},
				{3100, 0}			
			i = 4
				dataList[0][1] > 0	true	
				total = 6400 + 1000	
				dataList[0][1](1)
				{1000, 1},
				{2300, 0},
				{3100, 0}	
			i = 5
				dataList[2][1] > 0	false		
			i = 6
				dataList[1][1] > 0	false		
			i = 7
				dataList[1][1] > 0	false		
		 */
		
		int total = 0;
		for(int i=0; i<input.length; i++) {
			
			if(dataList[input[i]][1] > 0) {
				total += dataList[input[i]][0];
				dataList[input[i]][1] -= 1;
			}
		}
		System.out.println(total);
		
	}
}
