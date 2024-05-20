package 일급44_연습1;

import java.util.Arrays;

/*


#문제4
주어진 숫자를 각 숫자와 숫자의 개수로 읽으려 합니다. 이때, 값이 큰 숫자를 먼저 읽어야합니다.

예를 들어, 2433은 2 한개 4 한개 3 두개로 이루어져 있기 때문에 "413221"로 읽습니다. 

숫자 number가 매개변수로 주어질 때, 숫자를 읽어 문자열로 return 하도록 solution 메소드를 작성했습니다. 그러나, 일부 코드가 잘못되어 코드가 바르게 동작하지 않습니다. 주어진 코드가 모든 입력을 바르게 처리하도록 코드를 수정해주세요. 코드는 _**한 줄**_만 수정해야 합니다.

---

#####매개변수 설명
숫자 number가 solution 메소드의 매개변수로 주어집니다.
* number는 0 이상 2,000,000,000 이하인 정수입니다.

---
#####return 값 설명
주어진 숫자를 읽어 문자열 형태로 return 합니다.

---
#####예시

| number | return |
|--------|----------|
| 2433 | "413221" |
| 662244 | "624222" |

#####예시 설명
예시 #1
문제에 나온 예와 같습니다.

예시 #2
662244는 6 두개 2 두개 4 두개로 이루어져 있기 때문에 "624222"로 읽습니다.


 */
class Solution {
    public String solution(int number) {
        String answer = "";       
        String str = number + "";
        
        //문자열을 캐릭터배열로 변환해준다. 
        char[] chars = str.toCharArray();
        //배열을 정렬한다. 
        Arrays.sort(chars);
        str  = new String(chars);         
        System.out.println(str);
        // 반복문을 써서 뒤집어도 되지만 아래 클래스를 이용하면조금 더 쉽게 뒤집을수있다.
        StringBuffer sb = new StringBuffer(str); // 문자열의 기능이 더 추가된클래스 // 뒤집기가 가능하다. 
        str = sb.reverse().toString();
        System.out.println(str);
        
        char a = str.charAt(0);
        int count = 1;
        for(int i = 1; i < str.length(); i++) {
        	char b = str.charAt(i);
        	if(a == b) {
        		count += 1;
        	}else {
        		answer += a;
        		answer += count;
        		count = 1;
        		a = b;
        	}
        }
        answer += a;
		answer += count;
        
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	int number1 = 2433;
    	String ret1 = sol.solution(number1);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	int number2 = 662244;
    	String ret2 = sol.solution(number2);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
