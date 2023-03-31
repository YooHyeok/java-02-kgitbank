package Game;

class Game_Player {
	
	private String Id = "";
	private int level;
	private int attack;
	private int hp;
	
	Game_Player() {
		this.level = 1;
		this.attack = 5;
		this.hp = 20;
	}
	
	public void setUser(String Id, int level, int attack, int hp) {
		this.Id = Id;
		this.level = level;
		this.attack = attack;
		this.hp = hp;
		
	}
	
	
	
	public void setId(String Id) {
		this.Id = Id;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public String getId() {
		return this.Id;
	}
	public int getLevel() {
		return this.level;
	}
	public int getAttack() {
		return this.attack;
	}
	public int getHp() {
		return this.hp;
	}
	
	public void levelUp(int level) {
		this.level += level;
		this.attack += level*3;
		this.hp += level*10;
		
	}
	public void disp() {
		System.out.println("ID : "+getId());
		System.out.println("Level : "+getLevel());
		System.out.println("Attack : "+getAttack());
		System.out.println("Hp : "+getHp());
		System.out.println(this.Id);
	}
	
	public void disp(int num) {
		System.out.print("[ "+num+" ]");
		System.out.print("\t"+getId());
		System.out.print("\t"+getLevel());
		System.out.print("\t"+getAttack());
		System.out.println("\t"+getHp());
		
	}
}
