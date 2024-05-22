package 배열9_문제;

/*
	[문제]
		input배열의 데이터를 순차적으로 arr에 저장하는데,
		만약 저장하려는 수와 그 앞의 수가 서로 같으면 합친다. (계속 중첩 적용)
		마지막 arr의 값을 출력하시오.
			8 :: arr = {8}
			4 :: arr = {8, 4}
			2 :: arr = {8, 4, 2}
			2 :: arr = {8, 4, 4} => {8, 8} => {16}  
			4 :: arr = {16, 4}
			4 :: arr = {16, 8}  
			8 :: arr = {16, 16} => {32}
	[정답]
		arr = {32, 0, 0, 0, 0, 0, 0}
*/

public class 배열9_문제02_같은수합치기_문제 {
	public static void main(String[] args) {
		
		int[] input = {8, 4, 2, 2, 4, 4, 8};
		int[] arr = new int[input.length];
		
	}
}
