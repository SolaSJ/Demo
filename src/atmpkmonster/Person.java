package atmpkmonster;

public class Person {
	private String name;
	private int hp;
	private int attack;
	public Person(){
		
	}
	public Person(String name,int hp,int attack){
		this.attack=attack;
		this.hp=hp;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}


}
