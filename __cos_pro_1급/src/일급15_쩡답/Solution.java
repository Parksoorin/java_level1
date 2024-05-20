package 일급15_쩡답;
/*


#문제5
자연수가 들어있는 배열이 있습니다. 이 배열에서, 숫자가 연속해서 증가하는 가장 긴 구간의 길이를 구하려 합니다. 단, 바로 전 숫자와 현재 숫자가 같은 경우는 증가한 것으로 보지 않습니다.

예를 들어 배열에 순서대로 [3, 1, 2, 4, 5, 1, 2, 2, 3, 4]가 들어있는 경우, [1, 2, 4, 5]가 들어있는 구간이 숫자가 연속해서 증가한 가장 긴 구간이며, 길이는 4입니다.

자연수가 들어있는 배열 arr가 매개변수로 주어질 때, 숫자가 연속해서 증가하는 가장 긴 구간의 길이를 return 하도록 solution 메소드를 완성해주세요.

---
#####매개변수 설명
자연수가 들어있는 배열 arr가 solution 메소드의 매개변수로 주어집니다.
* arr의 길이는 2 이상 200,000 이하입니다.
* arr의 원소는 1 이상 1,000,000 이하의 자연수입니다.

---
#####return 값 설명
숫자가 연속해서 증가하는 가장 긴 구간의 길이를 return 해주세요.
* 길이가 2 이상인 증가하는 구간이 없다면 1을 return 해주세요.

---
#####예시

| arr                            | return |
|--------------------------------|--------|
| [3, 1, 2, 4, 5, 1, 2, 2, 3, 4] | 4      |

#####예시 설명
숫자 [1, 2, 4, 5]가 들어있는 구간이 숫자가 연속해서 증가하는 가장 긴 구간이며, 길이는 4입니다.

현재 숫자가 바로 이전 숫자와 같은 경우에는 증가했다고 보지 않습니다. [1, 2, 2, 3, 4]가 들어있는 구간은 [2, 2]가 연속해서 증가한 부분이 아니므로, [1, 2]가 들어있는 구간과 [2, 3, 4]가 들어있는 구간으로 나누어야 합니다.


 */
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
	public int solution(int[] arr) {
        int dp[] = new int[arr.length];
        for(int i = 0; i < dp.length; ++i)
            dp[i] = 1;
        for(int i = 1; i < arr.length; ++i)
            if(arr[i] > arr[i-1])
                dp[i] = dp[i-1] + 1;
        int answer = 0;
        for(int i = 0; i < arr.length; ++i)
            answer = Math.max(answer, dp[i]);
        return answer;
    }

 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
     Solution sol = new Solution();
     int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
     int ret = sol.solution(arr);

     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
 }
}