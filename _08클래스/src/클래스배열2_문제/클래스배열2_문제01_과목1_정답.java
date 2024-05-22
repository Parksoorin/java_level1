package 클래스배열2_문제;

import java.util.Scanner;

/*
class Student{
	int number;
	String name;
}

class Subject{
	int studentNumber;
	String subject;
	int score;
	int rank;
}
*/

public class 클래스배열2_문제01_과목1_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numberList = {1001, 1002, 1003};
		String[] nameList = {"이만수", "김철만", "오수정"};
		
		int[] studentNumberList = {1001, 1001, 1002, 1002, 1002, 1003};
		String[] subjectList = {"국어", "수학", "국어", "수학", "영어", "수학"};
		int[] scoreList = {100, 32, 23, 35, 46, 60};
		int[] rankList = {0, 0, 0, 0, 0, 0};
		
		int stSize = numberList.length;
		Student[] stList = new Student[stSize];
		for(int i = 0; i < stSize; i++) {
			stList[i] = new Student();
			stList[i].number = numberList[i];
			stList[i].name = nameList[i];
		}
		
		int subSize = studentNumberList.length;
		Subject[] subList = new Subject[subSize];
		for(int i =0; i < subSize; i++) {
			subList[i] = new Subject();
			subList[i].studentNumber = studentNumberList[i];
			subList[i].subject = subjectList[i];
			subList[i].score = scoreList[i];
			subList[i].rank = rankList[i];
		}	
		
		//------------------------------------------------------------------
		
		while(true) {
			System.out.println("[0] 종료 ");
			System.out.println("[1] 학생 정보 출력 ");
			System.out.println("[2] 과목 정보 출력 ");
			System.out.println("[3] 과목별 랭킹 저장 ");
			System.out.println("[4] 과목별 랭킹 1등의 이름 과목 점수 출력 ");
			
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) {	
				System.out.println("[번호]\t[이름]");
				for(int i=0; i<stSize; i++) {
					System.out.println(stList[i].number + "\t" + stList[i].name);
				}
			}else if(sel == 2) {
				System.out.println("[번호]\t[과목]\t[성적]\t[석차]");
				for(int i=0; i<subSize; i++) {
					System.out.print(subList[i].studentNumber + "\t" + subList[i].subject + "\t");
					System.out.println(subList[i].score + "\t" + subList[i].rank);
				}
			}else if(sel == 3) {
				for(int i=0; i<subSize; i++) {
					int rank = 1;
					for(int j=0; j<subSize; j++) {
						if(subList[i].subject.equals(subList[j].subject)) {
							if(subList[i].score < subList[j].score) {
								rank += 1;
							}
						}
					}
					
					subList[i].rank = rank;
				}
			}else if(sel == 4) {
				System.out.println("[번호]\t[과목]\t[성적]\t[석차]\t[이름]");
				for(int i=0; i<stSize; i++) {
					for(int j=0; j<subSize; j++) {
						if(stList[i].number == subList[j].studentNumber) {
							if(subList[j].rank == 1) {
								System.out.print(subList[j].studentNumber + "\t" + subList[j].subject + "\t");
								System.out.println(subList[j].score + "\t" + subList[j].rank + "\t" + stList[i].name);
							}
						}
					}
				}
			}
		}
		
		scan.close();
		
	}
}