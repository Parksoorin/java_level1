package 변수2_문제;

/*
	[문제]
		설탕 15kg을 6명에게 똑같이 나누어 주려고 합니다.
		한명씩 차레대로 설탕을 나눠갖는다고 했을 때
		4번째 사람이 받아가면 남은 설탕량은 얼마인지 구하시오.
	[정답]
		5kg
*/

public class 변수2_문제03_설탕_정답 {
	public static void main(String[] args) {
		
		/*
			[풀이]
				15 - 15 / 6 * 4
		 */				
		
		int 설탕무게 = 15;
		int 인원수 = 6;
		int 차례 = 4;
		
		double 소진된_설탕무게 = (double)설탕무게 / 인원수 * 차례;
		double 남은_설탕무게 = 설탕무게 - 소진된_설탕무게;
		System.out.printf("%.0fkg", 남은_설탕무게);
		
	}
}
