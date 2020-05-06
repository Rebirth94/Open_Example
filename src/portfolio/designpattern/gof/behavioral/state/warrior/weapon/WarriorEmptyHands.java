package portfolio.designpattern.gof.behavioral.state.warrior.weapon;

public class WarriorEmptyHands implements WarriorWeapon {

	@Override
	public void attack() {
		System.out.println("맨손 공격");
	}

}
