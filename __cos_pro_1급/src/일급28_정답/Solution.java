package 일급28_정답;
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

/*
 * #문제8
교실에 선풍기가 4대 있습니다. 선풍기는 한 대당 학생 k명에게 바람을 보냅니다. 모든 학생에게 바람을 보내기 위해서 선풍기를 몇 대 더 구매해야 할지 구하려고 합니다.

예를 들어, 선풍기 한 대당 학생 3명에게 바람을 보낼 수 있을 때, 한 교실당 학생 수가 [15, 17, 19, 10, 23] 명이고 선풍기가 4대 있으면 교실당 학생 [3, 5, 7, 0, 11] 명을 위해 선풍기를 더 구매해야 합니다. 이때, 교실별로 선풍기가 [1, 2, 3, 0, 4] 대씩 더 필요하니 총 선풍기 10대를 추가로 구매해야 합니다.

선풍기가 바람을 보내는 학생 수 k와 교실별 학생 수가 담긴 배열 student가 주어질 때, 선풍기를 최소 몇 대 사야 하는지를 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

---
#####매개변수 설명
선풍기가 바람을 보내는 학생 수 k와 교실별 학생 수가 담긴 배열 student가 solution 메소드의 매개변수로 주어집니다.
* 선풍기가 바람을 보내는 학생 수 k는 1 이상 25 이하인 정수입니다.
* 한 교실엔 1명 이상 1,000명의 학생이 있습니다.
* 교실은 1개 이상 100개 이하가 있습니다.

---
#####return 값 설명
선풍기를 최소 몇 대 사야 하는지를 return 합니다.

---
#####예시

| k | student           | return |
|---|----------------------|--------|
| 1 | [4, 4, 4, 4]      | 0     |
| 3 | [15, 17, 19, 10, 23] | 10     |

#####예시 설명
예시 #1
이미 설치된 선풍기 4대로 모든 학생을 시원하게 해줄 수 있습니다.


예시 #2
문제에 나온 예와 같습니다.
 */
class Solution {
    public int solution(int k, int[] student) {
        int answer = 0;
        for(int i = 0; i < student.length; i++){
            student[i] -= 4*k;
            if(student[i] <= 0)
                continue;
            answer += (student[i] + k - 1) / k;
        }
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int k1 = 1;
        int[] student1 = {4, 4, 4, 4};
        int ret1 = sol.solution(k1, student1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int k2 = 3;
        int[] student2 = {15, 17, 19, 10, 23};
        int ret2 = sol.solution(k2, student2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}