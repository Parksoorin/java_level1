package 배열3_문제;

/*
	1. machine 배열은 인형뽑기 기계의 데이터이다. (7 x 5)
	2. 인형의 번호는 다음과 같다.
		[1 : 호랑이] [2 : 곰] [3 : 사자] [4 : 기린]
		1) 숫자 0은 비어있는 곳을 의미한다.
		2) 숫자 0이 아닌 곳은 인형이 있는 것을 뜻하고 숫자는 인형번호이다.
		3) input의 데이터는 오늘 손님들이 인형을 선택한 인덱스번호이다.
		4) 세로 단위로 한 라인이고, 인덱스 번호는 가로로 선택이 된다.
		   즉, 0 ~ 4번까지 가능하다.
		5) 인형은 각 라인별 맨 위에서부터 뽑히게 된다.
		   예) input의 값이 1일 때, [2, 1, 4, 1, 1] 라인에 해당하고, 
		   	   인형이 선택되어 맨 위의 2는 0이 된다.
		6) 만약에 전부 값이 0인 라인을 선택하게 되면, "꽝"을 출력한다.
		7) 오늘 판매된 인형의 이름을 출력하시오.
	[정답]
		1 ==> [2:곰]
		0 ==> [3:사자]
		0 ==> [1:호랑이]
		3 ==> [3:사자]
		3 ==> [0:꽝]
		4 ==> [3:사자]
		4 ==> [3:사자]
 */

public class 배열3_문제08_인형뽑기_정답 {
	public static void main(String[] args) {
		
		int[][] machine = {
				{0,0,0,0,0},
				{0,0,0,0,3},
				{0,2,0,0,3},
				{3,1,3,0,1},
				{1,4,2,0,2},
				{4,1,4,0,4},
				{2,1,4,3,3}
			};
			
			String[] nameList = {"호랑이", "곰", "사자", "기린"};
			int[] input = {1,0,0,3,3,4,4};		
			
			for(int i=0; i<input.length; i++) {
				int check = -1;
				for(int j=0; j<machine.length; j++) {
					if(machine[j][input[i]] > 0) {
						check = j;
						break;
					}
				}
				
				if(check == -1) {
					System.out.println("꽝");
				} else {
					int index = machine[check][input[i]];
					System.out.println(nameList[index - 1]);
					machine[check][input[i]] = 0;
				}
			}	
		
	}
}
