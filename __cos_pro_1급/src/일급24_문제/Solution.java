package 일급24_문제;
//다음과 같이 import를 사용할 수 있습니다.
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
/*


#문제4
두 문자열 s1과 s2를 붙여서 새 문자열을 만들려 합니다. 
이때, 한 문자열의 끝과 다른 문자열의 시작이 겹친다면, 겹치는 부분은 한 번만 적습니다.

예를 들어 s1 = "ababc", s2 = "abcdab"일 때, 
아래와 같이 s1 뒤에 s2를 붙이면 새 문자열의 길이는 9입니다.

  ![string2.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/b4bd8f93a2/61f4238b-bcc7-435c-a203-da6ebb27d968.png)

그러나 s2 뒤에 s1을 붙이면 새 문자열의 길이는 8로, 더 짧게 만들 수 있습니다.

   ![string3.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/e983c2cd38/9ffb7a01-73f3-47d5-aa39-b97543cf7973.png)

두 문자열 s1과 s2가 매개변수로 주어질 때, 
s1과 s2를 붙여서 만들 수 있는 문자열 중, 
가장 짧은 문자열의 길이를 return 하도록 solution 메소드를 완성해주세요.

---
#####매개변수 설명
두 문자열 s1과 s2가 solution 메소드의 매개변수로 주어집니다.

* s1과 s2의 길이는 1 이상 100 이하입니다.
* s1과 s2는 알파벳 소문자로만 이루어져 있습니다.

---
#####return 값 설명
s1과 s2를 붙여서 만들 수 있는 문자열 중, 가장 짧은 문자열의 길이를 return 해주세요.

---
#####예시

| s1      | s2       | return |
|---------|----------|--------|
| "ababc" | "abcdab" | 8      |

#####예시 설명
문제에 주어진 예시와 같습니다.


 */
class Solution {
	
	int getMax(String s1, String s2) {
		int size = 1;
		int max = 0;
		while(true) {
			if(size > s1.length()) break;
			if(size > s2.length()) break;
			String a = s1.substring(s1.length() - size , s1.length());
			String b = s2.substring(0, size);
			if(a.equals(b)) {
				max = size;
			}
			size += 1;
		}
		return max;
	}
	public int solution(String s1, String s2) {
	     int answer = 0;
	     int a = getMax(s1, s2);
	     int b = getMax(s2, s1);
	     System.out.println(a + " " + b);
	     answer += (s1.length() + s2.length());
	     if(a > b) {
	    	 answer -= a;
	     }else {
	    	 answer -= b;
	     }
	     return answer;
 }
 
 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
     Solution sol = new Solution();
     String s1 = new String("ababc");
     String s2 = new String("abcdab");
     int ret = sol.solution(s1, s2);
     
     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
 }
}