package 배열0_개념;

import java.util.Arrays;
import java.util.Scanner;

/*
	[문제]
		ATM 전체 기능 구현
		
		1. 회원가입
			1) acc와 pw를 입력받아 가입한다.
			2) 가입 시 돈 1000원이 부여된다.
			3) acc 중복검사를 진행한다.
		2. 회원탈퇴
			1) 로그인 후에만 이용할 수 있다.
		3. 로그인
			1) 로그아웃 상태에서만 이용할 수 있다.
			2) acc와 pw를 입력받아 로그인한다.
		4. 로그아웃
			1) 로그인 후에만 이용할 수 있다.
		5. 입금
			1) 로그인 후에만 이용할 수 있다.
		6. 이체
			1) 로그인 후에만 이용할 수 있다.
		7. 잔액조회
			1) 로그인 후에만 이용할 수 있다.
*/

public class 배열_개념12_컨트롤러ATM {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int max = 5;
		
		int[] accList = new int[max];
		int[] pwList = new int[max];
		int[] moneyList = new int[max];
		
		int count = 0;
		int log = -1;
		
		while(true) {
			for(int i=0; i<count; i++) {
				System.out.println(accList[i] + ":" + pwList[i] + " (" + moneyList[i] + "원)");
			}
			
			// 로그아웃 상태
			if(log == -1) {
				System.out.println("[로그인 해주세요.]");
			}else {
				System.out.println("[" + log + "]");
			}
			
			System.out.println("[1]회원가입 [2]회원탈퇴 [3]로그인 [4]로그아웃");
			System.out.println("[5]입금 [6]송금 [7]조회 [8]전체회원목록 [0]종료");
			
			System.out.print("메뉴를 선택해주세요 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				// 추가
				if(count == max) {
					System.out.println("더이상 가입할 수 없습니다.");
					// continue;	// while(true)로 강제 이동
				} else {
					System.out.print("[회원가입]계좌번호 입력 : ");
					int acc = scan.nextInt();
					
					// acc 중복검사
					boolean check = false;
					for(int i=0; i<count; i++) {
						if(accList[i] == acc) {
							check = true;
							break;
						}
					}
					
					if(check) {
						System.out.println("계좌번호가 중복됩니다.");
					}else {
						System.out.print("[회원가입]비밀번호 입력 : ");
						int pw = scan.nextInt();
						
						accList[count] = acc;
						pwList[count] = pw;
						moneyList[count] = 1000;
						count += 1;
						
						System.out.println("회원가입을 축하합니다.");
					}
				}
				
				
			}
			else if(sel == 2) {
				if(log == -1) {
					System.out.println("로그인 후 이용할 수 있습니다.");
					// continue;
				} else {
					System.out.print("[회원탈퇴]계좌번호 입력 : ");
					int acc = scan.nextInt();
					System.out.print("[회원탈퇴]비밀번호 입력 : ");
					int pw = scan.nextInt();
					
					int index = -1;
					for(int i=0; i<count; i++) {
						if(accList[i] == acc && pwList[i] == pw) {
							index = i;
							break;
						}
					}
					
					if(index == -1) {
						System.out.println("계좌번호와 비밀번호를 확인해주세요.");
					}else {
						for(int i=index; i<count - 1; i++) {
							accList[i] = accList[i + 1];
							pwList[i] = pwList[i + 1];
							moneyList[i] = moneyList[i + 1];
						}
						
						accList[count - 1] = 0;
						pwList[count - 1] = 0;
						moneyList[count - 1] = 0;
						
						count -= 1;
						log = -1;
						System.out.println("회원탈퇴완료를 완료하였습니다.");
					}
				}
			}
			else if(sel == 3) {
				if(log == -1) {
					System.out.print("[로그인]계좌번호 입력 : ");
					int acc = scan.nextInt();
					System.out.print("[로그인]비밀번호 입력 : ");
					int pw = scan.nextInt();
					
					for(int i=0; i<count; i++) {
						if(accList[i] == acc && pwList[i] == pw) {
							log = acc;
							break;
						}
					}
				}
				
				if(log == -1) {
					System.out.println("계좌번호와 비밀번호를 확인해주세요.");
				}else {
					System.out.println("로그인에 성공했습니다.");
				}
			}
			else if(sel == 4) {
				if(log == -1) {
					System.out.println("로그인 후 이용가능합니다.");
				}else {
					log = -1;
					System.out.println("로그아웃 되었습니다.");
				}
			}
			else if(sel == 5) {
				if(log == -1) {
					System.out.println("로그인 후 이용가능합니다.");
				}else {
					int index = 0;
					for(int i=0; i<count; i++) {
						if(accList[i] == log) {
							index = i;
							break;
						}
					}
					
					System.out.print("[입금]금액을 입력하세요 : ");
					int money = scan.nextInt();
					moneyList[index] += money;
					System.out.println("입금을 완료하였습니다.");
				}
			}
			else if(sel == 6) {
				if(log == -1) {
					System.out.println("로그인 후 이용가능합니다.");
				}else {
					int index = 0;
					for(int i=0; i<count; i++) {
						if(accList[i] == log) {
							index = i;
							break;
						}
					}
					
					System.out.print("[송금]계좌번호를 입력하세요 : ");
					int sendacc = scan.nextInt();
					
					int sendIndex = -1;
					for(int i=0; i<count; i++) {
						if(accList[i] == sendacc) {
							sendIndex = i;
						}
					}
					
					if(sendIndex == -1) {
						System.out.println("계좌번호를 확인해주세요.");
					}else {
						System.out.print("[송금]금액을 입력하세요 : ");
						int money = scan.nextInt();
						
						if(moneyList[index] >= money) {
							moneyList[index] -= money;
							moneyList[sendIndex] += money;
							System.out.println("송금을 완료하였습니다.");
						}else {
							System.out.println("계좌잔액이 부족합니다.");
						}
					}
					
				}
			}
			else if(sel == 7) {
				if(log == -1) {
					System.out.println("로그인 후 이용가능합니다.");
				}else {
					int index = 0;
					for(int i=0; i<count; i++) {
						if(accList[i] == log) {
							index = i;
							break;
						}
					}
					
					System.out.println(log + " : " + moneyList[index]);
				}
			}
			else if(sel == 8) {
				System.out.println(Arrays.toString(accList));
				System.out.println(Arrays.toString(pwList));
				System.out.println(Arrays.toString(moneyList));
			}
			else if(sel == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			
		}
		
		scan.close();
		
	}
}
