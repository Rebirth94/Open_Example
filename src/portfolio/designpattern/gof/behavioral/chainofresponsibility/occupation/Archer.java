package portfolio.designpattern.gof.behavioral.chainofresponsibility.occupation;

import portfolio.designpattern.gof.behavioral.chainofresponsibility.monster.DungeonMonster;
import portfolio.designpattern.gof.behavioral.chainofresponsibility.monster.Harpy;

public class Archer extends Occupation{
	public Archer() {
		super("궁수");
	}

	@Override
	public boolean hunting(DungeonMonster monster) {
		if(monster instanceof Harpy) {
			win(monster);
			return true;
		}
		if(super.nextHunter != null) {
			return super.nextHunter.hunting(monster);
		} else {
			return false;
		}
	}
}
