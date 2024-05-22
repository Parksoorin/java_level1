package 메서드클래스배열4_개념;

import java.util.Random;

class RanNum{
	int num;
	boolean check;		// false
	
	void print() {
		System.out.println(num + " ");
	}
}
public class 메서드클래스배열4_개념03_중복숫자 {
	public static void main(String[] args) {
		
		// 문제) RanNum 클래스를 활용해서 중복숫자금지 출력 
		//      num에 1~5사이숫자를 랜덤으로 저장한다. (조건 중복숫자금지)
		
		Random ran = new Random();
		
		RanNum[] ranList = new RanNum[5];
		
		for(int i=0; i<ranList.length; i++) {
			ranList[i] = new RanNum();
		}
		
		for(int i=0; i<ranList.length; i++) {
			int rNum = ran.nextInt(5);
			
			if(ranList[rNum].check == false) {
				ranList[rNum].num = i + 1;
				ranList[rNum].check = true;
			} else {
				i -= 1;
			}
		}
		
		for(int i=0; i<ranList.length; i++) {
			ranList[i].print();
		}
		
	}
}