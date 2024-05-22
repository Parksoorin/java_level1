package 배열8_문제;

import java.util.Random;
import java.util.Scanner;

/*
	[문제]
		구글에서 "틱택토" 키워드 검색 후, 게임을 해본 후
		다음 조건에 맞는 게임을 만들어보시오.
		
		p1, p2 플레이어가 번갈아가면서 플레이를 한다.
		먼저 한 줄을 완성하면 승리한다.
		단, p2는 com으로 대체한다. (즉, 랜덤으로 플레이)
*/

public class 배열8_문제01_틱택토_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] tic = new int[9];
		
		boolean turn = true;	// 차례 p1(true), p2(false)
		int win = 0;			// p1승리(1), p2승리(2), 비겼다(3)
		
		// 게임시작
		while(true) {
			for(int i=0; i<100; i++) {
				System.out.println();
			}
			
			// 화면 출력
			for(int i=0; i<tic.length; i++) {
				if(tic[i] == 0) {
					System.out.print("[ ]");
				} else if(tic[i] == 1) {
					System.out.print("[O]");
				} else if(tic[i] == 2) {
					System.out.print("[X]");
				}
//				System.out.print(tic[i] + " ");
				if(i % 3 == 2) {
					System.out.println();
				}
			}
			System.out.println();
			
			// 게임 종료
			if(win == 1) {
				System.out.println("[p1]승리!");
				break;
			}
			if(win == 2) {
				System.out.println("[p2]승리!");
				break;
			}
			if(win == 3) {
				System.out.println("비겼다!");
				break;
			}
			
			
			if(turn == true) {
				// p1차례
				System.out.print("[p1차례] (0 ~ 8) : ");
				int p1 = scan.nextInt();
				
				if(tic[p1] == 0) {
					tic[p1] = 1;
					turn = false;
				}
			} else {
				// p2차례
				System.out.print("[p2차례] (0 ~ 8) : ");
				int p2 = ran.nextInt(tic.length);
				System.out.println(p2);
				
				if(tic[p2] == 0) {
					tic[p2] = 2;
					turn = true;
				}
				
				// 2초 멈추기
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			// 게임종료 조건 - 가로
			/*
				tic = [
					1, 1, 1, 
					0, 0, 0, 
					0, 0, 0]
			 */
			for(int i=0; i<tic.length; i+=3) {
				if(tic[i] == 1 && tic[i + 1] == 1 && tic[i + 2] == 1) {
					win = 1;
				}
				if(tic[i] == 2 && tic[i + 1] == 2 && tic[i + 2] == 2) {
					win = 2;
				}
			}
			
			// 게임종료 조건 - 세로
			/*
				tic = [
					1, 0, 0, 
					1, 0, 0, 
					1, 0, 0]
			 */
			for(int i=0; i<3; i++) {
				if(tic[i] == 1 && tic[i + 3] == 1 && tic[i + 6] == 1) {
					win = 1;
				}
				if(tic[i] == 2 && tic[i + 3] == 2 && tic[i + 6] == 2) {
					win = 2;
				}
			}
			
			// 게임종료 조건 - 대각선 \
			if(tic[0] == 1 && tic[4] == 1 && tic[8] == 1) {
				win = 1;
			}
			if(tic[0] == 2 && tic[4] == 2 && tic[8] == 2) {
				win = 2;
			}
			// 게임종료 조건 - 대각선 /
			if(tic[2] == 1 && tic[4] == 1 && tic[6] == 1) {
				win = 1;
			}
			if(tic[2] == 2 && tic[4] == 2 && tic[6] == 2) {
				win = 2;
			}
			
			// 게임종료 조건 - 비김
			int count = 0;
			for(int i=0; i<tic.length; i++) {
				if(tic[i] != 0) {
					count += 1;
				}
			}
			if(win == 0 && count == tic.length) {
				win = 3;
			}
		}
		
	}
}







