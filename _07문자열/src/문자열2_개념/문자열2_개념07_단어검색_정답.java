package 문자열2_개념;

import java.util.Scanner;

/*
	[문제]
		단어를 입력받아 text배열에 해당 단어가 있는지 검색한다.
		단어가 존재하면 출력한다.
		단, 부분 검색도 가능해야 한다.
	[예시] 
		ch ==> school, teacher, child
*/

public class 문자열2_개념07_단어검색_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] text = {"school", "teacher", "child", "father", "love"};
		
		System.out.print("검색할 단어 입력 : ");
		String searchWord = scan.next();
		
		for(int i=0; i<text.length; i++) {
			
			boolean check = false;
			for(int j=0; j<text[i].length() - searchWord.length() + 1; j++) {
				
				int count = 0;
				for(int k=0; k<searchWord.length(); k++) {
					// "school".charAt(0 + 0)== "ch".charAt(0)
					// "school".charAt(0 + 1)== "ch".charAt(1)
					if(text[i].charAt(j + k) == searchWord.charAt(k)) {
						count += 1;
					}
				}
				if(count == searchWord.length()) {
					check = true;
					break;
				}
			}
			
			if(check) {
				System.out.print(text[i] + " ");
			}
		}
		
		scan.close();
		
	}
}
