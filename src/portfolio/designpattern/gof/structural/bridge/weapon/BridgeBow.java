package portfolio.designpattern.gof.structural.bridge.weapon;

public class BridgeBow implements BridgeWeapon {

	@Override
	public void attack() {
		System.out.println("활쏘기");
	}
	
}
