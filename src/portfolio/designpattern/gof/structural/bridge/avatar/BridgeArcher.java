package portfolio.designpattern.gof.structural.bridge.avatar;

import portfolio.designpattern.gof.structural.bridge.weapon.BridgeBow;
import portfolio.designpattern.gof.structural.bridge.weapon.BridgeWeapon;

public class BridgeArcher extends BridgeOccupation {

	public BridgeArcher() {
		super("궁수");
	}
	
	@Override
	public void attack() {
		System.out.print( super.getName() + "이(가) ");
		super.getWeapon().attack();
		System.out.println();
	}
	
	public void aimingBowAttackSkill() {
		System.out.println( super.getName() + "이(가) 조준사격 스킬 사용");
		BridgeWeapon weapon = super.getWeapon();
		
		if(weapon instanceof BridgeBow) {
			System.out.print("(조준사격)");
			weapon.attack();
		} else {
			System.out.println("활을 들었을때만 사용한 스킬입니다.");
		}
		System.out.println();
	}

}
