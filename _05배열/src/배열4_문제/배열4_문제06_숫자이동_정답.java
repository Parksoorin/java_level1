package 배열4_문제;

import java.util.Scanner;

/*
	[문제]	
		1. game배열에 숫자 2는 플레이어이다.
		2. 플레이어는 좌(1),우(2)로 이동이 가능하다.
		3. 단, 벽(숫자1)을 만나면 이동할 수 없다.
		4. 벽을 만나면 숫자9을 입력해 벽을 깰 수 있다.
		5. 좌, 우 끝에 벽을 만나면 더 이상 움직일 수 없다.
*/

public class 배열4_문제06_숫자이동_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 1, 0, 1, 2, 0, 0, 1, 0};
		
		int road = 0;
		int wall = 1;
		int player = 2;
		int index = 4;
		
		while(true) {
			for(int i=0; i<game.length; i++) {
				if(game[i] == wall) {
					System.out.print("벽");
				} else if(game[i] == road){
					System.out.print("__");
				} else if(game[i] == player) {
					System.out.print("옷");
				}
			}
			System.out.println();
			
			System.out.println("게임종료(0)");
			System.out.print("좌(1), 우(2) 입력 : ");
			int move = scan.nextInt();
			
			if(move == 1) {
				if(index - 1 >= 0) {
					if(game[index - 1] == wall) {
						System.out.println("벽을 부수겠습니까? (숫자9 입력) : ");
						int punch = scan.nextInt();
						
						if(punch == 9) {
							game[index] = road;
							index -= 1;
							game[index] = player;
						}
					} else {
						game[index] = road;
						index -= 1;
						game[index] = player;
					}
				} else {
					System.out.println("더 이상 이동할 수 없습니다.");
				}
			} else if(move == 2) {
				if(index + 1 < game.length) {
					if(game[index + 1] == wall) {
						System.out.println("벽을 부수겠습니까? (숫자9 입력) : ");
						int punch = scan.nextInt();
						
						if(punch == 9) {
							game[index] = road;
							index += 1;
							game[index] = player;
						} 
					} else {
						game[index] = road;
						index += 1;
						game[index] = player;
					}
				} else {
					System.out.println("더 이상 이동할 수 없습니다.");
				}
			} else if(move == 0) {
				break;
			}
			
		}
		
		scan.close();
	}
}
