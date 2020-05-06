package portfolio.designpattern.gof.behavioral.chainofresponsibility.occupation;

import portfolio.designpattern.gof.behavioral.chainofresponsibility.monster.DungeonMonster;
import portfolio.designpattern.gof.behavioral.chainofresponsibility.monster.Orc;

public class Wizard extends Occupation{
	public Wizard() {
		super("마법사");
	}

	@Override
	public boolean hunting(DungeonMonster monster) {
		if(monster instanceof Orc) {
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
