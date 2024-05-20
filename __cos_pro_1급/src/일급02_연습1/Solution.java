package 일급02_연습1;
import java.util.*;
/*
	다음과 같이 n x n 크기의 격자에 1부터 n x n까지의 수가 하나씩 있습니다.
	![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC1_qysbr6.png)
	이때 수가 다음과 같은 순서로 배치되어있다면 이것을 n-소용돌이 수라고 부릅니다.
	![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC2_ol8snc.png)
	소용돌이 수에서 1행 1열부터 n 행 n 열까지 대각선상에 존재하는 수들의 합을 구해야 합니다.
	![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC3_cbcdg3.png)
	위의 예에서 대각선상에 존재하는 수의 합은 15입니다.
	격자의 크기 n이 주어질 때 n-소용돌이 수의 대각선상에 존재하는 수들의 합을 return 하도록 solution 메소드를 완성해주세요.
	---
	##### 매개변수 설명
	격자의 크기 n이 solution 메소드의 매개변수로 주어집니다.
	* n은 1 이상 100 이하의 자연수입니다.
	---
	##### return 값 설명
	n-소용돌이 수의 대각선상에 존재하는 수들의 합을 return 해주세요.
	---
	##### 예시
	
	| n 	| return 	|
	|---	|--------	|
	| 3 	| 15     	|
	| 2 	| 4      	|	
	##### 예시 설명
	예시 #1
	문제의 예와 같습니다.
	예시 #2
	![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC4_astq7q.png)
	1과 3을 더하여 4가 됩니다.
 */
class Solution {
 public int solution(int n) {
     int answer = 0;
     int arr[][] = new int[n][n];
     int num = 1;
     int y = 0;
     int x = 0;
     int dir = 0;
     arr[y][x] = num;
     int max = n * n - 1;
     int i = 0;
     while(i < max) {
    	 int tempX = x;
    	 int tempY = y;
    	 if(dir == 0) {
    		 tempX += 1;
    	 }
    	 if(dir == 1) {
    		 tempY += 1;
    	 }
    	 if(dir == 2) {
    		 tempX -= 1;
    	 }
    	 if(dir == 3) {
    		 tempY -= 1;
    	 }
    	 
    	 if(tempX < 0 || tempY < 0 || tempX >= n || tempY >= n) {	
    		 dir += 1;
        	 if(dir >= 4) {
        		 dir = 0;
        	 }
    		 continue;
    	 }
    	 if(arr[tempY][tempX] != 0) {
    		 dir += 1;
        	 if(dir >= 4) {
        		 dir = 0;
        	 }
    		 continue;
    	 }    	 
    	 y = tempY;
    	 x = tempX;
    	 num += 1;
    	 arr[y][x] = num;
    	 i += 1;
     }
     /*
     for( i = 0; i < arr.length; i++) {
    	 System.out.println(Arrays.toString(arr[i]));
     }
     */
     for( i = 0; i < n; i++) {
    	 answer += arr[i][i];
     }
     return answer;
 }

 public static void main(String[] args) {
     Solution sol = new Solution();
     int n1 = 3;
     int ret1 = sol.solution(n1);   
     System.out.println( + ret1 );
     
     int n2 = 2;
     int ret2 = sol.solution(n2);   
     System.out.println(ret2);
 }
}