package 문자열2_개념;

import java.util.Arrays;

/*
	[문제]
		scoreList배열의 값을 콤마(,)를 구분자로
		data 문자열에 연결하시오.
		단, 내림차순으로 정렬하여 연결하시오.
	[정답]
		data = 54,43,32,12
*/

public class 문자열2_개념01_형변환_정답 {
	public static void main(String[] args) {
		
		int[] scoreList = {12, 32, 54, 43};
		String data = "";
		
		for(int i=0; i<scoreList.length; i++) {
			int maxScore = scoreList[i];
			int maxIndex = i;
			
			for(int j=i; j<scoreList.length; j++) {
				if(maxScore < scoreList[j]) {
					maxScore = scoreList[j];
					maxIndex = j;
				}
			}
			
			int temp = scoreList[i];
			scoreList[i] = scoreList[maxIndex];
			scoreList[maxIndex] = temp;
		}
		System.out.println(Arrays.toString(scoreList));
		// [54, 43, 32, 12]
		
		/*
					data = data + scoreList[i]
			i = 0	data = ""			+ 54  	= "54"
					data = "54" 		+ "," 	= "54,"
			i = 1	data = "54,"		+ 43  	= "54,43"
					data = "54,43" 		+ "," 	= "54,43,"
			i = 2	data = "54,43," 	+ 32 	= "54,43,32"
					data = "54,43,32" 	+ "," 	= "54,43,32,"
			i = 3	data = "54,43,32," 	+ 12 	= "54,43,32,12"
				
		 */
		for(int i=0; i<scoreList.length; i++) {
			data += scoreList[i];
			if(i < scoreList.length - 1) {
				data += ",";
			}
		}
		System.out.println(data);
		
	}
}
