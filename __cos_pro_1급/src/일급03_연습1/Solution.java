package 일급03_연습1;
import java.util.*;
/*
 * 
	#문제3
	체스에서 나이트(knight)는 아래 그림과 같이 동그라미로 표시된 8개의 방향중 한 곳으로 한 번에 이동이 가능합니다.
	
	![image](https://s3.ap-northeast-2.amazonaws.com/grepp-cloudfront/programmers_imgs/challengeable-imgs/20180315_knight.png)
	
	단, 나이트는 체스판 밖으로는 이동할 수 없습니다.
	
	체스판의 각 칸의 위치는 다음과 같이 표기합니다.
	![image](https://s3.ap-northeast-2.amazonaws.com/grepp-cloudfront/programmers_imgs/challengeable-imgs/20180315_knight2.png)
	예를 들어, A번줄과 1번줄이 겹치는 부분은 'A1'이라고 합니다.
	
	나이트의 위치 pos가 매개변수로 주어질 때, 나이트를 한 번 움직여서 이동할 수 있는 칸은 몇개인지 return 하도록 solution 메소드를 완성해주세요.
	
	---
	
	#####매개변수 설명
	나이트의 위치 pos가 solution 메소드의 매개변수로 주어집니다.
	* pos는 A부터 H까지의 대문자 알파벳 하나와 1 이상 8이하의 정수 하나로 이루어진 두 글자 문자열입니다.
	* 잘못된 위치가 주어지는 경우는 없습니다.
	
	---
	
	#####return 값 설명
	나이트를 한 번 움직여서 이동할 수 있는 칸의 개수를 return 해주세요.
	
	---
	#####예시
	
	| pos  | return |
	|------|--------|
	| "A7" | 3      |
	
	#####예시 설명
	나이트가 A7 위치에 있으면 아래 그림과 같이 왼쪽으로는 이동하지 못하고, 오른쪽으로는 맨 위를 제외한 나머지 세 칸으로 이동 가능합니다. 
	![image](https://s3.ap-northeast-2.amazonaws.com/grepp-cloudfront/programmers_imgs/challengeable-imgs/20180315_knight3.png)
	따라서, 3을 return 하면 됩니다.

 */
class Solution {
	public boolean isCheck(int x , int y) {
		if(x < 1 || y < 1 || x >= 9 || y >= 9) {
			return false;
		}
		return true;
	}
	
 public int solution(String pos) {
     int answer = 0;
     
     String sx = pos.charAt(1) + "";
     int x = Integer.parseInt(sx);
     
     int y = 0;
     char charY = pos.charAt(0);
     String sample = "ABCDEFGH";
     for(int i = 0; i < sample.length(); i++) {
    	 if(sample.charAt(i) == charY) {
    		 y = i + 1;
    	 }
     }
     if(isCheck(x+1, y+2)) {
    	 answer += 1;
     }
     if(isCheck(x+1, y-2)) {
    	 answer += 1;
     }
     if(isCheck(x+2, y+1)) {
    	 answer += 1;
     }
     if(isCheck(x+2 ,y-1)) {
    	 answer += 1;
     }
     if(isCheck(x-1, y+2)) {
    	 answer += 1;
     }
     if(isCheck(x-1, y-2)) {
    	 answer += 1;
     }
     if(isCheck(x-2, y+1)) {
    	 answer += 1;
     }
     if(isCheck(x-2, y-1)) {
    	 answer += 1;
     }
     return answer;
 }

 public static void main(String[] args) {
     Solution sol = new Solution();
     String pos = "A7";
     int ret = sol.solution(pos);

     System.out.println(ret );
 }
}