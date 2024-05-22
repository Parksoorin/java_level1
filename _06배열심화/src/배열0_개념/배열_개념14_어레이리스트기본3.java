package 배열0_개념;

import java.util.ArrayList;

/*
	어레이리스트(정수형)	 	
	[1] 어레이리스트에서는 기존의 int는 사용할 수 없다.
	[2] Integer로 변수를 선언해야한다. 
	[3] 선언만 Integer로 하고 나머지는 똑같다. 
*/

public class 배열_개념14_어레이리스트기본3 {
	public static void main(String[] args) {
		
		// int는 사용할 수 없고 Integer로 바꿔줘야한다. 
		// ArrayList<int> list = new ArrayList<int>();
		ArrayList<Integer> list = new ArrayList<Integer>();
				
		//추가 
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		//삭제
		list.remove(1);  // 20이 삭제된것이다.
		
		//수정
		list.set(2, 100); 
		// 인덱스2면 10,30,40 에서 40을 뜻한다. 
		// 40이 100으로 바뀐것이다. 
		
		System.out.println("------------------");
		//출력 
		for(int i = 0; i < list.size(); i++) {
			int temp = list.get(i);  
			System.out.println(temp);
		}
		System.out.println("------------------");
		
	}
}
