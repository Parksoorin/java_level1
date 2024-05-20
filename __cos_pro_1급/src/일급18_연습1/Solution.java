package 일급18_연습1;
/*

#문제8
자연수가 들어있는 배열이 주어질 때, 다음 규칙에 따라 새로운 배열을 만들려고 합니다.

* 주어진 배열의 첫 번째 원소를 새로운 배열의 첫 번째 원소에 넣습니다.
* 주어진 배열의 마지막 원소를 새로운 배열의 두 번째 원소에 넣습니다.
* 계속해서 주어진 배열의 남아있는 원소중 가장 앞에있는 원소와 가장 뒤에있는
*  원소를 번갈아 가져와 새로운 배열에 순서대로 넣습니다.
* 주어진 배열에 더이상 원소가 남아있지 않을 때까지 위 과정을 반복합니다.

자연수가 들어있는 배열 arr가 매개변수로 주어질 때,
 위 과정을 수행해서 만든 새로운 배열을 return 하도록 solution 메소드를 작성했습니다.
  그러나, 코드 일부분이 잘못되어있기 때문에, 
  몇몇 입력에 대해서는 올바르게 동작하지 않습니다.
   주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

---
#####매개변수 설명
자연수가 들어있는 배열 arr가 solution 메소드의 매개변수로 주어집니다.
* arr의 길이는 1 이상 1,000 이하입니다.
* arr의 원소는 1 이상 10,000 이하의 자연수입니다.

---
#####return 값 설명
문제에 주어진 과정을 수행해서 만든 새로운 배열을 return 해주세요.

---
#####예시

| arr                | return             |
|--------------------|--------------------|
| [1, 2, 3, 4, 5, 6] | [1, 6, 2, 5, 3, 4] |

#####예시 설명
처음에 주어진 배열은 [1, 2, 3, 4, 5, 6]입니다. 
주어진 규칙에 맞게 새로운 배열을 만드는 과정은 다음과 같습니다.

| 처음 배열 arr      | 새로운 배열        |
|--------------------|--------------------|
| [1, 2, 3, 4, 5, 6] | [ ]                 |
| [2, 3, 4, 5, 6]    | [1]                |
| [2, 3, 4, 5]       | [1, 6]             |
| [3, 4, 5]          | [1, 6, 2]          |
| [3, 4]             | [1, 6, 2, 5]       |
| [4]                | [1, 6, 2, 5, 3]    |
| [ ]                | [1, 6, 2, 5, 3, 4] |


*/

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int [] temp = new int[arr.length];
        int lastIndex = arr.length-1;
        int index = 0;
        int hSize = arr.length / 2;
        for(int i = 0; i < hSize; i++) {
        	temp[index] = arr[i];
        	index += 1;
        	temp[index] = arr[lastIndex];
        	index += 1;
        	lastIndex -= 1;
        }
    	//System.out.println(Arrays.toString(temp));
    	if(arr.length % 2 == 1) {
    		temp[temp.length-1] = arr[arr.length / 2];
    	}
        return temp;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}
