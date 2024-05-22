package 배열2_문제;

import java.util.Random;

/*
	[문제]
		10회 반복을 하면서 1~50의 랜덤값을 출력한다.
		랜덤값이 배열에 있으면 해당 위치를 출력하고,
		랜덤값이 배열에 없으면 "없다"를 출력하시오.
	[예시]
		43 ==> y : 0, x : 1
		45 ==> 없다.
		21 ==> y : 1, x : 4
		28 ==> y : 4, x : 2
		2 ==> y : 0, x : 2
		20 ==> 없다.
		6 ==> y : 2, x : 4
		29 ==> 없다.
		19 ==> y : 4, x : 0
		25 ==> 없다.		
*/

public class 배열2_문제10_위치맞추기_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[][] darr = {
			{1, 43, 2, 5,41},
			{11,13,23,14,21},
			{34,12,17,22, 6},
			{18,47, 4, 3, 7},
			{19,48,28,15, 46},
		};
		
		for(int i=0; i<10; i++) {
			int r = ran.nextInt(50) + 1;
			System.out.print(r + " ==> ");
			
			boolean check = false;
			for(int j=0; j<darr.length; j++) {
				for(int k=0; k<darr[j].length; k++) {
					if(r == darr[j][k]) {
						System.out.println("y = " + j + ", x = " + k);
						check = true;
					}
				}
			} 
			
			if(check == false) {
				System.out.println("없다.");
			}
			
		}
		
		
		
	}
}
