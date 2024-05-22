package 배열2_문제;

/*
	[문제]
		yList의 값들은 data의 세로 인덱스를 의미한다.
		yList의 값들이 가리키는 세로줄을 출력하시오.
	[정답]
		yList[0] = 1 : 0 0 2 1 4 1 1 
		yList[1] = 3 : 0 0 0 0 0 0 3 
		yList[2] = 2 : 0 0 0 3 2 4 4 
		yList[3] = 2 : 0 0 0 3 2 4 4 
		yList[4] = 0 : 0 0 0 3 1 4 2 
		yList[5] = 1 : 0 0 2 1 4 1 1 
*/

public class 배열2_문제07_세로출력_정답 {
	public static void main(String[] args) {
	
		int[][] data = {
			{0,0,0,0,0},
			{0,0,0,0,3},
			{0,2,0,0,3},
			{3,1,3,0,1},
			{1,4,2,0,2},
			{4,1,4,0,4},
			{2,1,4,3,3},
		};		
		
		int[] yList = {1,3,2,2,0,1};
		
		/*
			data[j][yList[i]]
			
			i = 0
				j = 0	data[0][1]
				j = 1	data[1][1]
				...
				j = 6	data[6][1]
		 */
		
		for(int i=0; i<yList.length; i++) {
			for(int j=0; j<data.length; j++) {
				System.out.print(data[j][yList[i]] + " ");
			}
			System.out.println();
		}
		
	}
}
