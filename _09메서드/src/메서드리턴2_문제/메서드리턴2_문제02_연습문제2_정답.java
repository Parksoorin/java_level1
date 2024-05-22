package 메서드리턴2_문제;

import java.util.Arrays;

/*
	[문제]
		아래 main() 메서드 안에 data배열은
		학생의 번호와 점수를 문자열 타입으로 저장한 것이다.
		번호는 1001부터 1004까지 있고
		점수는 0~100점 사이이며, 60점 이상이면 합격이다.
		오로지 합격생의 번호만 result배열에 담아서 리턴해주는
		run 메서드를 구현하시오.
 */

class Return2{
	int[] run(String[][] data) {	
		int[] result = null;	
		
		int count = 0;
		for(int i=0; i<data.length; i++) {
			int score = Integer.parseInt(data[i][1]);
			if(score >= 60) {
				count += 1;
			}
		}
		result = new int[count];
		
		int index = 0;
		for(int i=0; i<data.length; i++) {
			int score = Integer.parseInt(data[i][1]);
			if(score >= 60) {
				result[index] = Integer.parseInt(data[i][0]);
				index += 1;
			}
		}
		
		return result;
	}
}

public class 메서드리턴2_문제02_연습문제2_정답 {
	public static void main(String[] args) {
		
		Return2 re = new Return2();
		
		String data[][] = {
				{"1001","34"},
				{"1002","46"},
				{"1003","81"},
				{"1004","10"},
		};
		
		int result[] = re.run(data);
		System.out.println(Arrays.toString(result));
		
	}
}
