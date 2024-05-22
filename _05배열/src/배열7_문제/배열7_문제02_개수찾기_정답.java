package 배열7_문제;

import java.util.Arrays;

/*
	[문제]
		가장 많이 들어있는 숫자의 개수와
		가장 적게 들어있는 숫자의 개수를 합한 값을 출력하시오.
	[정답]
		100 : 1개
		3   : 5개
		정답 : 6
*/

public class 배열7_문제02_개수찾기_정답 {
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2 };	
		
		// 방법1
		/*
			1. arr배열에서 가장 큰 수 검색 : 100
			2. 1번에서 구한 숫자+1의 크기만큼 배열을 생성
				int[] temp = int[101];
			3. arr배열의 요소의 위치와 temp배열의 인덱스 위치가
			   같을 때마다 temp배열의 값을 1씩 증가
			           0  1  2  3         , 100
			   temp = [0, 2, 3, 5, 0, ....,  1]
			4. temp배열에서 최대값은 개수가 가장 많은 수이고,
			   temp배열에서 최소값은 개수가 가장 적은 수
		 */
		int max = 0;
		int maxCount = 0;
		
		int min = 0;
		int minCount = 100;
		
		int maxNum = 100;
		int[] temp = new int[maxNum + 1];
		for(int i=0; i<arr.length; i++) {
			temp[arr[i]] += 1;
		}
		System.out.println(Arrays.toString(temp));
		
		for(int i=0; i<temp.length; i++) {
			if(maxCount < temp[i]) {
				maxCount = temp[i];
				max = i;
			}
			if(temp[i] != 0 && minCount > temp[i]) {
				minCount = temp[i];
				min = i;
			}
		}
		System.out.println(max + " : " + maxCount + "개");
		System.out.println(min + " : " + minCount + "개");
		
		int answer = maxCount + minCount;
		System.out.println("정답 = " + answer);
		
		// 방법2
		/*
			1. arr배열에서 중복을 제외한 요소의 개수 구하기 : 4개
			2. 1번에서 구한 방의 길이만큼 배열을 생성
				int[] temp = new int[4];
			3. 2번에서 생성한 배열에 중복을 제거한 arr요소 저장하기
				temp = [1, 2, 3, 100]
			4. 1번에서 구한 방의 길이만큼 배열을 생성(개수 저장 용도)
				int[] countList = new int[4];
			5. 4번에서 생성한 배열에 arr배열의 각 요소의 개수를 누적 저장
				countList = [2, 3, 5, 1]
		 */
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			
			boolean check = false;
			for(int j=0; j<i; j++) {
				if(i != j && arr[i] == arr[j]) {
					check = true;
					break;
				}
			}
			
			if(check == false) {
				count += 1;
			}
		}
		System.out.println(count);
		
		temp = new int[count];
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			
			boolean check = false;
			for(int j=0; j<i; j++) {
				if(temp[j] == arr[i]) {
					check = true;
					break;
				}
			}
			
			if(check == false) {
				temp[index] = arr[i];
				index += 1;
			} 
		}
		System.out.println(Arrays.toString(temp));
		
		int[] countList = new int[count];
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<temp.length; j++) {
				if(arr[i] == temp[j]) {
					countList[j] += 1;
				}
			}
		}
		System.out.println(Arrays.toString(countList));
		
		max = 0;
		maxCount = 0;
		
		min = 0;
		minCount = 100;
		for(int i=0; i<countList.length; i++) {
			if(maxCount < countList[i]) {
				maxCount = countList[i];
				max = temp[i];
			}
			if(minCount > countList[i]) {
				minCount = countList[i];
				min = temp[i];
			}
		}
		
		System.out.println(max + " : " + maxCount + "개");
		System.out.println(min + " : " + minCount + "개");
		
		answer = maxCount + minCount;
		System.out.println("정답 = " + answer);
		
	}
}
