package 배열0_개념;

public class 배열_개념17_이차원배열삭제 {
	public static void main(String[] args) {
		
		int[][] arr = {
			{ 1001, 1234, 1111 },
			{ 1002, 2345, 2222 },
			{ 1003, 3456, 3333 },
			{ 1004, 4567, 4444 }
		};
		
		int count = 4;
		int index = 2;
		for(int i=index; i<count - 1; i++) {
			arr[i] = arr[i + 1];
		}
		count -= 1;
		
	}
}
