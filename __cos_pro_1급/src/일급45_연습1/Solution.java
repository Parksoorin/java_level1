package 일급45_연습1;
/*


#문제5
XX게임에선 캐릭터는 자신과 공격력이 같거나 자신보다 공격력이 작은 몬스터에게 이깁니다.
 내가 가진 캐릭터가 최대 몬스터 몇 마리를 이길 수 있는지 구하려 합니다. 단, 한 캐릭터는 한 번만 싸울 수 있습니다.

예를 들어, 세 몬스터의 공격력이 각각 [1, 4, 3]이고, 
내가 가진 두 캐릭터의 공격력이 각각 [1, 3]이라면 첫 번째 캐릭터는 첫 번째 몬스터와, 
두 번째 캐릭터는 세 번째 몬스터와 싸워서 이길 수 있습니다. 따라서 이길 수 있는 몬스터 수는 최대 2마리입니다. 

모든 몬스터의 공격력을 담은 배열 enemies,
 내가 가진 모든 캐릭터의 공격력을 담은 배열 armies가 매개변수로 주어질 때, 
 내 캐릭터로는 최대 몬스터 몇 마리를 이길 수 있는지 return 하도록 solution 메소드를 작성해주세요.

---
##### 매개변수 설명

모든 몬스터의 공격력을 담은 배열 enemies, 
내가 가진 모든 캐릭터의 공격력을 담은 배열 armies가 solution 메소드의 매개변수로 주어집니다.

* 몬스터 수는 1마리 이상, 500마리 이하입니다.
* 각 몬스터의 공격력은 1 이상 100 이하입니다.
* 내가 가진 캐릭터 수는 1개 이상 500개 이하입니다.
* 각 캐릭터의 공격력은 1 이상 100 이하입니다.

---
##### return 값 설명

내가 가진 캐릭터로는 최대 몬스터 몇 마리를 이길 수 있는지 return 해주세요.

---
##### 입출력 예

| enemies   | armies    | return |
|-----------|--------------|--------|
| [1, 4, 3] | [1, 3]    | 2     |
| [1, 1, 1] | [1, 2, 3, 4] | 3      |

##### 입출력 예 설명
입출력 예 #1
문제에 나온 예와 같습니다.

입출력 예 #2
캐릭터를 어떻게 보내도 모든 몬스터를 이길 수 있습니다.


 */
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
 public int solution(int[] enemies, int[] armies) {
     // 여기에 코드를 작성해주세요.
     int answer = 0;
     Arrays.sort(enemies);
     Arrays.sort(armies);
     for(int i = 0; i < armies.length; i++) {
    	 for(int j = 0; j < enemies.length; j++) {
    		 if(armies[i] >= enemies[j]) {
    			 answer += 1;
    			 armies[i] = 101;
    			 enemies[j] = 101;
    			 break;
    		 }
    	 }
     }
     
     
     return answer;
 }

 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
 	Solution sol = new Solution();
 	int[] enemies1 = {1, 4, 3};
 	int[] armies1 = {1, 3};
 	int ret1 = sol.solution(enemies1, armies1);

 	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
 	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

 	int[] enemies2 = {1, 1, 1};
 	int[] armies2 = {1, 2, 3, 4};
 	int ret2 = sol.solution(enemies2, armies2);

 	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
 	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
 }
}