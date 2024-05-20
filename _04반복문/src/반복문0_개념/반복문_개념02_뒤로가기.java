package 반복문0_개념;

import java.util.Scanner;

/*
	# 뒤로가기
		쇼핑몰 메인 메뉴에서 남성의류를 선택 후,
		뒤로가기 버튼을 누르기 전까지 남성의류 페이지를 유지하려 한다.
		
		1. 남성의류
			1) 티셔츠
			2) 바지
			3) 뒤로가기
		2. 여성의류
			1) 가디건
			2) 치마
			3) 뒤로가기
		3. 종료
*/

public class 반복문_개념02_뒤로가기 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			System.out.println("1.남성의류");
			System.out.println("2.여성의류");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int select = scan.nextInt();
			
			if(select == 1) {
				boolean run2 = true;
				while(run2) {
					System.out.println("1)티셔츠");
					System.out.println("2)바지");
					System.out.println("0)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int select2 = scan.nextInt();
					
					if(select2 == 1) {
						System.out.println("티셔츠");
					}else if(select2 == 2) {
						System.out.println("바지");
					}else if(select2 == 0) {
						System.out.println("뒤로가기");
						run2 = false;
					}
				}
			}else if(select == 2) {
				System.out.println("1)가디선");
				System.out.println("2)치마");
				System.out.println("0)뒤로가기");
				
				/*
				 	여성의류도 남성의류와 마찬가지로
		  			뒤로가기를 구현해시오.
				 */
				
			}else if(select == 0) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
		
		scan.close();
		
	}
}
