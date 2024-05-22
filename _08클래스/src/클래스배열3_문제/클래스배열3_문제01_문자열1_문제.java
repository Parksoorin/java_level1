package 클래스배열3_문제;

class Student{
	String name;
	int score;
}

public class 클래스배열3_문제01_문자열1_문제 {
	public static void main(String[] args) {
		
		String data = ""; 
		data +="김영희/30\n";
		data += "이만수/40\n";
		data += "이철민/60";
		System.out.println(data);

		Student[] studentList = null;
		
		//문제1) data에 있는 내용을 잘라서 studentList에 저장 후 전체출력 
		String[] temp = data.split("\n");
		int stSize = temp.length;
		studentList = new Student[stSize];
		for(int i=0; i<stSize; i++) {
			studentList[i] = new Student();
			
			String[] info = temp[i].split("/");
			studentList[i].name = info[0];
			studentList[i].score = Integer.parseInt(info[1]);
		}
		System.out.println("[이름]\t[성적]");
		for(int i=0; i<stSize; i++) {
			System.out.println(studentList[i].name + "\t" + studentList[i].score);
		}
	
		//문제2) 꼴등 삭제 후 다시 data에 저장
		int minScore = 100;
		int minIndex = 0;
		for(int i=0; i<stSize; i++) {
			if(minScore > studentList[i].score) {
				minScore = studentList[i].score;
				minIndex = i;
			}
		}
		System.out.println("꼴등 = " + studentList[minIndex].name);
		
		for(int i=minIndex; i<stSize - 1; i++) {
			studentList[i] = studentList[i + 1];
		}
		stSize -= 1;
		
		data = "";
		for(int i=0; i<stSize; i++) {
			data += studentList[i].name + "/";
			data += studentList[i].score + "\n";
		}
		
		data = data.substring(0, data.length() - 1);
		System.out.println(data);
		
	}
}






