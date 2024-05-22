package 문자열2_개념;

import java.util.Arrays;

/*
	[문제] 
		아래 데이터에서 꼴등을 삭제 후 다시 문자열로 변경하시오.
		1) 문자열을 잘라서 배열에 저장한다.
		2) 배열에서 꼴등을 삭제한다.
		3) 삭제한 배열을 다시 문자열로 만든다.
	[정답]
		str = "김철수/87,이영희/95";
*/

public class 문자열2_개념05_형변환_정답 {
	public static void main(String[] args) {
	
		String str = "김철수/87,이만수/42,이영희/95";
		
		// 1. 문자열을 잘라서 배열에 저장한다.
		String[] temp = str.split(",");
		String[] nameList = new String[temp.length];
		int[] scoreList = new int[temp.length];
		
		for(int i=0; i<temp.length; i++) {
			String[] info = temp[i].split("/");
			
			nameList[i] = info[0];
			scoreList[i] = Integer.parseInt(info[1]);
		}
		System.out.println(Arrays.toString(nameList));
		System.out.println(Arrays.toString(scoreList));
		
		// 2. 배열에서 꼴등을 삭제한다.
		int minScore = 100;
		int minIndex = 0;
		for(int i=0; i<scoreList.length; i++) {
			if(minScore > scoreList[i]) {
				minScore = scoreList[i];
				minIndex = i;
			}
		}
		System.out.println(minScore);
		
		String[] nameTemp = new String[temp.length - 1];
		int[] scoreTemp = new int[temp.length - 1];
		
		int index = 0;
		for(int i=0; i<scoreList.length; i++) {
			if(i != minIndex) {
				nameTemp[index] = nameList[i];
				scoreTemp[index] = scoreList[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(nameTemp));
		System.out.println(Arrays.toString(scoreTemp));
		
		// 3. 삭제한 배열을 다시 문자열로 만든다.
		str = "";
		for(int i=0; i<nameTemp.length; i++) {
			str += nameTemp[i];
			str += "/";
			str += scoreTemp[i];
			if(i < nameTemp.length - 1) {
				str += ",";
			}
		}
		System.out.println(str);
		
	}
}








