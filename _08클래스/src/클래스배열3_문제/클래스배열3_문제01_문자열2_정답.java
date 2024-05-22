package 클래스배열3_문제;

import java.util.Arrays;

/*
class Test{
	int num;
	int size;
	char[] data;
}
*/

public class 클래스배열3_문제01_문자열2_정답 {
	public static void main(String[] args) {
		
		String data ="";
		data += "0/2/a/b\n";
		data += "1/3/a/b/c\n";
		data += "2/5/a/b/c/d/e\n";
		data += "3/4/a/b/c/d\n";
		data += "4/3/a/b/c\n";
		data += "5/1/a";
		System.out.println(data);	

		Test[] t = null;	
        // data의 정보를 클래스배열에 저장후 출력
		
		String[] temp = data.split("\n");
		t = new Test[temp.length];
		
		for(int i=0; i<t.length; i++) {
			t[i] = new Test();
			
			String[] info = temp[i].split("/");
			t[i].num = Integer.parseInt(info[0]);
			t[i].size = Integer.parseInt(info[1]);
			
			t[i].data = new char[t[i].size];
			for(int j=0; j<t[i].data.length; j++) {
				t[i].data[j] = info[2 + j].charAt(0);
			}
		}
	
		for(int i=0; i<t.length; i++) {
			System.out.println(t[i].num + " : " + Arrays.toString(t[i].data));
		}
		
	}
}
