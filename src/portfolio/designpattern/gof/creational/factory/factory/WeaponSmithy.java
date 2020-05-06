package portfolio.designpattern.gof.creational.factory.factory;

import portfolio.designpattern.gof.creational.factory.weapons.Bow;
import portfolio.designpattern.gof.creational.factory.weapons.Empty;
import portfolio.designpattern.gof.creational.factory.weapons.Sword;
import portfolio.designpattern.gof.creational.factory.weapons.Wand;
import portfolio.designpattern.gof.creational.factory.weapons.Weapons;

/* Factory */
public class WeaponSmithy {
	
	public Weapons createWeapon(String input) {
		
		switch (input) {
			case "검": return new Sword();
			case "활": return new Bow();
			case "지팡이": return new Wand();
			
			default : return new Empty();
		}
		
	}
}
