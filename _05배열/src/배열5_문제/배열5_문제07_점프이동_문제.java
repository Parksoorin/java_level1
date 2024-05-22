package 배열5_문제;

/*
	[문제]
		map배열은 게임의 지도를 의미하고, 
		그 값은 추가로 이동할 수 있는 거리를 의미한다.
		
		player 변수는 map배열의 현재 위치를 의미한다.
		즉, player는 현재 map의 0번째 인덱스에 있다.
		
		주사위(1 ~ 3)를 랜덤으로 저장해, player의 위치를 출력하시오.
		
		예) 주사위(1)
			player는 1칸 이동한다.
			map[1]은 3이므로 추가로 3칸을 더 이동한다.
			즉 player의 위치는 4가 된다.
		예) 주사위(2)
			player는 2칸 이동한다.
			map[2]는 0이므로 추가이동이 없다.
			즉 player의 위치는 2가 된다.
		예) 주사위(3)
			player는 3칸 이동한다.
			map[3]은 3이므로 추가로 3칸을 더 이동한다.
			map[6]은 -1이므로 뒤로 1칸을 더 이동한다.
			즉 player의 위치는 5가 된다.
*/

public class 배열5_문제07_점프이동_문제 {
	public static void main(String[] args) {
		
		int[] map = {0,3,0,3,0,0,-1,1,0,0};

		int player = 0;
		
	}
}
