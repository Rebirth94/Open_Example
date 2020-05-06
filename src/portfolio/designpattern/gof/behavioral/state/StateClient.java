package portfolio.designpattern.gof.behavioral.state;

import portfolio.designpattern.gof.behavioral.state.warrior.WarriorContext;
import portfolio.designpattern.gof.behavioral.state.warrior.weapon.Spear;
import portfolio.designpattern.gof.behavioral.state.warrior.weapon.Sword;

public class StateClient {
	public static void main(String[] args) {
		WarriorContext warrior = new WarriorContext();
		warrior.attack();
		
		warrior.weaponsEquipped(new Sword());
		warrior.attack();
		warrior.attack();
		
		warrior.weaponsEquipped(new Spear());
		warrior.attack();
		warrior.attack();
		warrior.attack();
	}
}
