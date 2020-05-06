package portfolio.designpattern.gof.behavioral.state.warrior.weapon;

public class Sword implements WarriorWeapon {

	@Override
	public void attack() {
		System.out.println("검 공격");
	}

}
