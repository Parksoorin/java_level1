package 배열3_문제;

import java.util.Scanner;

/*
	[문제]
		아래 그림을 참고해 배열을 생성하한다.
		2인용 게임으로 서로 번갈아가며 주사위를 던진다.(입력받거나 랜덤으로)
		주사위의 숫자만큼 이동하여, 3바퀴를 먼저 돌면 
		승리하는 게임이다.
		단, 이동할 때 외곽으로만 이동할 수 있다.
	
		p1 = 0[0바퀴]
		p2 = 0[0바퀴]
		*    □    □    □    □ 
		□    ■    ■    ■    □ 
		□    ■    ■    ■    □ 
		□    ■    ■    ■    □ 
		□    □    □    □    □ 
		
		[p1]차례 주사위 입력(1 ~ 6) : 3
		p1 = 3[0바퀴]
		p2 = 0[0바퀴]
		홋    □    □    솟    □ 
		□    ■    ■    ■    □ 
		□    ■    ■    ■    □ 
		□    ■    ■    ■    □ 
		□    □    □    □    □ 
		
		[p2]차례 주사위 입력(1 ~ 6) : 5
		p1 = 3[0바퀴]
		p2 = 5[0바퀴]
		□    □    □    솟    □ 
		□    ■    ■    ■    홋 
		□    ■    ■    ■    □ 
		□    ■    ■    ■    □ 
		□    □    □    □    □ 
		
		[p1]차례 주사위 입력(1 ~ 6) : 2
		p1 = 5[0바퀴]
		p2 = 5[0바퀴]
		□    □    □    □    □ 
		□    ■    ■    ■    * 
		□    ■    ■    ■    □ 
		□    ■    ■    ■    □ 
		□    □    □    □    □ 
		
		[p2]차례 주사위 입력(1 ~ 6) : 3
		p1 = 5[0바퀴]
		p2 = 8[0바퀴]
		□    □    □    □    □ 
		□    ■    ■    ■    솟 
		□    ■    ■    ■    □ 
		□    ■    ■    ■    □ 
		□    □    □    □    홋
*/

public class 배열3_문제06_모두의마블_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] map = {
			{ 1,  2,  3,  4, 5},
			{16, 17, 17, 17, 6},
			{15, 17, 17, 17, 7},
			{14, 17, 17, 17, 8},
			{13, 12, 11, 10, 9}
		};
		
		int p1 = 1;		// 솟
		int p2 = 1;		// 홋
		
		int win1 = 0;
		int win2 = 0;
		
		boolean turn = true;
		while(true) {
			System.out.println("p1 = " + p1 + "[" + win1 + "바퀴]");
			System.out.println("p2 = " + p2 + "[" + win2 + "바퀴]");
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(map[i][j] == 17) {
						System.out.print(" ■ ");
					} else {
						if(map[i][j] == p1 && map[i][j] == p2) {
							System.out.print(" * ");
						} else if(map[i][j] == p1) {
							System.out.print(" 솟 ");
						} else if(map[i][j] == p2) {
							System.out.print(" 홋 ");
						} else {
							System.out.print(" □ ");
						}
					}
				}
				System.out.println();
			}
			System.out.println();
			
			if(win1 == 3) {
				System.out.print("[p1]승리");
				break;
			}
			if(win2 == 3) {
				System.out.println("[p2]승리");
				break;
			}
			
			if(turn) {
				System.out.print("[p1]차례 주사위 입력(1 ~ 6) : ");
				int move = scan.nextInt();
				p1 += move;
				if(p1 > 16) {
					win1 += 1;
					p1 %= 16;
				}
			} else {
				System.out.print("[p2]차례 주사위 입력(1 ~ 6) : ");
				int move = scan.nextInt();
				p2 += move;
				if(p2 > 16) {
					win2 += 1;
					p2 %= 16;
				}
			}
			
			turn = !turn;
		}
		
	}
}
