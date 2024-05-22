package 메서드정리3_문제;

import java.util.Scanner;

/*
class MemberDAO {
	
	int lastNumber = 10001;
	int maxSize = 10000;
	// [0]번호 [1]아이디 [2]비밀번호 [3]이름
	String[][] memberList = new String[maxSize][4];
	int memberCount = 0;	
	
	boolean checkId(String id) {
		boolean check = false;
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i][1].equals(id)) {
				check = true;
				break;
			}
		}	
		return check;
	}
	
	void insertMember(String id , String pw , String name) {
		memberList[memberCount][0] = lastNumber + "";
		memberList[memberCount][1] = id;
		memberList[memberCount][2] = pw;
		memberList[memberCount][3] = name;
		lastNumber += 1;
		memberCount += 1;
	}
	
	boolean checkLogin(String id , String pw) {
		boolean check = false;
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i][1].equals(id) && memberList[i][2].equals(pw)) {
				check = true;
				break;
			}
		}	
		return check;
	}
}

class Controller {
	Scanner scan = new Scanner(System.in);
	MemberDAO memberDAO = null;
	String log = "";
	
	void init(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	void run() {		
		while(true) {
			System.out.println("=== [메인화면] ===");
			System.out.println("[1]가입 [2]로그인 [0]종료");
			
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("아이디를 입력하세요 : ");
				String id = scan.next();
				boolean check = memberDAO.checkId(id);
				if(check == true) {
					System.out.println("존재하는 아이디입니다.");
				}else {
					System.out.println("사용할수있는 아이디입니다.");
					System.out.println("비밀번호를 입력하세요 : ");
					String pw = scan.next();
					System.out.println("이름을 입력하세요 : ");
					String name = scan.next();
					memberDAO.insertMember(id, pw, name);
				}
			}else if(sel == 2) {
				System.out.println("아이디를 입력하세요 : ");
				String id = scan.next();
				System.out.println("비밀번호를 입력하세요 : ");
				String pw = scan.next();
				boolean check = memberDAO.checkLogin(id, pw);
				if(check == true) {
					log = id;
					System.out.println("로그인성공");					
					while(true) {
						System.out.println("[" + log + "님 로그인중]");
						System.out.println("[1] 로그아웃 [2] 정보수정 [3] 정보확인 [4] 회원탈퇴");
						int sel2 = scan.nextInt();
						if(sel2 == 1) {
							System.out.println("로그아웃합니다.");
							log = "";
							break;
						} else if(sel2 == 2) {
							// 직접 구현해보세요.
						} else if(sel2 == 3) {
							// 직접 구현해보세요.
						} else if(sel2 == 4) {
							// 직접 구현해보세요.
						}
					}
				}else {
					System.out.println("로그인실패");
				}
				
				
			}else if(sel == 0) {
				break;
			}
		}
	}
}
*/

public class 메서드정리3_회원가입_문제 {
	public static void main(String[] args) {
		
		Controller controller = new Controller();
		MemberDAO memberDAO = new MemberDAO();
		
		controller.init(memberDAO);
		controller.run();
		
	}
}
