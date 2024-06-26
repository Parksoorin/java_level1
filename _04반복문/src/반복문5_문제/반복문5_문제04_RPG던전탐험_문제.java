package 반복문5_문제;

/*
	[문제]
		플레이어는 무기, 방어구, 체력, 돈, 운 등의 데이터가 있다.(추가 가능)
		플레이어와 적은 1명으로하고 1명 이상은 추후 배열에서 가능하다.
		
		1. 메인 메뉴
			- [1.여관] [2.대장간] [3.던전] [0.종료]
		2. [1.여관]
			- 여관은 소지금을 소모해 체력과 스킬회복 또는 아이템을 구입한다.
			- [1.숙박(체력,스킬회복)] [2.물약구입] [0.뒤로가기]
		3. [2.대장간]
			- 대장간은 소지금을 소모해 랜덤으로 무기와 방어구 업그레이드 시켜준다.
			- [1.무기업] [2.방어구입] [0.뒤로가기]
		4. [3.던전]
			- 던전은 몬스터를 만나 전투를 한다.
			- [1.공격] [2.스킬] [3.물약먹기] [0.뒤로가기]
			- 스킬은 2번 공격을 한다.
			- 물약을 먹으면 체력이 회복된다.
			- 승리하면 돈을 획득한다.
		* [주의] 반드시 뒤로가기기를 이용해서 푸시오.
*/

public class 반복문5_문제04_RPG던전탐험_문제 {
	public static void main(String[] args) {
		
		int 현재체력 = 0;
		int 최대체력 = 0;
		int 공격력 = 0;
		int 방어력 = 0;
		int 물약개수 = 0;
		int 스킬개수 = 0;
		int 소지금 = 0;
		
		int 몬스터현재체력 = 0;
		int 몬스터최대체력 = 0;
		int 몬스터공격력 = 0;
		int 몬스터소지금 = 0;
		
	}
}
