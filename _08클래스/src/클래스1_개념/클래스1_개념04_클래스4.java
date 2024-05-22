package 클래스1_개념;

/*
	# 클래스의 용도
		1. 배열만 사용해서 프로그램을 만들때의 불편함 해소
		2. 즉, 배열은 같은 종류의 자료형만 저장이 가능하다.
		3. 때문에 정수의 경우 계속해서 형변환을 사용해야 한다.
		4. 데이터 검색 시 데이터의 양이 많아지면 인덱스로 찾기가 불편하다. 
*/

class Employee {
	int number;					// 번호
	String name;				// 이름
	String position;			// 직책
	int superiorNumber;			// 상사번호
	String regDate;				// 입사일
	int salary;					// 급여
	int commission;				// 상여금
	int departmentNumber;		// 부서번호
}


public class 클래스1_개념04_클래스4 {
	public static void main(String[] args) {
		
		// 클래스 사용 전
		String[][] memberList = { 
			{"7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20"},
			{"7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30"},
			{"7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30"}
		};		
			
		String[] numList = {"7369" , "7499" , "7521"};
		String[] nameList = {"SMITH" , "ALLEN" , "WARD"};
		String[] bossList = {"CLERK" , "SALESMAN" , "SALESMAN"};
		int[] salaryList = {800 , 1600, 1250};
		
		// 클래스 사용 후
		// 위 데이터를 클래스로 변경하면, 
		// 데이터의 타입에 알맞게 굉장히 직관적으로 데이터를 저장할 수 있다.
		Employee emp = new Employee();
		emp.number = 7369;
		emp.name = "SMITH";
		emp.position = "CLERK";		// 사무원
		emp.superiorNumber = 7902;
		emp.regDate = "17-12-1980";
		emp.salary = 800;
		emp.commission = 0;
		emp.departmentNumber = 20;
		
	}
}
