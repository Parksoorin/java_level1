package 문자열2_문제;

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


public class 문자열2_문제08_장바구니검색_문제 {
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
		
	}
}
