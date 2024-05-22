package 메서드클래스배열6_프로젝트1_멤버1;

import java.util.Scanner;

public class MemberDAO {
	
	Scanner scan;
	int max;
	int memberCount;
	Member[] memberList;
	
	void init(int size) {
		scan = new Scanner(System.in);
		max = size;
		memberList = new Member[max];
		memberCount = 0;
	}
	
	int checkMember(String id) {
		int check = -1;
		for(int i=0; i<memberCount; i++) {
			if(id.equals(memberList[i].id)) {
				check = i;
				break;
			}
		}
		return check;
	}
	
	int checkMember(String id, String pw) {
		int check = -1;
		for(int i=0; i<memberCount; i++) {
			if(id.equals(memberList[i].id) && pw.equals(memberList[i].pw)) {
				check = i;
				break;
			}
		}
		return check;
	}
	
	void join() {
		System.out.print("[추가]아이디 입력 : ");
		String id = scan.next();
		
		if(checkMember(id) != -1) {
			System.out.println("[아이디가 중복됩니다.]");
		} else {
			System.out.print("[추가]비밀번호 입력 : ");
			String pw = scan.next();
			System.out.print("[추가]이름 입력 : ");
			String name = scan.next();
			
			Member member = new Member();
			member.id = id;
			member.pw = pw;
			member.name = name;
			
			memberList[memberCount] = member;
			memberCount += 1;
			System.out.println("[추가 성공!]");
		}
	}
	
	void delete() {
		System.out.print("[삭제]아이디 입력 : ");
		String id = scan.next();
		
		int index = checkMember(id); 
		if(index != -1) {
			for(int i=index; i<memberCount - 1; i++) {
				memberList[i] = memberList[i + 1];
			}
			memberCount -= 1;
			System.out.println("[삭제 성공!]");
		} else {
			System.out.println("[없는 아이디 입니다.]");
		}
	}
	
	void update() {
		System.out.print("[수정]아이디 입력 : ");
		String id = scan.next();
		System.out.print("[수정]비밀번호 입력 : ");
		String pw = scan.next();
		
		int index = checkMember(id, pw);
		
		if(index != -1) {
			System.out.print("[수정]이름 입력 : ");
			String name = scan.next();
			
			memberList[index].name = name;
			System.out.println("[수정 완료!]");
		} else {
			System.out.println("[아이디와 비밀번호를 확인해주세요.]");
		}
	}
	
	void printAll() {
		for(int i=0; i<memberCount; i++) {
			memberList[i].printMember();
		}
	}
	
}
