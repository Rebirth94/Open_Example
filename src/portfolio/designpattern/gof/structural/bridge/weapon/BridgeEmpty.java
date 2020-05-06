package portfolio.designpattern.gof.structural.bridge.weapon;

public class BridgeEmpty implements BridgeWeapon {

	@Override
	public void attack() {
		System.out.println("맨손 때리기");
	}
	
}
