package 일급40_문제;

/*

#문제10
자연수를 제곱한 수는 제곱수, 세 제곱한 수는 세제곱 수라고 합니다.
 예를 들어 2^2 = 4 는 제곱수, 3^3 = 27은 세제곱수 입니다.

두 자연수 a, b가 주어질 때 a 이상 b 이하인 자연수 중 _**소수**_의 제곱수와 세제곱수의 개수를 구하려 합니다.
 예를 들어 a = 6, b = 30일 때 소수의 제곱수는 [9, 25]로 2개, 
 소수의 세제곱수는 [8, 27]로 2개로 총 4개입니다.

두 자연수 a, b가 매개변수로 주어질 때, a 이상 b 이하인 제곱수와 세제곱수의 개수의 합을 return 하도록 solution 메소드를 완성해주세요.

---
#####매개변수 설명

두 자연수 a, b가 solution 메소드의 매개변수로 주어집니다.

* a, b는 각각 1 이상 1,000,000,000 이하인 자연수입니다.
* a ≤ b인 경우만 입력으로 주어집니다.

---
#####return 값 설명
 a 이상 b 이하인 제곱수와 세제곱수의 개수의 합을 return 해주세요.

---
#####예시

| a | b  | return |
|---|----|--------|
| 6 | 30 | 4 |

#####예시 설명
6 이상 30 이하인 수중 소수의 제곱수는 다음과 같습니다.

* 3^2 = 9
* 5^2 = 25

소수의 세제곱 수는 다음과 같습니다.

* 2^3 = 8
* 3^3 = 27

따라서 4를 return 하면 됩니다.
*/
//다음과 같이 import를 사용할 수 있습니다.
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
 public int solution(int a, int b) {
     // 여기에 코드를 작성해주세요.
     int answer = 0;
     return answer;
 }

 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args){
     Solution sol = new Solution();
     
     int a = 6;
     int b = 30;
     int ret = sol.solution(a, b);

     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
 }
}
