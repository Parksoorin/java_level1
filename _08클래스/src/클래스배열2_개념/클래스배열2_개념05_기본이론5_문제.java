package 클래스배열2_개념;

import java.util.Scanner;

/*
class Member{
	int number; 
	String id; 
	String pw; 
	String name;
	int score;
}
*/

public class 클래스배열2_개념05_기본이론5_문제 {
	public static void main(String[] args) {
		
		/*
			[문제] 클래스 배열을 이용해서 CRUD를 구현하시오.
		 */
			
		int max = 100;
		Member[] memberList = new Member[max];
		
		int size = 0;
		int num = 1000; // 번호를 1000부터 시작	
		Scanner scan = new Scanner(System.in);	
		
		while(true) {

			System.out.println("[1]가입 [2]탈퇴 [3]수정 [4]검색 [5]전체출력 [0]종료");
			
			int sel = scan.nextInt();
			if(sel == 1) {
				Member member = new Member(); 
				member.number = num;
				
				num += 1;
				
				System.out.println("[가입]아이디 입력 : ");
				member.id = scan.next();
				System.out.println("[가입]비밀번호 입력 : ");
				member.pw = scan.next();
				System.out.println("[가입]이름 입력 : ");
				member.name = scan.next();
				System.out.println("[가입]점수 입력 : ");
				member.score = scan.nextInt();
				memberList[size] = member;
				size += 1;
			}
			else if(sel == 2) {
				System.out.println("[탈퇴] 아이디 입력 : ");
				String id = scan.next();
				
				int index = -1;
				for(int i = 0; i < size; i++) {
					if(memberList[i].id.equals(id)) {
						index = i;
						break;
					}
				}
				
				if(index == -1) {
					System.out.println("아이디를 확인해주세요.");
				}else {
					for(int i = index; i < size-1; i++) {
						memberList[i] = memberList[i + 1];
					}
					memberList[size - 1] = null;
					size -= 1;
				}
			}
			else if(sel == 3) {
				/* 직접 구현해보세요. */
			}
			else if(sel == 4) {
				/* 직접 구현해보세요. */
			}
			else if(sel == 5) {
				for(int i = 0; i < size; i++) {
					System.out.print(memberList[i].number + " " + memberList[i].id + " ");
					System.out.println(memberList[i].pw + " " + memberList[i].name + " " + memberList[i].score);
				}
			}else if(sel == 0) {
				break;
			}
		}	
		
		scan.close();		
	}
}
