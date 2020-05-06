package portfolio.designpattern.gof.creational.builder.builder;

import portfolio.designpattern.gof.creational.builder.avatar.Avatar;

abstract public class AvatarBuilder {
	protected Avatar avatar;
	
	public AvatarBuilder(String nickName) {
		this.avatar = new Avatar();
		this.avatar.setNickName(nickName);
	}

	public void buildLevel(int level){
		this.avatar.setLevel(level);
	}

	public void buildWeapon(String weapon){
		this.avatar.setWeapon(weapon);
	}
	
	public void buildArmor(String armor){
		this.avatar.setArmor(armor);
	}
	
	abstract public void buildOccupation();
	
	public Avatar build() {
		return this.avatar;
	}
}
