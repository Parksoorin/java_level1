package 배열6_문제;

import java.util.Arrays;
import java.util.Random;

/*
	[문제]
		1 ~ 45 사이의 랜덤 값 6개를 lotto배열에 저장한다.
		단, 중복되는 숫자는 없어야 한다.
*/

public class 배열6_문제03_로또_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] lotto = new int[6];
		
		// 중복숫자 금지 2단계
		// check배열은 랜덤 숫자의 범위를 따라야 함.(0 ~ 44)
		boolean[] check = new boolean[45];
		for(int i=0; i<6; i++) {
			int r = ran.nextInt(45);
			System.out.println(r);
			if(check[r] == false) {
				check[r] = true;
				lotto[i] = r + 1;
			} else {
				i -= 1;
			}
		}
		System.out.println(Arrays.toString(lotto));
		System.out.println(Arrays.toString(check));
		
		
		/*
		// 2단계 풀이방식
		// 문제. 1 ~ 5사이의 랜덤 숫자 5개를 중복없이 arr배열 저장
		int[] arr = new int[5];
		boolean[] check = new boolean[5];
		for(int i=0; i<5; i++) {
			int r = ran.nextInt(5);
			System.out.println(r);
			if(check[r] == false) {
				check[r] = true;
				arr[i] = r + 1;
			} else {
				// 중복되는 숫자가 나왔을 때
				// i인덱스가 그대로 유지할 수 있도록 하기 위함
				i -= 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(check));
		*/
		
		// 중복숫자 금지 3단계
		lotto = new int[6];
		for(int i=0; i<6; i++) {
			int r = ran.nextInt(45) + 1;
			
			boolean result = false;
			for(int j=0; j<i; j++) {
				if(r == lotto[j]) {
					result = true;
					break;
				}
			}
			
			if(result == false) {
				lotto[i] = r;
			} else {
				i -= 1;
			}
		}
		System.out.println(Arrays.toString(lotto));
		
		/*
		// 3단계 풀이방식
		// 문제. 1 ~ 5사이의 랜덤 숫자 5개를 중복없이 arr배열 저장
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			int r = ran.nextInt(5) + 1;
			boolean result = false;
			for(int j=0; j<i; j++) {
				if(r == arr[j]) {
					result = true;
					break;
				}
			}
			
			if(result == false) {
				arr[i] = r;
			} else {
				i -= 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		*/
		
	}
}





