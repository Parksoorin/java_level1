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

public class 클래스배열2_문제02_과목2_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		String studentSample = "1001/이만수\n";
		studentSample += "1002/김철만\n";		
		studentSample += "1003/오수정\n";
		
		String subjectSample = "";
		subjectSample += "1001/국어/100/0\n";
		subjectSample += "1001/수학/32/0\n";
		subjectSample += "1002/국어/23/0\n";
		subjectSample += "1002/수학/35/0\n";
		subjectSample += "1002/영어/46/0\n";
		subjectSample += "1003/수학/60/0";	
		
		//문제1) 위 샘플 문자열들을 각각 해당 클래스 배열에 저장 후 출력
		String[] temp = studentSample.split("\n");
		int stSize = temp.length;
		Student[] stList = new Student[stSize];
		for(int i=0; i<stSize; i++) {
			stList[i] = new Student();
			
			String[] info = temp[i].split("/");
			stList[i].number = Integer.parseInt(info[0]);
			stList[i].name = info[1];
		}
		System.out.println("[번호]\t[이름]");
		for(int i=0; i<stSize; i++) {
			System.out.println(stList[i].number + "\t" + stList[i].name);
		}
		System.out.println();
		
		temp = subjectSample.split("\n");
		int subSize = temp.length;
		Subject[] subList = new Subject[subSize];
		for(int i=0; i<subSize; i++) {
			subList[i] = new Subject();
			
			String[] info = temp[i].split("/");
			subList[i].studentNumber = Integer.parseInt(info[0]);
			subList[i].subject = info[1];
			subList[i].score = Integer.parseInt(info[2]);
			subList[i].rank = Integer.parseInt(info[3]);
		}
		System.out.println("[번호]\t[과목]\t[성적]\t[랭킹]");
		for(int i=0; i<subSize; i++) {
			System.out.print(subList[i].studentNumber + "\t" + subList[i].subject + "\t");
			System.out.println(subList[i].score + "\t" + subList[i].rank + "\t");
		}
		System.out.println();
		
		
		//문제2) 점수가 59점 이하인 과목은 전부 삭제 후 다시 문자열로 저장 후 출력 
		while(true) {
			int index = -1;
			
			for(int i=0; i<subSize; i++) {
				if(subList[i].score <= 59) {
					index = i;
					break;
				}
			}
			
			if(index == -1) {
				break;
			} else {
				for(int i=index; i<subSize - 1; i++) {
					subList[i] = subList[i + 1];
				}
				subSize -= 1;
			}
		}
		subjectSample = "";
		for(int i=0; i<subSize; i++) {
			subjectSample += subList[i].studentNumber + "/";
			subjectSample += subList[i].subject + "/";
			subjectSample += subList[i].score + "/";
			subjectSample += subList[i].rank + "\n";
		}
		subjectSample = subjectSample.substring(0, subjectSample.length() - 1);
		System.out.println(subjectSample);
		
		scan.close();
	}
}
