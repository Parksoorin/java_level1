package 배열1_문제;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_문제07_이차원배열컨트롤러_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//               번호,   id,  pw
		int[] test1 = { 1001, 1234, 1111 };
		int[] test2 = { 1002, 2345, 2222 };
		int[] test3 = { 1003, 3456, 3333 };
		int[] test4 = { 1004, 4567, 4444 };

		int[][] memberList = new int[100][3]; // 최대100명 데이터는3

		int count = 0;
		int lastNumber = 1000;

		memberList[count] = test1;
		lastNumber += 1;
		count += 1;

		memberList[count] = test2;
		lastNumber += 1;
		count += 1;

		memberList[count] = test3;
		lastNumber += 1;
		count += 1;

		memberList[count] = test4;
		lastNumber += 1;
		count += 1;
		
		
		while (true) {
			for(int i=0; i<count; i++) {
				System.out.println(Arrays.toString(memberList[i]));
			}
			
			System.out.println("[회원관리]");
			System.out.println("[1] 추가 [2] 삭제 [3] 수정 [4] 검색 [5] 출력 [0] 종료");

			int sel = scan.nextInt();
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				
				System.out.print("[추가]아이디 입력 : ");
				int id = scan.nextInt();

				// 아이디 중복검사
				int index = -1;
				for (int i = 0; i < count; i++) {
					if(memberList[i][1] == id) {
						index = i;
						break;
					}
				}

				if (index == -1) {
					System.out.print("[추가]비밀번호 입력 : ");
					int pw = scan.nextInt();

					int[] data = new int[3];
					lastNumber += 1;
					data[0] = lastNumber; 
					data[1] = id;
					data[2] = pw;
					memberList[count] = data;

					count += 1;
				} else {
					System.out.println("중복 아이디입니다. ");
				}
			} else if (sel == 2) {
				System.out.print("[삭제]아이디 입력 : ");
				int id = scan.nextInt();

				// 아이디 유효성검사
				int index = -1;
				for (int i = 0; i < count; i++) {
					if(memberList[i][1] == id) {
						index = i;
						break;
					}
				}
				
				if(index == -1) {
					System.out.println("아이디를 확인해주세요.");
				} else {
					for(int i=index; i<count-1; i++) {
						memberList[i] = memberList[i + 1];
//						memberList[i][0] = memberList[i + 1][0];
//						memberList[i][1] = memberList[i + 1][1];
//						memberList[i][2] = memberList[i + 1][2];
					}
					count -= 1;
				}
			} else if (sel == 3) {
				System.out.print("[수정]아이디 입력 : ");
				int id = scan.nextInt();

				// 아이디 유효성검사
				int index = -1;
				for (int i = 0; i < count; i++) {
					if(memberList[i][1] == id) {
						index = i;
						break;
					}
				}
				
				if(index == -1) {
					System.out.println("아이디를 확인해주세요.");
				} else {
					System.out.print("[수정]변경할 비밀번호 입력 : ");
					int newPw = scan.nextInt();
					
					memberList[index][2] = newPw;
				}
			} else if (sel == 4) {
				System.out.print("[검색]아이디 입력 : ");
				int id = scan.nextInt();

				// 아이디 유효성검사
				int index = -1;
				for (int i = 0; i < count; i++) {
					if(memberList[i][1] == id) {
						index = i;
						break;
					}
				}
				
				if(index == -1) {
					System.out.println("아이디를 확인해주세요.");
				} else {
					System.out.println("NO : " + memberList[index][0]);
					System.out.println("ID : " + memberList[index][1]);
					System.out.println("PW : " + memberList[index][2]);
				}
			} else if (sel == 5) {
				for(int i=0; i<count; i++) {
					System.out.printf("No : %d\tID : %d\tPW : %d\n", memberList[i][0], memberList[i][1], memberList[i][2]);
				}
				System.out.println();
			}
		}

		scan.close();
		
	}
}
