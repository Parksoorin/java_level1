package 메서드클래스배열4_문제;

import java.util.Scanner;

class Client {
	String id;
	String name;
}

class ClientDAO {
	int clientCount = 0;
	
	Scanner scan = new Scanner(System.in);
	Client[] clientList = new Client[100];
	
	void join() {
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		System.out.print("이름 입력 : ");
		String name = scan.next();
		
		Client client = new Client();
		client.id = id;
		client.name = name;
		insertClient(client);
	}
	
	void insertClient(Client client) {
		clientList[clientCount] = client;
		clientCount += 1;
	}
	
	void remove() {
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		
		removeClient(id);
	}
	
	int checkId(String id) {
		int index = -1;
		for(int i=0; i<clientCount; i++) {
			if(id.equals(clientList[i].id)) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	void removeClient(String id) {
		
		int index = checkId(id);
		
		if(index == -1) {
			System.out.println("아이디 입력 오류!");
		} else {
			for(int i=index; i<clientCount - 1; i++) {
				clientList[i] = clientList[i + 1];
			}
			clientCount -= 1;
		}
	}
	

	void printClientList() {
		for(int i=0; i<clientCount; i++) {
			System.out.println(clientList[i].id + " " + clientList[i].name);
		}
	}
}

public class 메서드클래스배열4_문제07_회원관리DAO {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		ClientDAO clientDAO = new ClientDAO();
		while(true) {
			System.out.println("[1]추가 [2]삭제 [3]출력 [0]종료");
			
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			} else if(sel == 1) {
				clientDAO.join();
			} else if(sel == 2) {
				clientDAO.remove();
			} else if(sel == 3) {
				clientDAO.printClientList();
			}
		}
		
	}
}
