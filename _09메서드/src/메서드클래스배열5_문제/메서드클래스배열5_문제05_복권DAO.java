package 메서드클래스배열5_문제;

import java.util.Random;

class Lotto {
	int[] data = new int[8];
	boolean win = false;
	void print() {
		for (int i = 0; i < 8; i++) {
			System.out.print(data[i]);
		}
		System.out.println();
	}
}

class LottoDAO{
	Random ran = new Random();
	Lotto[] lottoList = new Lotto[5];
	void shuffle() {
		for(int i = 0; i < 1000; i++) {
			int r = ran.nextInt(5);
			Lotto temp = lottoList[0];
			lottoList[0] = lottoList[r];
			lottoList[r] = temp;
		}
		
	}
	void printList() {
		for(int i = 0; i < 5; i++) {
			lottoList[i].print();
		}
	}
	void run() {
		boolean check = false;
		int n = 0;
		while (n < 5) {
			lottoList[n] = new Lotto();
			for (int i = 0; i < 8; i++) {
				int r = ran.nextInt(2);
				if (r == 0) {
					lottoList[n].data[i] = 1;
				} else {
					lottoList[n].data[i] = 7;
				}
			}
			int count = 0;
			for (int i = 0; i < 8; i++) {
				if (lottoList[n].data[i] == 7) {
					count += 1;
					if (count == 3) {
						lottoList[n].win = true;
						break;
					}
				} else {
					count = 0;
				}
			}
			if (check == false && lottoList[n].win == true) {
				check = true;			
				n += 1;
			} else if (check == true && lottoList[n].win == false) {			
				n += 1;
			}
		}
		
		shuffle();
		printList();
	}
}

public class 메서드클래스배열5_문제05_복권DAO {
	public static void main(String[] args) {
		
		// 1. 8칸짜리 복권이 있다.
		// 2. 1이나 7을 랜덤으로 8칸에 저장한다. 
		// 3. 7이 연속으로 3개면 당첨 복권이다. 
		// 4. 복권 5매를 제작할려고 한다.
		// 5. 단! 1개는 당첨이고 4개는 꽝으로 제작 
	
		
		LottoDAO list = new LottoDAO();
		list.run();
		
	}
}
