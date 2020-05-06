package portfolio.designpattern.gof.creational.builder.avatar;

public class Avatar {
	private int level;
	private String nickName;
	private String occupation;
	private String weapon;
	private String armor;
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
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
		return "Avatar [level=" + level + ", nickName=" + nickName + ", occupation=" + occupation + ", weapon=" + weapon
				+ ", armor=" + armor + "]";
	}
	
}
