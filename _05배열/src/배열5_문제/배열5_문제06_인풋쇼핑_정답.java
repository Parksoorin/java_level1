package 배열5_문제;

import java.util.Arrays;

/*
	[문제]
		아래 3개의 배열은 각각 다음과 같은 역할을 한다.
			nameList = 상품이름
			priceList = 상품가격
			countList = 상품개수
		
		즉, 현재 재고는 새우깡 3개, 감자깡 1개, 고래밥 1개 있다.	
	
	 	input 배열은 오늘 주문이 들어온순서이다.
	 	주문이 들어올 때마다 countList배열의 값을 1감소 시킨다.
	 	총 매출을 출력해보자.
	 
		 [예] 첫번째 1 ==> 감자깡의 개수는 1이므로 판매할수있다.
		 [예] 두번째 2 ==> 고래밥의 개수는 1이므로 판매할수있다.
		 [예] 세번째 2 ==> 고랩밥의 개수가 이미 두번째에서 구입해서 0이되므로 판매불가.
		 [예] .... 나머지도 계산해보자.
	 [정답]
		 주문은 총 새우깡 2개 , 감자깡 3개, 고래밥 3개 들어왔지만
		 재고 수량은 그보다 부족하기 때문에
		 실제 판매한 품목은 새우깡 2개, 감자깡 1개, 고래밥 1개 이다.
		 	
		 7400원
*/

public class 배열5_문제06_인풋쇼핑_정답 {
	public static void main(String[] args) {
		
		String[] nameList = {"새우깡" , "감자깡" , "고래밥"};
		int[] priceList   = {    1000,     2100,   3300};
		int[] countList   = {       3,       1,       1};
		
		int[] input = {1,2,2,0,0,2,1,1};		
		int[] sel = {0, 0, 0};
		
		int total = 0;
		for(int i=0; i<input.length; i++) {
			if(countList[input[i]] > 0) {
				countList[input[i]] -= 1;
				sel[input[i]] += 1;
				
				total += priceList[input[i]];
			}
		}
		System.out.println(Arrays.toString(countList));
		System.out.println(Arrays.toString(sel));
		System.out.println(total);
		
	}
}




