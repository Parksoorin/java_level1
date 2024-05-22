package 메서드클래스배열5_문제;

import java.util.Random;

class Card{
	String shape;
	int number;
	void printCard() {
		String data = shape + " : " + number;
		System.out.printf("%-10s", data);
		System.out.println();
	}
}
class CardPlayer{
	Card card1;
	Card card2;
	int money = 1000;
}
class CardDAO{
	
	Random ran = new Random();
	CardPlayer aaa = new CardPlayer();
	CardPlayer bbb = new CardPlayer();
	String shapeList[] = {"다이아" , "하트" , "스페이드" , "클로버"};
	int size= 40;
	Card deck[] = new Card[size];
	
	void setting() {
		for(int i = 0; i <size; i++) {
			deck[i] = new Card();
			deck[i].shape = shapeList[i/10];
			deck[i].number = i % 10 + 1;
		}		
		
		for(int i = 0; i < 40; i++) {
			deck[i].printCard();
		}
	}
	
	void shuffle() {
		for(int i = 0; i < 1000; i++) {
			int r = ran.nextInt(size);
			Card temp = deck[0];
			deck[0] = deck[r];
			deck[r] = temp;
		}
	}
	
	void run() {
		setting();
		shuffle();
		// 셔플		
		System.out.println("[게임시작]");
		aaa.card1 = deck[0];
		aaa.card2 = deck[1];	
		bbb.card1 = deck[2];
		bbb.card2 = deck[3];
		aaa.card1.printCard();
		aaa.card2.printCard();	
		bbb.card1.printCard();
		bbb.card2.printCard();		
	}
}

public class 메서드클래스배열5_문제04_카드게임DAO {
	public static void main(String[] args) {
		
		// 카드게임 
		// 1) 카드모양 : 다이아 , 하트 , 스페이드 , 클로버
		// 2) 숫자      :  1~10
		// 3) 총 40장이 있다. 
		// 4) 플레이어는 매게임 40장에서 2장씩 나눠갖은 다음 ,
		//    각 카드의 점수가 큰쪽이 이긴다. 
		
		//  [점수계산법] 숫자와 모양의 점수의 합이 큰쪽이 이긴다.
		//    숫자는 1~10 점이다. 
		//    모양은 다이아 , 하트 , 스페이드 , 클로버
		//    순서대로  1,2,3,4 점이다.
		// 예) 플레이어1 [다이아 4] ==> 1 + 4 ==> 5점
		// 예) 플레이어2 [스페이드 1] ==> 3 + 1 ==> 4점 
		//  플레이어1 승리 

		CardDAO cardDAO = new CardDAO();
		cardDAO.run();
		
	}
}
