package 문자열1_개념;

import java.util.Scanner;

public class 문자열1_개념09_문자열입력 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력1 : ");		
		
		// scan.next ==> space 인식불가
		String data = scan.next();  
		
		// next 뒤에 nextLine 을사용할경우 enter 값을 저장할 nextLine을 한번 더 적어준다.
		scan.nextLine(); 
		
		System.out.println(data);       		
		
		System.out.print("입력2 : ");	
		//scan.nextLine ==> space 인식
		String data2 = scan.nextLine();
		
		System.out.println(data2);
		
		// 1) next와 nextLine을 동시에 사용하면 엔터가 먹힌는 경우가 발생된다.
		// 2) 그럴경우 next 뒤에 아무내용없는 nextLine을 하나 적어준다.
		
		scan.close();
		
	}
}