package 배열3_문제;

import java.util.Arrays;
import java.util.Random;

/*
	[문제]
		복권 1개 당 7칸으로, 총 5개의 복권을 제작하려 한다.
		복권 1줄은 1 또는 7의 랜덤 숫자로 구성되어 있다.
		7이 연속으로 3개이상이면 "당첨"이고, 그 미만은 "꽝" 이다.
		5개 중에 딱 1개만 당첨 복권이고 나머지 4개는 꽝인 복권을
		랜덤으로 생성해서 출력하시오.
	[예시]
		1177117 (꽝)
		1117771 (당첨)
		7171117 (꽝)
		7711771 (꽝)
		7171717 (꽝)
*/

public class 배열3_문제05_복권제작_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[][] lottoSet = new int[5][7];
		
		boolean mark = false;
		for(int i=0; i<5; i++) {
			boolean check = false;
			int count = 0;
			for(int j=0; j<7; j++) {
				int r = ran.nextInt(2);
				if(r == 0) {
					lottoSet[i][j] = 1;
					count = 0;
				} else {
					lottoSet[i][j] = 7;
					count += 1;
					if(count == 3) {
						check = true;
					}
				}
			}
			
			// 당첨 복권이 처음 나왔으면,
			if(check == true && mark == false) {
				mark = true;
			}
			// 당첨 복권이 두 번째로 나오면,
			else if(check == true && mark == true) {
				i -= 1;
			}
			
			// 당첨 복권이 한번도 X
			if(i == 4 && mark == false) {
				// 리셋
				i = -1;
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(Arrays.toString(lottoSet[i]));
			
			boolean check = false;
			int count = 0;
			for(int j=0; j<7; j++) {
				if(lottoSet[i][j] == 7) {
					count += 1;
				} else {
					count = 0;
				}
				if(count == 3) {
					check = true;
				}
			}
			if(check) {
				System.out.println("(당첨)");
			} else {
				System.out.println("(꽝)");
			}
		}
		
	}
}
