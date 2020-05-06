package portfolio.designpattern.gof.behavioral.chainofresponsibility.occupation;

import portfolio.designpattern.gof.behavioral.chainofresponsibility.monster.DungeonMonster;
import portfolio.designpattern.gof.behavioral.chainofresponsibility.monster.Vampire;

public class Assassin extends Occupation{
	public Assassin() {
		super("암살자");
	}

	@Override
	public boolean hunting(DungeonMonster monster) {
		if(monster instanceof Vampire) {
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
