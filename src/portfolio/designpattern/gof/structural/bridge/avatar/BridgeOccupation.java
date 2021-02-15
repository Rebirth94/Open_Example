package portfolio.designpattern.gof.structural.bridge.avatar;

import portfolio.designpattern.gof.structural.bridge.weapon.BridgeEmpty;
import portfolio.designpattern.gof.structural.bridge.weapon.BridgeWeapon;

public abstract class BridgeOccupation {
	private final String name;
	private BridgeWeapon weapon = new BridgeEmpty();
	
	public BridgeOccupation(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public BridgeWeapon getWeapon() {
		return weapon;
	}

	public void setWeapon(BridgeWeapon weapon) {
		this.weapon = weapon;
	}
	
	abstract public void attack();

	abstract public void skill();
}
