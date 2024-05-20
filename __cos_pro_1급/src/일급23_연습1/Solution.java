package 일급23_연습1;
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
/*
 

#문제3
체스에서 비숍(Bishop)은 아래 그림과 같이 대각선 방향으로 몇 칸이든 한 번에 이동할 수 있습니다.
 만약, 한 번에 이동 가능한 칸에 체스 말이 놓여있다면 그 체스 말을 잡을 수 있습니다.

![bishop1.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/07fd25eb65/561e9310-6ee3-4ecf-85bd-dd573bdbb8df.png)

8 x 8 크기의 체스판 위에 여러 개의 비숍(Bishop)이 놓여있습니다. 이때, 
비숍(Bishop)들에게 _**한 번에**_ 잡히지 않도록 새로운 말을 놓을 수 있는 빈칸의 개수를 구하려고 합니다.

위 그림에서 원이 그려진 칸은 비숍에게 한 번에 잡히는 칸들이며, 따라서 체스 말을 놓을 수 있는 빈칸 개수는 50개입니다.

8 x 8 체스판에 놓인 비숍의 위치 bishops가 매개변수로 주어질 때, 
비숍에게 한 번에 잡히지 않도록 새로운 체스 말을 놓을 수 있는 빈칸 개수를 return 하도록 solution 메소드를 완성해주세요.

---
#####매개변수 설명
체스판에 놓인 비숍의 위치 bishops가 solution 메소드의 매개변수로 주어집니다.
* bishops는 비숍의 위치가 문자열 형태로 들어있는 배열입니다.
* bishops의 길이는 1 이상 64 이하입니다.
* 비숍이 놓인 위치는 알파벳 대문자와 숫자로 표기합니다.
  * 알파벳 대문자는 가로 방향, 숫자는 세로 방향 좌표를 나타냅니다.
  * 예를 들어 위 그림에서 비숍이 있는 칸은 "D5"라고 표현합니다.
* 한 칸에 여러 비숍이 놓이거나, 잘못된 위치가 주어지는 경우는 없습니다.

---
#####return 값 설명
비숍에게 한 번에 잡히지 않도록 새로운 체스 말을 놓을 수 있는 빈칸의 개수를 return 해주세요.

---
#####예시

| bishops            | return |
|--------------------|--------|
| ["D5"]             | 50     |
| ["D5", "E8", "G2"] | 42     |

#####예시 설명
예시 #1
문제에 나온 예시와 같습니다.

예시 #2

  ![bishop2.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/b635b0d993/71863e6c-1320-4ce1-8b5b-886c37dcfa5b.png)

그림과 같이 원이 그려진 칸은 비숍에게 한 번에 잡히는 칸들이며, 
따라서 체스 말을 놓을 수 있는 빈칸 개수는 42개입니다.

 */
class Solution {
	
	String getPosition(char strX , char strY) {
		 String sampleX = "0ABCDEFGH";
	     String sampleY = "012345678";
	     int x = sampleX.indexOf(strX);
    	 int y = sampleY.indexOf(strY);
    //	 System.out.println(sampleX.charAt(x));
    //	 System.out.println(sampleY.charAt(y));
    	 String temp = sampleX.charAt(x) + "" + sampleY.charAt(y);
    	 return temp;
	}
	
	public int solution(String[] bishops) {
     // 여기에 코드를 작성해주세요.
     int answer = 0;
     
     String sampleX = "0ABCDEFGH";
     String sampleY = "012345678";
     Set<String> setList = new HashSet<String>();    
     for(int i = 0; i < bishops.length; i++) {
    	 String bishop = bishops[i];
    	 char strX = bishop.charAt(0);
    	 char strY = bishop.charAt(1);
    	 //String word = getPosition(strX, strY);
    	 int x = sampleX.indexOf(strX);
    	 int y = sampleY.indexOf(strY);
    	// System.out.println(x + " " + y);
    	 //System.out.println(word);
    	 
    	 int tempX = x;
    	 int tempY = y;
    	 while(true) {
    		 if(tempX > 8 )break;
    		 if(tempY > 8 )break;
    		 if(tempX < 1 )break;
    		 if(tempY < 1 )break;    		 
    		 String tempStr = sampleX.charAt(tempX) + "" + sampleY.charAt(tempY);
    		// System.out.println(tempStr);
    		 setList.add(tempStr);
    		 tempX -= 1;
    		 tempY -= 1;
    	 }
    	 
    	 tempX = x;
    	 tempY = y;
    	 while(true) {
    		 if(tempX > 8 )break;
    		 if(tempY > 8 )break;
    		 if(tempX < 1 )break;
    		 if(tempY < 1 )break;    		 
    		 String tempStr = sampleX.charAt(tempX) + "" + sampleY.charAt(tempY);
    	//	 System.out.println(tempStr);
    		 setList.add(tempStr);
    		 tempX -= 1;
    		 tempY += 1;
    	 }
    	 
    	 tempX = x;
    	  tempY = y;
    	 while(true) {
    		 if(tempX > 8 )break;
    		 if(tempY > 8 )break;
    		 if(tempX < 1 )break;
    		 if(tempY < 1 )break;    		 
    		 String tempStr = sampleX.charAt(tempX) + "" + sampleY.charAt(tempY);
    	//	 System.out.println(tempStr);
    		 setList.add(tempStr);
    		 tempX += 1;
    		 tempY -= 1;
    	 }
    	 
    	 tempX = x;
    	  tempY = y;
    	 while(true) {
    		 if(tempX > 8 )break;
    		 if(tempY > 8 )break;
    		 if(tempX < 1 )break;
    		 if(tempY < 1 )break;    		 
    		 String tempStr = sampleX.charAt(tempX) + "" + sampleY.charAt(tempY);
    	//	 System.out.println(tempStr);
    		 setList.add(tempStr);
    		 tempX += 1;
    		 tempY += 1;
    	 }  	 
     }
     for(String v :setList) {
		 //System.out.println(v);
	 }
     //System.out.println(64 - setList.size());
     
     return 64 - setList.size();
 }

 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
     Solution sol = new Solution();
     String[] bishops1 = {new String("D5")};
     int ret1 = sol.solution(bishops1);
     
     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

     String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
     int ret2 = sol.solution(bishops2);
     
     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
 }
}