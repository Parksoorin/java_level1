package 일급39_문제;
import java.util.*;
//다음과 같이 import를 사용할 수 있습니다.
/*


#문제9
hour 시 minute 분에 아날로그 시계의 시침과 분침이 몇 도를 이루는지 계산하려 합니다. 
예를 들어, 3시 00분에 시침과 분침은 90˚를 이룹니다.

어떤 시점의 시 hour, 분 minute이 매개변수로 주어질 때,
 hour 시 minute 분에 아날로그 시계의 시침과 분침이 몇 도를 이루는지 return 하도록 solution 메소드를 작성해주세요.

---
#####매개변수 설명

어떤 시점의 시 hour, 분 minute이 solution 메소드의 매개변수로 주어집니다.

* hour는 1 이상 12 이하인 자연수입니다.
* minute은 0 이상 59 이하인 정수입니다.

---

#####return 값 설명

hour 시 minute 분에 아날로그 시계의 시침과 분침이 몇 도를 이루는지 return 하세요.

* 단, 각도는 __소수점 이하 첫째 자리까지__ 표현하세요.

---
#####예시

| hour | minute | return |
|---|---|---|
| 3 | 0 | "90.0" |

#####예시 설명

앞서 설명한 예와 같습니다.

 */
class Solution {
 public String solution(int hour, int minute) {
     // 여기에 코드를 작성해주세요.
	 // 문제에 이상이 있어 정답이 없음.
	 
	 
     String answer = "";
     return answer;
 }

 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
     Solution sol = new Solution();
     int hour = 3;
     int minute = 0;
     String ret = sol.solution(hour, minute);

     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
 }
}