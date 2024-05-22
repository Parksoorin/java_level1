package 배열6_문제;

import java.util.Arrays;

/*
	[문제] 
		성적 순으로 번호를 출력하시오.
	[정답] 
		1004, 1001, 1002, 1003
*/

public class 배열6_문제06_석차출력_정답 {
	public static void main(String[] args) {
		
		int[] numList   = {1001, 1002, 1003, 1004};
		int[] scoreList = {  87,   42,   11,   98};
		
		// 방법1. 내림차순 알고리즘 활용
		// scoreList와 numList 정렬
		
		/*
			i = 0, maxScore = 87, maxIndex = 0
				j = 0 maxScore < scoreList[0]	false
				j = 1 maxScore < scoreList[1]	false
				j = 2 maxScore < scoreList[2]	false
				j = 3 maxScore < scoreList[3]	true
					  maxScore = 98
					  maxIndex = 3
					  
					  scoreList = [  98,   42,   11,   87]
					  numList   = [1004, 1002, 1003, 1001]
			...
				
		 */
		/*
		for(int i=0; i<scoreList.length; i++) {
			int maxScore = scoreList[i];
			int maxIndex = i;
			
			// 최대값 검색
			for(int j=i; j<scoreList.length; j++) {
				if(maxScore < scoreList[j]) {
					maxScore = scoreList[j];
					maxIndex = j;
				}
			}
			
			int temp = scoreList[i];
			scoreList[i] = scoreList[maxIndex];
			scoreList[maxIndex] = temp;
			
			temp = numList[i];
			numList[i] = numList[maxIndex];
			numList[maxIndex] = temp;
		}
		
		System.out.println(Arrays.toString(numList));
		
		*/
		
		// 방법2. countList 배열을 활용
		/*
			87,   42,   11,   98
			
			i = 0
				j = 0 scoreList[0] <= scoreList[0] true  countList=[1,0,0,0]
				j = 1 scoreList[0] <= scoreList[1] false
				j = 2 scoreList[0] <= scoreList[2] false
				j = 3 scoreList[0] <= scoreList[3] true  countList=[2,0,0,0]
			...
			
		 */
		
		int[] countList = new int[4];
		
		for(int i=0; i<scoreList.length; i++) {
			for(int j=0; j<scoreList.length; j++) {
				if(scoreList[i] <= scoreList[j]) {
					countList[i] += 1;
				}
			}
		}
		
		// countList = [2, 3, 4, 1]
		System.out.println(Arrays.toString(countList));
		
		int rank = 1;
		for(int i=0; i<countList.length; i++) {
			for(int j=0; j<countList.length; j++) {
				if(countList[j] == rank) {
					System.out.print(numList[j] + " ");
					rank += 1;
					break;
				}
			}
		}
		
				
		
	}
}









