package 문자열2_개념;

import java.util.Arrays;

public class 문자열2_개념03_형변환_정답 {
	public static void main(String[] args) {
	
		// [문제] 이름은 name배열에, 성적은 score배열에 각각 저장 및 출력하시오.
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3]; // 김철수,이만수,이영희
		int[] score = new int[3];      // 87,42,95
		
		String[] temp = str.split(",");
		// temp = ["김철수/87", "이만수/42", "이영희/95"]
		
		/*
			i = 0
				String[] info = "김철수/87".split("/")
				String[] info = ["김철수", "87"]
				name  = ["김철수", null, null]
				score = [87, 0, 0]
				
			i = 1
				String[] info = "이만수/42".split("/")
				String[] info = ["이만수", "42"]
				name  = ["김철수", "이만수", null]
				score = [87, 42, 0]
				
			i = 2
				String[] info = "이영희/95".split("/")
				String[] info = ["이영희", "95"]
				name  = ["김철수", "이만수", "이영희"]
				score = [87, 42, 95]
				
		 */
		for(int i=0; i<temp.length; i++) {
			String[] info = temp[i].split("/");

			name[i] = info[0];
			score[i] = Integer.parseInt(info[1]);
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
		
	}
}
