package 문자열2_문제;

/*
	[문제]
		id와 socre를 
		구분자 슬러시(/)와 콤마(,)를 활용해
		하나의 문자열로 연결해 data에 저장하시오.
	[정답]
		"qwer/100,asdf/23,zxc/43"
 */

public class 문자열2_문제01_종합예제_정답 {
	public static void main(String[] args) {
		
		String[] id = {"qwer", "asdf", "zxc"};
		int[] score = {   100,     23,    43};
		
		String data = "";
		
		for(int i=0; i<id.length; i++) {
			data += id[i];
			data += "/";
			data += score[i];
			
			if(i < id.length - 1) {
				data += ",";
			}
		}
		System.out.println(data);
		
	}
}
