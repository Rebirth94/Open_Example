package portfolio.designpattern.gof.structural.facade.warrior;

import portfolio.designpattern.gof.structural.facade.warrior.item.Armor;
import portfolio.designpattern.gof.structural.facade.warrior.item.Potion;
import portfolio.designpattern.gof.structural.facade.warrior.item.Shield;
import portfolio.designpattern.gof.structural.facade.warrior.item.Weapon;
import portfolio.designpattern.gof.structural.facade.warrior.skill.SpeedBuff;
import portfolio.designpattern.gof.structural.facade.warrior.skill.StrengthBuff;

public class Warrior {
	
	// 인벤토리로 가정
	private Armor armor = new Armor();
	private Weapon weapon = new Weapon();
	private Shield shield = new Shield();
	private Potion potion = new Potion();
	
	// 스킬 목록으로 가정
	private StrengthBuff strengthBuff = new StrengthBuff();
	private SpeedBuff speedBuff = new SpeedBuff();
	
	public void setCombatMode() {
		System.out.println("[전투준비]\n");
		armor.setArmor();
		weapon.setWeapon();
		shield.setShield();
		potion.usePosion();
		strengthBuff.useStrengthBuff();
		speedBuff.useSpeedBuff();
		System.out.println("\n[전투모드 변경 완료]");
	}
}
