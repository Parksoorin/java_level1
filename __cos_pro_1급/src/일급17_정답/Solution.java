package 일급17_정답;

/*
 
#문제7
한국에는 다음과 같이 8가지 종류의 화폐가 있습니다.

* 동전 : 10원, 50원, 100원, 500원
* 지폐 : 1,000원, 5,000원, 10,000원, 50,000원

손님에게 거슬러줘야 하는 금액이 주어질 때, 거슬러주는 동전과 지폐 개수의 합이 최소가 되도록 하려고 합니다.

예를 들어 거슬러줘야 할 금액이 2,760원 이라면, 1,000원짜리 2장, 500원짜리 1개, 100원짜리 2개, 50원짜리 1개, 10원짜리 1개를 거슬러줄 때 동전과 지폐 개수의 합이 최소가 됩니다.

손님에게 거슬러줘야 하는 금액 money가 매개변수로 주어질 때, 거슬러 주는 동전과 지폐 개수합의 최솟값을 return 하도록 solution 메소드를 작성하려 합니다. 빈칸을 채워 전체 코드를 완성해주세요.

---
#####매개변수 설명
손님에게 거슬러줘야 하는 금액 money가 solution 메소드의 매개변수로 주어집니다.
* money는 10 이상 100,000 이하의 자연수입니다.
* money는 10의 배수로만 주어집니다.

---
#####return 값 설명
거슬러 주는 동전과 지폐 개수합의 최솟값을 return 해주세요.

---
#####예시

| money | return |
|-------|--------|
| 2760  | 7      |

#####예시 설명
2760원을 거슬러주는 방법은 여러 가지가 있지만, 다음과 같이 거슬러 줄 때, 필요한 동전과 지폐 개수가 최소가 됩니다.

* 1,000원 : 2장
* 500원 : 1개
* 100원 : 2개
* 50원 : 1개
* 10원 : 1개

따라서 7을 return 하면 됩니다.

 */
class Solution {
    public int solution(int money) {
        int coin[] = {10, 50, 100, 500, 1000, 5000, 10000, 50000};
        int counter = 0;
        int idx = coin.length - 1;
        while (money > 0){
            counter += money / coin[idx];
            money %= coin[idx];
            idx -= 1;
        }
        return counter;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int money = 2760;
        int ret = sol.solution(money);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}