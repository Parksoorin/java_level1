package 문자열2_문제;

/*
	[문제]
		cart데이터는 현재 장바구니 상황이다.
		
		input데이터는 삭제를 요청한 데이터이다.
		qwer은 아이디이고, 3은 삭제할 위치이다.
		qwer 입장에서는 본인 아이템은 3개 밖에 없으니
		칸쵸를 지우기 위해 3을 선택했지만 전체 데이터에서는 5번째 아이템이다.
		
		마찬가지로 abcd는 콜라와 사이다를 구입했고,
		콜라를 지우기 위해 1번을 선택했지만
		실제로는 3번 아이템이 삭제되어야 한다.
		
		삭제 후 cart배열의 정보를 출력하시오.
	[정답]
		qwer/고래밥
		qwer/새우깡
		java/칸쵸
		java/고래밥
		abcd/사이다		
*/


public class 문자열2_문제09_장바구니삭제_문제 {
	public static void main(String[] args) {
		
		String item = "칸초/새우깡/고래밥/콜라/사이다";
		String id = "qwer/abcd/java";
		
		String cart = "";
		cart += "qwer/고래밥\n";
		cart += "qwer/새우깡\n";
		cart += "abcd/콜라\n";
		cart += "java/칸쵸\n";
		cart += "qwer/칸쵸\n";
		cart += "java/고래밥\n";
		cart += "abcd/사이다";
		
		String[][] input = {
			{"qwer" , "3"}, 
			{"abcd" , "1"}
		};
		
	}
}
