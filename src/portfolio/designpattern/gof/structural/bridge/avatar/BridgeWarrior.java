package portfolio.designpattern.gof.structural.bridge.avatar;

public class BridgeWarrior extends BridgeOccupation {

	public BridgeWarrior() {
		super("전사");
	}
	
	@Override
	public void attack() {
		System.out.print( super.getName() + "이(가) ");
		super.getWeapon().attack();
		System.out.println();
	}
	
	@Override
	public void skill() {
		tenAttacksSkill();
	}
	
	public void tenAttacksSkill() {
		System.out.println( super.getName() + "이(가) 10연속 베기 스킬 사용");
		for(int i=0; i < 10; i++) {
			super.getWeapon().attack();
		}
		System.out.println();
	}

}
