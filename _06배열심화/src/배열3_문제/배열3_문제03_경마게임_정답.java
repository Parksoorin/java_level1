package 배열3_문제;

import java.util.Arrays;
import java.util.Random;

/*
	[문제]
		말 다섯 마리가 20개의 트랙을 달린다.
		매 회 랜덤으로 1~4칸의 거리를 이동할 수 있다.
		다섯 말이 모두 도착하면 게임은 끝난다.
		각 말들의 순위를 출력하시오.
		단, 말이 동시에 도착하면 등수는 같다.
*/

public class 배열3_문제03_경마게임_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int horseCount = 5;
		int raceCount = 20;
		
		int[][] horse = new int[horseCount][raceCount];
		int[] total = new int[horseCount];
		
		for(int i=0; i<raceCount; i++) {
			for(int j=0; j<horseCount; j++) {
				if(total[j] <= raceCount - 1) {
					horse[j][i] = ran.nextInt(4) + 1;
					total[j] += horse[j][i];
				}
			}
		}
		for(int i=0; i<horseCount; i++) {
			System.out.println(Arrays.toString(horse[i]));
		}
		
		int[] rankList = new int[horseCount];
		int[][] printRace = new int[horseCount][raceCount];
		int[] printTotal = new int[horseCount];
		
		int rank = 1;
		for(int i=0; i<raceCount; i++) {
			
			int exit = 0;
			int count = 0;
			boolean check = false;
			for(int j=0; j<horseCount; j++) {
				
				if(rankList[j] > 0) {
					printRace[j][19] = 1;
					exit += 1;
					continue;
				}
				
				if(printTotal[j] + horse[j][i] >= raceCount - 1 && check == false) {
					rankList[j] = rank++;
					check = true;
					printTotal[j] = 19;
					printRace[j][19] = 1;
					exit += 1;
				} else if(printTotal[j] + horse[j][i] >= raceCount - 1 && check == true) {
					rankList[j] = rank - 1;
					count += 1;
					printTotal[j] = 19;
					printRace[j][19] = 1;
					exit += 1;
				} else {
					printTotal[j] += horse[j][i];
					printRace[j][printTotal[j]] = 1;
				}
			}
			rank += count;
			
			if(exit == horseCount) {
				
				for(int j=0; j<horseCount; j++) {
					for(int k=0; k<raceCount; k++) {
						if(printRace[j][k] == 1) {
							System.out.print("[말]");
						} else {
							System.out.print("[ ]");
						}
					}
					System.out.println("[" + rankList[j] + "]");
				} 
				System.out.println();
				
				break;
			}
			
			System.out.println("exit = " + exit);
			System.out.println(Arrays.toString(rankList));
			for(int j=0; j<horseCount; j++) {
				for(int k=0; k<raceCount; k++) {
					if(printRace[j][k] == 1) {
						System.out.print("[말]");
					} else {
						System.out.print("[ ]");
					}
				}
				System.out.println();
			} 
			System.out.println();
			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
			for(int j=0; j<horseCount; j++) {
				printRace[j][printTotal[j]] = 0;
			}
			
			
		}
		
		
	}
}
