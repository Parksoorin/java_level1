package 클래스배열4_문제;

import java.util.Scanner;

class Member{
	int number;
	String id;
	String name;
}

class Account{
	String accountNumber;
	String password;
	int money;
	String memberId;
}

public class 클래스배열4_문제01_ATM_문제 {
	public static void main(String[] args) {
		
		String[][] memberData = {
			{"1001", "qwer", "김철수"},
			{"1002", "mmkk11", "이영희"},
			{"1003", "javaking123", "최민수"}			
		};	
		String[][] accountData = {
			{"111111111", "1234","100000", "qwer"},
			{"222222222", "1234","200000", "mmkk11"},
			{"333333333", "1234","300000", "mmkk11"},
			{"444444444", "1234","400000", "javaking123"},
			{"555555555", "1234","500000", "qwer"},
			{"666666666", "1234","600000", "qwer"},
		};
		
		Account[] accountList = new Account[accountData.length];
		Member[] memberList = new Member[memberData.length];
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String menu = "";
			menu += "[0] 종료 \n";
			menu += "[1] 위 data배열들의 값들을 클래스배열에 저장 후 출력 \n";
			menu += "[2] 회원 아이디를 입력받고 계좌별 잔액출력  \n";
			menu += "[3] 222222222 계좌에서 444444444 계좌로 5000원 송금 후 전체출력 \n";
			System.out.println(menu);
			
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			} else if(sel == 1) {
				
			} else if(sel == 2) {
				
			} else if(sel == 3) {
				
			}
		}
		
		scan.close();
		
	}
}
