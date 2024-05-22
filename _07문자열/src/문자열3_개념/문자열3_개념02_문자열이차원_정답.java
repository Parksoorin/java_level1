package 문자열3_개념;

import java.util.Arrays;

/*
	[문제]
		userData는 회원번호와 이름이다.
		pointData는 포인트점수와 회원번호이다.
		번호가 여러개면 누적할 수 있다.
		점수가 가장 높은 회원의 이름을 출력하시오.
	[정답]
		1002회원 : 3점
*/

public class 문자열3_개념02_문자열이차원_정답 {
	public static void main(String[] args) {
		
		String userData = "1001/김철수\n";
		userData += "1002/이만수\n";
		userData += "1003/이영희";
		
		String pointData = "1,1001\n";
		pointData += "1,1002\n";
		pointData += "2,1003\n";
		pointData += "1,1001\n";
		pointData += "2,1002";
		
		String[] userTemp = userData.split("\n");
		String[] pointTemp = pointData.split("\n");
		
		String[][] userList = new String[userTemp.length][2];
		String[][] pointList = new String[pointTemp.length][2];
		
		for(int i=0; i<userTemp.length; i++) {
			String[] info = userTemp[i].split("/");	// "1001/김철수"
			
			userList[i][0] = info[0];	// "1001"
			userList[i][1] = info[1];	// "김철수"
		}
		for(int i=0; i<pointTemp.length; i++) {
			String[] info = pointTemp[i].split(","); // "1,1001"
			
			pointList[i][0] = info[0];	// "1"
			pointList[i][1] = info[1];	// "1001"
		}
		for(int i=0; i<userList.length; i++) {
			System.out.println(Arrays.toString(userList[i]));
		}
		for(int i=0; i<pointList.length; i++) {
			System.out.println(Arrays.toString(pointList[i]));
		}
		
		int maxPoint = 0;
		int maxIndex = 0;
		for(int i=0; i<userList.length; i++) {
			int total = 0;
			for(int j=0; j<pointList.length; j++) {
				if(userList[i][0].equals(pointList[j][1])) {
					total += Integer.parseInt(pointList[j][0]);
				}
			}
			
			if(maxPoint < total) {
				maxPoint = total;
				maxIndex = i;
			}
		}
		System.out.println(userList[maxIndex][0] + "회원 : " + maxPoint + "점");
		
	}
}







