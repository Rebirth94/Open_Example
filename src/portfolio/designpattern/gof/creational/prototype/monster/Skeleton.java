package portfolio.designpattern.gof.creational.prototype.monster;

public class Skeleton {
	private int level;
	private String weapon;
	private String armor;
	
	public Skeleton(int level, String weapon, String armor) {
		this.level = level;
		this.weapon = weapon;
		this.armor = armor;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public String getArmor() {
		return armor;
	}
	public void setArmor(String armor) {
		this.armor = armor;
	}

	@Override
	public String toString() {
		return "Skeleton [" + super.toString() + "] [level=" + level + ", weapon=" + weapon + ", armor=" + armor + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Skeleton(this.level, this.weapon, this.armor);
	}
	
}
