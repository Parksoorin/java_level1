package 일급22_연습1;
import java.util.*;
/*
 

#문제2
앞뒤를 뒤집어도 똑같은 문자열을 팰린드롬(palindrome)이라고 합니다. 예를 들어, "aba"는 팰린드롬이며 "abccca"는 팰린드롬이 아닙니다.

어떤 문자열의 부분 문자열 중 팰린드롬인 문자열이 여럿일 수 있습니다.
이 중 k번째로 큰 팰린드롬을 알고 싶습니다. k번째로 큰 팰린드롬이란, 모든 팰린드롬을 __사전 순__으로 나열했을 때 k번째에 위치하는 팰린드롬을 뜻합니다.
 이를 위해 다음과 같이 프로그램 구조를 세웠습니다.

```
1. 팰린드롬 문자열을 저장할 배열 palindromes를 선언합니다.
2. 주어진 문자열의 모든 부분 문자열을 찾아 다음을 수행합니다.
 2-1. 부분 문자열이 팰린드롬 문자열인지 확인하고, 팰린드롬 문자열이라면 palindromes에 같은 문자열이 이미 들어있는지 확인합니다.
 2-2. palindromes에 같은 문자열이 없으면, 현재 팰린드롬 문자열을 추가합니다.
3. palindromes를 정렬합니다.
4. 배열 길이가 k보다 작다면 "NULL"을 리턴합니다.
5. 그렇지 않으면 배열의 k-1번째 원소를 리턴합니다.
```

문자열 s와 숫자 k가 매개변수로 주어질 때, k번째로 큰 팰린드롬 문자열을 return 하도록 solution 메소드를 작성하려 합니다.
 위 구조를 참고하여 코드가 올바르게 동작하도록 빈칸에 주어진 func_a, func_b, func_c 메소드와 매개변수를 알맞게 채워주세요.

---
#####매개변수 설명

문자열 s와 숫자 k가 solution 메소드의 매개변수로 주어집니다.

* s의 길이는 1 이상 100 이하입니다.
* s는 알파벳 소문자로만 구성됩니다.
* k는 200 이하인 자연수입니다.

---
#####return 값 설명

k번째로 큰 팰린드롬 문자열을 return 해주세요.
* 단, s로 만들 수 있는 팰린드롬 수가 k개 미만이면 "NULL"을 return 해주세요.

---
#####예시

| s | k | return |
|---|---|--------|
|"abcba"| 4 | "bcb" |
|"ccddcc"| 7 | "NULL" |

#####예시 설명

예시 #1
"abcba"의 부분 문자열 중 팰린드롬인 문자열을 사전 순으로 나열하면 "a", "abcba", "b", "bcb", "c" 입니다. 이 중 4번째로 큰 팰린드롬은 "bcb"입니다.

예시 #2
"ccddcc"의 부분 문자열 중 팰린드롬인 문자열을 사전 순으로 나열하면 "c", "cc", "ccddcc", "cddc", "d", "dd" 입니다. 팰린드롬인 문자열이 총 6개이므로, 7번째로 큰 팰린드롬은 없습니다. 따라서, "NULL"을 return 합니다.

 */
public class Solution {
    
    public String solution(String s, int k) {
    	//ArrayList<String> strList = new ArrayList<String>();
    	Set<String> setList = new HashSet<String>();
    	for(int i = 0; i < s.length(); i++) {
    		setList.add(s.charAt(i) +"");
    	}
    	int count = 2;
    	for(int i = 1; i < s.length(); i++) { 		
    		int start = 0;	
    		while(true) {
    			if(start + count > s.length()) {
    				break;
    			}
    			String cut = s.substring(start, start + count);
    			
    			boolean check = false;
    			int hSize = cut.length() / 2;
    			
    			int lastIndex = cut.length() - 1;
    			for(int j = 0; j < hSize; j++) {
    				if(cut.charAt(j) != cut.charAt(lastIndex)) {
    					check = true;
    					break;
    				}
    				lastIndex -= 1;
    			}
    			//System.out.println(cut + " " + check);
    			if(check == false) {
    				setList.add(cut);
    			}
    			
    			start += 1;    			
    		}
    		count += 1;
    	}
    	
    	ArrayList<String> strList = new ArrayList<String>();
    	for(String v : setList) {
    		strList.add(v);
    //		System.out.println(v);
    	}
    	Collections.sort(strList);
    	 
    	for(String v : strList) {	
    		
    	//	System.out.println(v);
    	}
    	
    	if(k - 1 >= strList.size()) {
    		return "NULL";
    	}else {
    		return strList.get(k - 1);
    	}
    	
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution sol = new Solution();
        String s1 = new String("abcba");
        int k1 = 4;
        String ret1 = sol.solution(s1, k1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        String s2 = new String("ccddcc");
        int k2 = 7;
        String ret2 = sol.solution(s2, k2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}