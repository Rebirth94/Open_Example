package portfolio.designpattern.gof.behavioral.state.warrior;

import portfolio.designpattern.gof.behavioral.state.warrior.weapon.WarriorEmptyHands;
import portfolio.designpattern.gof.behavioral.state.warrior.weapon.WarriorWeapon;

public class WarriorContext {
	private WarriorWeapon weapon;
	
	public WarriorContext() {
		this.weapon = new WarriorEmptyHands(); 
	}
	
	public WarriorContext(WarriorWeapon weapon) {
		weaponsEquipped(weapon);
	}
	
	public void weaponsEquipped(WarriorWeapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		weapon.attack();
	}
}
