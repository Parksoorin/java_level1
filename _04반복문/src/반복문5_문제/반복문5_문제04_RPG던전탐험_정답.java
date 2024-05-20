package 반복문5_문제;

import java.util.Scanner;

/*
	[문제]
		플레이어는 무기, 방어구, 체력, 돈, 운 등의 데이터가 있다.(추가 가능)
		플레이어와 적은 1명으로하고 1명 이상은 추후 배열에서 가능하다.
		
		1. 메인 메뉴
			- [1.여관] [2.대장간] [3.던전] [0.종료]
		2. [1.여관]
			- 여관은 소지금을 소모해 체력과 스킬회복 또는 아이템을 구입한다.
			- [1.숙박(체력,스킬회복)] [2.물약구입] [0.뒤로가기]
		3. [2.대장간]
			- 대장간은 소지금을 소모해 랜덤으로 무기와 방어구 업그레이드 시켜준다.
			- [1.무기업] [2.방어구입] [0.뒤로가기]
		4. [3.던전]
			- 던전은 몬스터를 만나 전투를 한다.
			- [1.공격] [2.스킬] [3.물약먹기] [0.뒤로가기]
			- 스킬은 2번 공격을 한다.
			- 물약을 먹으면 체력이 회복된다.
			- 승리하면 돈을 획득한다.
		* [주의] 반드시 뒤로가기기를 이용해서 푸시오.
*/

public class 반복문5_문제04_RPG던전탐험_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("[드래곤 던전 게임]");
			System.out.println("[1.여관] [2.대장간] [3.던전] [0.종료]");
			
			int sel = scan.nextInt();		
			
			if(sel == 1) {
				boolean run2 = true;
				while(run2) {
					System.out.println("[드래곤 여관입니다]");
					System.out.println("[1.숙박(체력,스킬회복)][2.물약구입][0.뒤로가기]");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						
					}else if(sel2 == 2) {
						
					}else if(sel2 == 0) {
						System.out.println("[뒤로가기]");
						run2 = false;
					}else {
						System.out.println("오류");
					}					
				}
			} else if(sel == 2) {
				boolean run2 = true;
				while(run2) {
					System.out.println("[드래곤 대장관 입니다]");
					System.out.println("[1.무기업][2.방어구업][0.뒤로가기]");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						
					}else if(sel2 == 2) {
						
					}else if(sel2 == 0) {
						System.out.println("[뒤로가기]");
						run2 = false;
					}else {
						System.out.println("오류");
					}
					
				}
			} else if(sel == 3) {
				boolean run2 = true;
				while(run2) {
					System.out.println("[드래곤 던전 입니다]");
					System.out.println("[몬스터 설정]");
					System.out.println("[1.공격][2.스킬][3.물약먹기][0.뒤로가기]");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						
					}else if(sel2 == 2) {
						
					}else if(sel2 == 3) {
						
					}else if(sel2 == 0) {
						System.out.println("[뒤로가기]");
						run2 = false;
					}else {
						System.out.println("오류");
					}					
				}
			} else if(sel == 0) {
				System.out.println("[종료]");
				run = false;
			} else {
				System.out.println("오류");
			}
		}	
		
		scan.close();
		
	}	
}