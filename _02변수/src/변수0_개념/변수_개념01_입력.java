package 변수0_개념;

/* 
	java.util 패키지 안에
 	Scanner라는 이름의 클래스 파일의 내용을
 	이 페이지에서 사용하겠다.
 */
import java.util.Scanner;

/*
	# 입력받기
	1. import java.util.Scanner;
		- package와 class 사이에 작성한다.
	2. Scanner scan = new Scanner(System.in);
		- main 안에 작성해야 하며,
		  main 맨 위에 한번만 작성하면 된다.
	3. 안내문 작성
		- System.out.print("나이를 입력하세요 : ");
	4. 입력받기
		- int age = scan.nextInt();
	5. 결과출력
		- System.out.println("당신의 나이는 " + age + "세 이군요!");
	6. 닫기
		- scan.close();
		1) Scanner의 경우 닫아줘야 한다. (그 이유는 추후에 나온다)
		2) scan.close()를 생략한 경우, 노란색 경고가 뜨지만 무시해도 된다.
		3) main의 마지막 라인에 작성한다.
*/

public class 변수_개념01_입력 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		
		System.out.println("당신의 나이 = " + age + "세");
		
		scan.close();
	}
}





