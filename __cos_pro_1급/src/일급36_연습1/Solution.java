package 일급36_연습1;
import java.util.ArrayList;
import java.util.Arrays;
/*
 * 

#문제6
어떤 자리 수 k가 주어졌을 때 
각 자릿수의 k 제곱의 합이 원래 수가 되는 수를 자아도취 수라고 합니다.
 예를 들어 153은 세 자리 자아도취 수입니다.

![IMG](http://res.cloudinary.com/drsnvubas/image/upload/c_scale,w_400/v1518153392/narci_qsawna.png)

자연수 k가 매개변수로 주어질 때, 
k 자리 자아도취 수들을 배열에 오름차순으로 담아
 return 하도록 solution 메소드를 작성하려 합니다. 
 빈칸을 채워 전체 코드를 완성해주세요.

---

#####매개변수 설명
k가 solution 메소드의 매개변수로 주어집니다.

* k는 3 이상 6 이하인 자연수입니다.

---

#####return 값 설명

k 자리 자아도취 수를 오름차순으로 정렬한 뒤 배열에 담아 return 합니다.

---

#####예시

| k | return               |
|---|----------------------|
| 3 | [153, 370, 371, 407] |

#####예시 설명

* 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
* 370 = 3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370
* 371 = 3^3 + 7^3 + 1^1 = 27 + 343 + 1 = 371
* 407 = 4^3 + 0^3 + 7^3 = 64 + 0 + 343 = 407


 */
class Solution {
	int getPower(int k , int n) {
		int total = n;
		for(int i = 1; i < k; i++) {
			total = total * n;
		}
	//	System.out.print(total + " ");
	//	System.out.println(n);
		return total;
	}
	
    public int[] solution(int k) {
    	ArrayList<Integer> arrList = new ArrayList<Integer>();
    	int range = 1;
    	
    	for(int i = 0; i < k; i++) {
    		range *= 10;
    	}
    	//System.out.println(range);
    	int start = range / 10;
    	for(int i = start; i < range; i++) {
    		int total = 0;
    		int temp = i;
    		//System.out.println(temp);
    		while(true) {
    			int a = temp % 10;
    			int b =  getPower(k , a);
    		//	System.out.print(b + " ");
    			total += b;
    			temp = temp / 10;
    			if(temp == 0) {
    				break;
    			}
    		}
    	//	System.out.println(total + " " + i);
    		if(total == i) {
    			arrList.add(i);
    		}
    	}
    	//System.out.println(arrList.toString());
    	int [] result = new int[arrList.size()];
    	
    	for(int i = 0; i < arrList.size(); i++) {
    		result[i] = arrList.get(i);
    	}
    	
    	
        return result;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int k = 3;
        int[] ret = sol.solution(k);

        // 실행] 버튼을 누르면 출력값을 볼 수 있습니다.
        System.out.printf("solution 메소드의 반환 값은 ");
        System.out.printf(Arrays.toString(ret));
        System.out.printf(" 입니다.\n");
    }   
}