package 일급38_정답_심화;
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

/*
 * 
#문제8
1 이상 9 이하 숫자가 적힌 카드를 이어 붙여 숫자를 만들었습니다. 이때, 숫자 카드를 조합해 만든 수 중에서 n이 몇 번째로 작은 수인지 구하려 합니다.

예를 들어, 숫자 카드 1, 2, 1, 3로 만들 수 있는 수를 작은 순으로 나열하면 
[1123, 1132, 1213, 1231, 1312, ... , 3121, 3211]입니다. n이 1312라면, 
숫자 카드를 조합해 만든 수 중 n은 n은 5번째로 작은 수입니다.

숫자 카드를 담은 배열 card, 수 n이 매개변수로 주어질 때 숫자 카드를 조합해 만든 수 중에서 n이 몇 번째로 작은 수인지 return 하도록 solution 메소드를 완성해주세요.

---

#####매개변수 설명

카드에 적힌 숫자를 담은 배열 card, 수 n이 solution 메소드의 매개변수로 주어집니다.

* card는 길이가 9 이하인 배열입니다.
* card의 원소는 1 이상 9 이하인 자연수입니다.
* n은 999,999,999 이하인 자연수입니다.
* n의 자릿수는 배열 card의 길이와 같습니다.
* n의 각 자리의 숫자는 1 이상 9 이하입니다.

---

#####return 값 설명

숫자 카드를 조합해 만든 수 중에서 n이 몇 번째로 작은 수인지 return 해주세요.

* 만약, n을 만들 수 없다면 -1을 return 해주세요.

---
#####예시

| card | n | return |
|----|----|----|
| [1, 2, 1, 3] | 1312 | 5 |
| [1, 1, 1, 2] | 1122 | -1 |

#####예시 설명

예시 #1
앞서 설명한 예와 같습니다.

예시 #2
숫자 카드를 조합하면 [1112, 1121, 1211, 2111]를 만들 수 있습니다. 따라서 1122는 만들 수 없습니다.



 */

class Solution {
	ArrayList<Integer> num_list = new ArrayList<Integer>();

	public int[] func_a(int[] card) {
		int card_count[] = new int [10];
	    for (int i = 0; i < card.length; i++) {
	        card_count[card[i]]++;
	    }
	    return card_count;
	}

	public void func_b(int level, int max_level, int num, int[] current_count, int[] max_count) {
	    if (level == max_level) {
	    	num_list.add(num);
	        return;
	    }
	    for (int i = 1; i <= 9; i++) {
	        if (current_count[i] < max_count[i]) {
	            current_count[i] += 1;
	            func_b(level + 1, max_level, num * 10 + i, current_count, max_count);
	            current_count[i] -= 1;
	        }
	    }
	}

	public int func_c(ArrayList<Integer> list, int n) {
	    for (int i = 0; i < list.size(); i++) {
	        if (n == list.get(i))
	            return i + 1;
	    }
	    return -1;
	}

	public int solution(int[] card, int n) {
	    int[] card_count = func_a(card);
	    func_b(0, card.length, 0, new int[10], card_count);
	    int answer = func_c(num_list, n);
	    return answer;
	}
 
 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
     Solution sol = new Solution();
     int card1[] = {1, 2, 1, 3};
     int n1 = 1312;
     int ret1 = sol.solution(card1, n1);

     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

     int card2[] = {1, 1, 1, 2};
     int n2 = 1122;
     int ret2 = sol.solution(card2, n2);
     
     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
 }    
}