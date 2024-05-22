package 메서드클래스배열4_개념;

import java.util.Scanner;

class Member{
	String id;
	String name;
	
	void printMember() {
		System.out.println(id + " : " + name);
	}
}

public class 메서드클래스배열4_개념05_회원관리 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Member[] memberList = new Member[100];
		
		int memberCount = 0;
		
		while(true) {
			System.out.println("[1]추가 [2]삭제 [3]출력 [0]종료");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				Member member = new Member();
				
				System.out.print("아이디 입력 : ");
				member.id = scan.next();
				
				System.out.print("이름 입력 : ");
				member.name = scan.next();
				
				memberList[memberCount] = member;
				memberCount += 1;
			} else if(sel == 2) {
				System.out.print("아이디 입력 : ");
				String id = scan.next();
				
				int index = -1;
				for(int i=0; i<memberCount; i++) {
					if(memberList[i].id.equals(id)) {
						index = i;
						break;
					}
				}
				if(index == -1) {
					System.out.println("아이디 입력 오류");
				} else {
					for(int i=index; i<memberCount - 1; i++) {
						memberList[i] = memberList[i + 1];
					}
					memberCount -= 1;
				}
				
			} else if(sel == 3) {
				for(int i=0; i<memberCount; i++) {
					memberList[i].printMember();
				}
			} else if(sel == 0) {
				break;
			} 
		}
		
		scan.close();
		
	}
}