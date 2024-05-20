package 반복문5_문제;

import java.util.Scanner;

/*
	[문제]
		1. 
			[뒤로가기]를 활용해 단계별로 기능을 구현한다.
			[회원가입]은 추후 배열에서 가능하다.
		2.
			메인화면 기능		: [1.로그인 0.종료]
			1번 로그인 선택	: [1.입금 2.출금 3.이체 4.조회 5.정보수정 0.로그아웃]
			2번 종료 선택		: [종료]
		3. 추가기능
			1) 5. 정보수정 선택	: 비밀번호를 바꿀 수 있다.
			2) 0. 로그아웃 선택	: 뒤로 돌아가서 [1.로그인 0.종료] 화면이 다시 나온다.
			3) 로그인 3번 실패시 강제 종료한다.
*/

public class 반복문5_문제03_ATM종합_정답 {
	public static void main(String[] args) {
		
/*
	[풀이]
		1. 메뉴 출력
			[1.로그인 0.종료]
		2. 메뉴 선택
		3. 1번 메뉴 선택
			1. 로그인을 위한 계좌번호와 비밀번호 입력받기
			2. 로그인에 성공
				(1) 입력받은 정보 == 1번 회원
					log = 1111
				(2) 입력받은 정보 == 2번 회원
					log = 2222
				(3) 메뉴 출력
					[1.입금 2.출금 3.이체 4.조회 5.정보수정 0.로그아웃]
					
					메뉴 입력받기
					1) 입금
						입금할 금액 입력받기
						log == 1번 회원	:1번 회원계좌잔액 증가
						log == 2번 회원	:2번 회원계좌잔액 증가
					2) 출금
						출금할 금액 입력받기
						log == 1번 회원	:1번 회원계좌잔액 감소
						log == 2번 회원	:2번 회원계좌잔액 감소
					3) 이체
						이체할 계좌번호 입력받기
						log == 1번 회원
							계좌번호 일치
								입력받은 계좌번호 == 2번 회원
								
								이체할 금액 입력받기
								입력받은 금액 <= 1번회원의 계좌잔액
									1번회원의 계좌잔액 -= 입력받은 금액
									2번회원의 계좌잔액 += 입력받은 금액
								입력받은 금액 > 1번회원의 계좌잔액
									[메세지] 계좌잔액을 확인해주세요.
							계좌번호 불일치
								[메세지] 계좌번호를 확인해주세요.
						log == 2번 회원
							계좌번호 일치
								입력받은 계좌번호 == 1번 회원
								
								이체할 금액 입력받기
								입력받은 금액 <= 2번회원의 계좌잔액
									2번회원의 계좌잔액 -= 입력받은 금액
									1번회원의 계좌잔액 += 입력받은 금액
								입력받은 금액 > 2번회원의 계좌잔액
									[메세지] 계좌잔액을 확인해주세요.
							계좌번호 불일치
								[메세지] 계좌번호를 확인해주세요.
					4) 조회
					
					5) 정보수정
					
					0) 로그아웃
						log = -1
			4. 로그인에 실패
				[메세지]계좌번호와 비밀번호를 확인해주세요.
		4. 0번 메뉴 선택
			[메세지]프로그램을 종료합니다.
 */
		
		Scanner scan = new Scanner(System.in);	
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;		
		
		int log = -1; // -1(로그아웃), 1111(dbAcc1로그인), 2222(dbAcc2로그인)		
		
		int failCount = 0;	// 로그인 실패 횟수
		
		while(true) {
			
			if(failCount == 3) {
				System.out.println("[메세지]로그인 3회 실패");
				break;
			}
			
			System.out.println("[1.로그인][0.종료]");
			
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.print("[로그인]계좌번호 입력 : ");
				int inputAcc = scan.nextInt();
				
				System.out.print("[로그인]비밀번호 입력 : ");
				int inputPw = scan.nextInt();
				
				if(inputAcc == dbAcc1 && inputPw == dbPw1) {
					log = 1111;
				} else if(inputAcc == dbAcc2 && inputPw == dbPw2) {
					log = 2222;
				} else {
					System.out.println("[메세지]계좌번호와 비밀번호를 확인해주세요.");
					failCount += 1;
				}
				
				if(log != -1) {
					boolean run2 = true;
					while(run2) {
						System.out.println("[1.입금 2.출금 3.이체 4.조회 5.정보수정 0.로그아웃]");
						
						int choice = scan.nextInt();
						
						if(choice == 1) {
							System.out.println("=== [입금] ===");
							System.out.print("금액 입력 : ");
							int inputMoney = scan.nextInt();
							
							if(inputAcc == dbAcc1) {
								dbMoney1 += inputMoney;
							} else if(inputAcc == dbAcc2) {
								dbMoney2 += inputMoney;
							}
								
							System.out.println("[메세지]입금을 완료하였습니다.");
						} else if(choice == 2) {
							System.out.println("=== [출금] ===");
							System.out.print("금액 입력 : ");
							int inputMoney = scan.nextInt();
							
							if(inputAcc == dbAcc1) {
								if(inputMoney <= dbMoney1) {
									dbMoney1 -= inputMoney;
									System.out.println("[메세지]출금을 완료하였습니다.");
								} else {
									System.out.println("[메세지]계좌잔액을 확인해주세요.");
								}
							} else if(inputAcc == dbAcc2) {
								if(inputMoney <= dbMoney2) {
									dbMoney2 -= inputMoney;
									System.out.println("[메세지]출금을 완료하였습니다.");
								} else {
									System.out.println("[메세지]계좌잔액을 확인해주세요.");
								}
							}
						} else if(choice == 3) {
							System.out.println("=== [이체] ===");
							System.out.print("계좌번호 입력 : ");
							inputAcc = scan.nextInt();
							
							if(log == dbAcc1 && inputAcc == dbAcc2) {
								System.out.print("금액 입력 : ");
								int inputMoney = scan.nextInt();
								
								if(inputMoney <= dbAcc1) {
									dbMoney1 -= inputMoney;
									dbMoney2 += inputMoney;
									System.out.println("[메세지]이체를 완료하였습니다.");
								} else {
									System.out.println("[메세지]계좌잔액을 확인해주세요.");
								}
							} else if(log == dbAcc2 && inputAcc == dbAcc1) {
								System.out.print("금액 입력 : ");
								int inputMoney = scan.nextInt();
								
								if(inputMoney <= dbAcc2) {
									dbMoney2 -= inputMoney;
									dbMoney1 += inputMoney;
									System.out.println("[메세지]이체를 완료하였습니다.");
								} else {
									System.out.println("[메세지]계좌잔액을 확인해주세요.");
								}
							} else {
								System.out.println("[메세지]계좌번호를 확인해주세요.");
							}
						} else if(choice == 4) {
							if(log == 1111) {
								System.out.println("현재 계좌의 잔액은 " + dbMoney1 + "원 입니다.");
							} else if(log == 2222) {
								System.out.println("현재 계좌의 잔액은 " + dbMoney2 + "원 입니다.");
							}
						} else if(choice == 5) {
							System.out.println("=== [정보 수정] ===");
							System.out.print("변경할 비밀번호 입력 : ");
							inputPw = scan.nextInt();
							
							if(log == dbAcc1) {
								dbPw1 = inputPw;
							} else if(log == dbAcc2) {
								dbPw2 = inputPw;
							}
							System.out.println("[메세지]비밀번호가 변경되었습니다.");
						} else if(choice == 0) {
							log = -1;
							System.out.println("[메세지]로그아웃 되었습니다.");
							
							run2 = false;
						}
					}
				}
			}else if(sel == 0) {
				System.out.println("[메세지]프로그램을 종료합니다.");
				break;
			}
		}
		
		scan.close();
		
	}
}
