package Game;

public class Game_Main {

	public static void main(String[] args) {
		
		Game_Player[] users = new Game_Player[3];
		for(int i=0; i<3; i++) {
			users[i] = new Game_Player();
		}
		users[0].setId("공유");
		users[1].setId("아이유");
		users[2].setId("유인나");
		
		for(int i=0; i<3; i++) {
			users[i].disp();
			System.out.println();
		}
		
		users[0].levelUp(5);
		users[0].disp();
		
		System.out.println("번호\t아이디\t레벨\t공격력\t쉴드\n");
		for(int i=0; i<3; i++) {
			users[i].disp(i+1);
		}
	}

}
