package 배열0_개념;

import java.util.Scanner;

public class 배열_개념13_UI개선 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int arr[] = { 10, 32, 11, 56, 7 };
		
		int player = 2;
		
		while (true) {
			for(int i=0; i<100; i++) {
				System.out.println();
			}

			System.out.println("[숫자 전부 지우기]");
			for (int i = 0; i < arr.length; i++) {
				System.out.printf("[%2d]", arr[i]);
			}
			System.out.println();
			
			// 게임 종료
			boolean run = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					run = true;
					break;
				}
			}
			if(run == false) {
				break;
			}
			
			for (int i = 0; i < arr.length; i++) {
				if (i == player) {
					System.out.print("[ ↑]");
				} else {
					System.out.print("[  ]");
				}
			}
			System.out.println();
			
			System.out.println("1) left 2) right 3)choice");
			int select = scan.nextInt();
			
			if (select == 1 && player > 0) {
				player -= 1;
			} else if (select == 2 && player < arr.length - 1) {
				player += 1;
			} else if (select == 3) {
				arr[player] = 0;
				
			}
		}
		
		scan.close();
		
	}
}
