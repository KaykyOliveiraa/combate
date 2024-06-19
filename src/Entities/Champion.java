package Entities;

public class Champion {
	
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion() {
	}

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public void takeDamage(Champion other) {
		if(this.armor >= other.attack) {
			other.attack = 1;
			this.life = this.life - other.attack;
		}else {
			this.life = this.life + this.armor - other.attack;
		}
		
		if(other.armor >= this.attack) {
			this.attack = 1;
			other.life = other.life - this.attack;
		}else {
			other.life = other.life + other.armor - this.attack;
		}
	}
	
	public String status() {
		return this.name + ": " + this.life + " de vida";
	}

}
