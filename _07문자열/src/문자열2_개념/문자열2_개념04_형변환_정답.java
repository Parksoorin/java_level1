package 문자열2_개념;

public class 문자열2_개념04_형변환_정답 {
	public static void main(String[] args) {
	
		// [문제] 이름과 성적을 아래와같이 하나의 문자열로 연결하시오.
		// [정답] "김철수/87,이만수/42,이영희/95"
		
		String[] name = { "김철수", "이만수", "이영희" };
		int[]   score = { 87, 42, 95 };
		
		String str = "";
		
		/*
			i = 0
				str = "김철수/87,"
			i = 1
				str = "김철수/87,이만수/42,"
			i = 2
				str = "김철수/87,이만수/42,이영희/95"
		 */
		
		for(int i=0; i<name.length; i++) {
			str += name[i];
			str += "/";
			str += score[i];
			
			if(i < name.length - 1) {
				str += ",";
			}
		}
		System.out.println(str);
		
	}
}
