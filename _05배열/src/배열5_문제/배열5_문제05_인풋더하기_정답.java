package 배열5_문제;

/*
	[문제]
		민수는 학교에서 산수시험을 봤다. 
		arr1의 숫자와 arr2의 숫자의 합을 구하는 시험이다.
		input배열은 민수가 작성한 답이다. 
		민수는 답을 순차적으로 적지 않고 뒤섞여서 적었다.
		위 더하기문제의 답을 답안지에서 찾아서 민수는 몇문제 맞췄는지 출력하시오.
	[정답] 
		4  
*/


public class 배열5_문제05_인풋더하기_정답 {
	public static void main(String[] args) {
		
		int[] arr1 = {4, 65, 23, 1, 45, 7};
		int[] arr2 = {61, 2, 54, 3, 5, 6};
		
		// 정답     = {65, 67, ....}
		
		int[] input = {67, 13, 2, 22, 65, 4};
		
		int count = 0;
		for(int i=0; i<input.length; i++) {
			int total = arr1[i] + arr2[i];
			
			for(int j=0; j<input.length; j++) {
				if(total == input[j]) {
					count += 1;
				}
			}
		}
		System.out.println(count);
		
	}
}
