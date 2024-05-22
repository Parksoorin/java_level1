package 배열0_개념;

import java.util.ArrayList;
import java.util.Scanner;

public class 배열_개념15_어레이리스트컨트롤러 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();

		while(true) {
			System.out.println(numberList);
			System.out.println();
			
			System.out.println("[컨트롤러]");
			System.out.println("[1] 추가 [2] 삭제 [3] 검색 [4] 출력 [5] 수정 [0] 종료");
			
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) {
				System.out.print("[추가]값 입력 : ");
				int value = scan.nextInt();
				
				// 중복검사
				boolean check = false;
				for(int i=0; i<numberList.size(); i++) {
					if(value == numberList.get(i)) {
						check = true;
						break;
					}
				}
				
				if(check == false) {
					numberList.add(value);
				} else {
					System.out.println("중복되는 값입니다.");
				}
			}else if(sel == 2) {
				System.out.print("[삭제]값 입력 : ");
				int value = scan.nextInt();
				
				// 값 유효성 검사
				int check = -1;
				for(int i=0; i<numberList.size(); i++) {
					if(value == numberList.get(i)) {
						check = i;
						break;
					}
				}
				
				if(check == -1) {
					System.out.println("삭제할 수 없는 값입니다.");
				} else {
					numberList.remove(check);
				}
				
			}else if(sel == 3) {
				System.out.print("[검색]값 입력 : ");
				int value = scan.nextInt();
				
				// 값 유효성 검사
				int check = -1;
				for(int i=0; i<numberList.size(); i++) {
					if(value == numberList.get(i)) {
						check = i;
						break;
					}
				}
				
				if(check == -1) {
					System.out.println("값 입력 오류입니다.");
				} else {
					System.out.println("입력하신 값은 " + check + "번째 위치하고 있습니다.");
				}
				
			}else if(sel == 4) {
				for(int i=0; i<numberList.size(); i++) {
					System.out.println(numberList.get(i) + " ");
				}
			}else if(sel == 5) {
				System.out.print("[수정]값 입력 : ");
				int value = scan.nextInt();
				
				// 값 유효성 검사
				int check = -1;
				for(int i=0; i<numberList.size(); i++) {
					if(value == numberList.get(i)) {
						check = i;
						break;
					}
				}
				
				if(check == -1) {
					System.out.println("값 입력 오류입니다.");
				} else {
					System.out.print("[수정]변경할 값 입력 : ");
					int newValue = scan.nextInt();
					
					// 중복검사
					boolean result = false;
					for(int i=0; i<numberList.size(); i++) {
						if(numberList.get(i) == newValue) {
							result = true;
							break;
						}
					}
					
					if(result == false) {
						numberList.set(check, newValue);
					} else {
						System.out.println("값이 중복됩니다.");
					}
				}
			}
		}		
		
		scan.close();
		
	}
}
