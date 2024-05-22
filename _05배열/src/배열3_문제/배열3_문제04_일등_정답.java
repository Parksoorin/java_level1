package 배열3_문제;

/*
	[문제]
		아래 데이터는 학생번호 1개, 점수 2개가 한 셋트이다.
		번호는 1001부터 시작이고, 점수는 0 ~ 100 이다.
		성적은 두 점수의 합으로 계산하며,
		1등의 번호를 출력하시오.
	[정답]
		1002
*/

public class 배열3_문제04_일등_정답 {
	public static void main(String[] args) {
		
		int[] arr = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
		
		int maxScore = 0;
		int maxIndex = 0;
		for(int i=0; i<arr.length; i++) {
			if(i % 3 == 0) {
				int total = arr[i + 1] + arr[i + 2];
				if(maxScore < total) {
					maxScore = total;
					maxIndex = i;
				}
			}
		}
		
		System.out.println(arr[maxIndex]);
		
	}
}
