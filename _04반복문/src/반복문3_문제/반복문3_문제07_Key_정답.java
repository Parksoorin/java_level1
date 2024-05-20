package 반복문3_문제;

import java.util.Scanner;

/*
	[문제]
		1. -1이 나올때까지 일련의 수를 입력받는다.
		2. 위 수 중 key 값이 몇 번째에 포함되어 있는가를 출력하는 프로그램을 작성하시오.
		3. 단, key가 여러개 포함되어 있을 경우 앞에 나타난 것의 위치를 출력하시오.
		4. key가 일련의 수 안에 없는 경우, "not found"를 출력하시오.
		
	[예시]
		key값 입력 : 99
		
		입력 : 10
		입력 : 99
		입력 : 20
		입력 : 99
		입력 : 30
		입력 : 99
		입력 : 10
		입력 : -1
		
		결과 : key값 99가 첫 번째 나타난 것은 2번째 이다.
*/

public class 반복문3_문제07_Key_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("key 값 입력 : ");
		int key = scan.nextInt();
		
		int index = 0;
		
		int i = 1;
		while(true) {
			
			System.out.print("입력 : ");
			int num = scan.nextInt();
			
			if(num == -1) {
				break;
			}
			
			if(num == key && index == 0) {
				index = i;
			}
			
			i += 1;
		}
		
		if(index > 0) {
			System.out.printf("key값 %d가 첫 번째 나타난 것은 %d번째 이다.", key, index);
		} else {
			System.out.println("not found");
		}
		
		scan.close();
		
	}
}








