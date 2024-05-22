package 문자열2_개념;

import java.util.Arrays;

/*
	[문제]
		split() 메서드는 자동으로 문자열을 배열로 만들어준다.
		이 메서드를 사용하지 않고 직접 잘라서 배열에 저장해보자.
	[정답]
		[aaa, bbbb, ccc]
*/

public class 문자열2_개념06_split구현_정답 {
	public static void main(String[] args) {
		
		String str = "aaa/bbbb/ccc";
		
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '/') {
				count += 1;
			}
		}

		String[] arr = new String[count + 1];
		
		// "aaa/bbbb/ccc"
		/*
			i = 0	unit = ""   + "a"
			i = 1	unit = "a"  + "a"
			i = 2	unit = "aa" + "a"
			i = 3
					index = 0
					arr = ["aaa", null, null]
					index = 1
					unit = ""
			i = 4	unit = "" + "b"
			i = 5	unit = "b" + "b"
			i = 6	unit = "bb" + "b"
			i = 7	unit = "bbb" + "b"
			i = 8	
					index = 1
					arr = ["aaa", "bbbb", null]
					index = 2
					unit = ""
			...
		 */
		String unit = "";
		int index = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '/') {
				arr[index] = unit;
				index += 1;
				
				unit = "";
			} else {
				unit += str.charAt(i);
			}
		}
		arr[index] = unit;
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
