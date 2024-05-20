package 반복문5_문제;

/*
	[문제]
		1. 손님을 태워 목적지까지 이동하는 게임이다.
		2. 현재 위치는 curPosX = 0, curPosY = 0 이다.
		3. -10 ~ 10 사이의 랜덤 숫자 2개를 
		   desX, dexY 변수에 저장해 목적지로 설정한다.
		   예) desX = -6, desY = 5
		      서쪽으로 6칸 이동, 북쪽으로 5칸 이동하면
		      목적지에 도착한다.
		4. 메뉴는 아래와 같다.
			1) 속도설정 : 1~3까지만 가능
			2) 방향설정 : 동(1) 서(2) 남(3) 북(4)
			3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
		5. 거리 1칸 당 50원씩 추가되어 도착시 요금도 함께 출력한다.
		6. 도착하면 다시 -10 ~ 10 사이의 랜덤 목적지가 설정된다.
 */

public class 반복문5_문제02_카카오택시_문제 {
	public static void main(String[] args) {
		
		// current position (현재위치)
		int curPosY = 0;
		int curPosX = 0;
		
		// destination (목적지)
		int desY = 0;
		int desX = 0;
		
		// 속도
		int speed = 0;
		
		// 방향
		int dir = 0;
		
		// 요금
		int total = 0;
		
	}
}
