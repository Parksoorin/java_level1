package 변수5_문제;

/*
	[문제] 
	  	철수는 체력테스트 중이다. 체력테스트는 달리기와 윗몸일으키기 이다. 
	  	운동장을 5바퀴반을 도는데 11분 50초 이하 이면 통과이다.
	  	철수는 운동 장 2바퀴도는데 261초가 걸린다. 
	
	  	윗몸일으키기는 55초 동안 35개를 하면 통과이다. 
	  	철수는 3분동안 118개를 한다고했을때,
	  	철수는 통과할수있는지 그 결과를 true 또는 false로 출력하시오.
	  	 
	  	단, 철수는 항상 같은속도로 달리기와 윗몸일으키기를한다.
	
	[정답]
		false
*/	

public class 변수5_문제02_체력테스트_정답 {
	public static void main(String[] args) {
		
		/*
		 	[풀이]
		 		체력테스트 통과기준
		 			운동장 		5.5바퀴	11*60 + 50초
		 			
					 			5.5바퀴 : 660초 = 1바퀴 : n초
					 			5.5n = 660
					 			n = 660 / 5.5
					 			n = 120초
					 			1바퀴에 120초
					 			
		 			윗몸일으키기	35개		55초
		 						
		 						35개 : 55초 = 1개 : n초
		 						35n = 55
		 						n = 55 / 35
		 						n = 1.57...초
		 						1개에 1.57초
		 		
		 		철수
		 			운동장		2바퀴		261초
		 			윗몸일으키기	118개	3 * 60초
		 */
		
		double 운동장_통과횟수 = 5.5;
		double 운동장_통과시간 = 11 * 60 + 50;
		double 운동장1바퀴_시간 = 운동장_통과시간 / 운동장_통과횟수;
		
		double 윗몸_통과횟수 = 35;
		double 윗몸_통과시간 = 55;
		double 윗몸1개_시간 = 윗몸_통과시간 / 윗몸_통과횟수;
		
		double 철수운동장_횟수 = 2;
		double 철수운동장_시간 = 261;
		double 철수운동장1바퀴_시간 = 철수운동장_시간 / 철수운동장_횟수;
		
		double 철수윗몸_횟수 = 118;
		double 철수윗몸_시간 = 3 * 60;
		double 철수윗몸1개_시간 = 철수윗몸_시간 / 철수윗몸_횟수;
		
		boolean result = 운동장1바퀴_시간 >= 철수운동장1바퀴_시간 && 윗몸1개_시간 >= 철수윗몸1개_시간;
		
		System.out.printf("운동장 1바퀴 통과시간 = %.2f\n", 운동장1바퀴_시간);
		System.out.printf("윗몸 1개 통과시간 = %.2f\n", 윗몸1개_시간);
		
		System.out.printf("철수 운동장 1바퀴 소요시간 = %.2f\n", 철수운동장1바퀴_시간);
		System.out.printf("철수 윗몸 1개 소요시간 = %.2f\n", 철수윗몸1개_시간);
		
		System.out.println(result);
		
	}
}
