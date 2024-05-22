package 배열7_문제;

/*
	[문제]
		철수와 영희는 3월 3일에 만났다.
		철수는 영희와 100일 기념일에 축하파티를 하려고 한다.
		만난지 100일 뒤는 몇 월 몇 일인지 구하시오.
		단, 윤년은 고려하지 않는다.
	[정답]
		6월 11일
*/

public class 배열7_문제03_기념일_정답 {
	public static void main(String[] args) {
		
		int[] monthList =
			{31, 28, 31, 30, 
			 31, 30, 31, 31, 
			 30, 31, 30, 31};
	
		int month = 3;
		int day = 3;
		
		/*
			1. 1월1일부터 3월3일까의 누적 일 수
				= 31(1월) + 28(2월) + 3(3월) = 62
			2. 100일 추가로 더함
				= 62 + 100 = 162
			3. 162일에 월을 계속 차감하면서, 기념일자를 찾아감
				162 - 1월(31)	=	131
				131 - 2월(28)	= 	103
				103 - 3월(31)	= 	72
				72  - 4월(30)	=   42
				40	- 5월(31)	= 	11
				11  - 6월(30)	= 	음수
		 */
		
		int total = 0;
		for(int i=0; i<month - 1; i++) {
			total += monthList[i];
		}
		total += day;
		System.out.println(total);
		total += 100;
		System.out.println(total);
		
		for(int i=0; i<monthList.length; i++) {
			
			int temp = total;
			total -= monthList[i];
			
			if(total < 0) {
				System.out.println(i + 1 + "월 " + temp + "일");
				break;
			}
		}
		
	}
}





