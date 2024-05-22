package 배열1_문제;

/*
	[문제]
		scoreList 배열은 학생 6명의 점수이다.
		이 데이터를 그래프로 표현하려 한다.
		표시는 10자리 숫자로 표현해서 개수만큼 * 로 출력한다.
		전에는 왼쪽에서 오른쪽으로 가로로 표현했지만,
		이번에는 아래에서 위로 출력해보자.
	[정답]
		                 *
		                 *
		                 *
		        *        *
		 	    *        *
		  	    *  *     *
		        *  *     *
		     *  *  *     *
		     *  *  *     *  *
		  	 *  *  *     *  *
		    31 76 54 2 100 23	
*/


public class 배열1_문제05_그래프세로_정답 {
	public static void main(String[] args) {
		
		int[] scoreList = {31, 76, 54, 2, 100, 23};
		int[][] temp = new int[10][scoreList.length];
		
		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp[i].length; j++) {
				if(scoreList[j] / 10 > i) {
					temp[temp.length - 1 - i][j] = 1;
				}
			}
		}
		
		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp[i].length; j++) {
				System.out.print(temp[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp[i].length; j++) {
				if(temp[i][j] == 1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		for(int i=0; i<scoreList.length; i++) {
			System.out.print(scoreList[i] + " ");
		}
		
		
	}
}
