package portfolio.designpattern.gof.structural.bridge.weapon;

public class BridgeSword implements BridgeWeapon {

	@Override
	public void attack() {
		System.out.println("검으로 베기");
	}
	
}
