package 문자열1_문제;

/*
	[문제]
		userData는 학생번호 데이터이고,
		scoreData는 학생점수 데이터이다.
		1등 학생의 번호와 성적 그리고 평균을 출력하시오.
	[정답]
		(1) 1003번 : 43점
		(2) 평균 : 21.5점
*/
public class 문자열1_문제03_1등학생_정답 {
	public static void main(String[] args) {
		
		String userData = "1001,1002,1003,1004";
		String scoreData = "10,21,43,12";
		
		String[] userTemp = userData.split(",");
		int[] userList = new int[userTemp.length];
		for(int i=0; i<userList.length; i++) {
			userList[i] = Integer.parseInt(userTemp[i]);
		}
		
		String[] scoreTemp = scoreData.split(",");
		int[] scoreList = new int[scoreTemp.length];
		for(int i=0; i<scoreList.length; i++) {
			scoreList[i] = Integer.parseInt(scoreTemp[i]);
		}
		
		int maxScore = 0;
		int maxIndex = 0;
		int total = 0;
		for(int i=0; i<scoreList.length; i++) {
			if(maxScore < scoreList[i]) {
				maxScore = scoreList[i];
				maxIndex = i;
			}
			total += scoreList[i];
		}
		double avg = total / (double)scoreList.length;
		
		System.out.println(userList[maxIndex] + "번 : " + maxScore + "점");
		System.out.println("평균 : " + avg + "점");
		
	}
}
