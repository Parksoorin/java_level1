package 배열1_문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
	# ArrayList 2차원
		회원관리데이터 
		[1] 번호 [2] 아이디 [3] 비밀번호
		테스트를 위해 아래 기본데이터 4개를 넣고 시작한다.
*/

public class 배열1_문제08_어레이리스트컨트롤러_정답 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	
		
		//               번호,   id,  pw
		int[] test1 = { 1001, 1234, 1111 };
		int[] test2 = { 1002, 2345, 2222 };
		int[] test3 = { 1003, 3456, 3333 };
		int[] test4 = { 1004, 4567, 4444 };
		
		ArrayList<int[]> memberList = new ArrayList<int[]>();	

		int lastNumber = 1000;

		memberList.add(test1);
		lastNumber += 1;
		
		memberList.add(test2);
		lastNumber += 1;
		
		memberList.add(test3);
		lastNumber += 1;
		
		memberList.add(test4);	
		lastNumber += 1;
		
		while(true) {
			for(int i=0; i<memberList.size(); i++) {
				System.out.println(Arrays.toString(memberList.get(i)));
			}
			System.out.println();
			
			System.out.println("[회원관리]");
			System.out.println("[1] 추가 [2] 삭제 [3] 수정 [4] 검색 [5] 출력 [0] 종료");
			
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}
			else if(sel == 1) {
				System.out.print("[추가]아이디 입력 : ");
				int id = scan.nextInt();
				
				// 아이디 중복검사
				int index = -1;
				for(int i = 0; i < memberList.size(); i++) {
					int[] temp = memberList.get(i);
					
					if(id == temp[1]) {
						index = i;
						break;
					}
				}
				
				if(index == -1) {
					System.out.print("[추가]비밀번호를 입력 : ");
					int pw = scan.nextInt();
					
					int[] data = new int[3];
					
					lastNumber += 1;
					data[0] = lastNumber;
					data[1] = id;
					data[2] = pw;
					
					memberList.add(data);
				}else {
					System.out.println("중복아이디입니다. ");
				}	
			}	
			else if(sel == 2) {
				System.out.print("[삭제]아이디 입력 : ");
				int id = scan.nextInt();
				
				// 아이디 유효성검사
				int index = -1;
				for(int i = 0; i < memberList.size(); i++) {
					int[] temp = memberList.get(i);
					
					if(id == temp[1]) {
						index = i;
						break;
					}
				}
				
				if(index == -1) {
					System.out.println("아이디를 확인해주세요.");
				} else {
					memberList.remove(index);
				}
			}
			else if(sel == 3) {
				System.out.print("[수정]아이디 입력 : ");
				int id = scan.nextInt();
				
				// 아이디 유효성검사
				int index = -1;
				for(int i = 0; i < memberList.size(); i++) {
					int[] temp = memberList.get(i);
					
					if(id == temp[1]) {
						index = i;
						break;
					}
				}
				
				if(index == -1) {
					System.out.println("아이디를 확인해주세요.");
				} else {
					System.out.print("[수정]변경할 비밀번호 입력 : ");
					int newPw = scan.nextInt();
					
					int[] data = memberList.get(index);
					data[2] = newPw;
					
//					memberList.set(index, data);
				}
			}
			else if(sel == 4) {
				System.out.print("[검색]아이디 입력 : ");
				int id = scan.nextInt();
				
				// 아이디 유효성검사
				int index = -1;
				for(int i = 0; i < memberList.size(); i++) {
					int[] temp = memberList.get(i);
					
					if(id == temp[1]) {
						index = i;
						break;
					}
				}
				
				if(index == -1) {
					System.out.println("아이디를 확인해주세요.");
				} else {
					int[] data = memberList.get(index);
					
					System.out.println("NO : " + data[0]);
					System.out.println("ID : " + data[1]);
					System.out.println("PW : " + data[2]);
				}
			}
			else if(sel == 5) {
				for(int i=0; i<memberList.size(); i++) {
					int[] temp = memberList.get(i);
					System.out.printf("No : %d\tID : %d\tPW : %d\n", temp[0], temp[1], temp[2]);
				}
				System.out.println();
			}
		}
		
		scan.close();
		
	}
}
