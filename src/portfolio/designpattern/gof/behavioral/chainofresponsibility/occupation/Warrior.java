package portfolio.designpattern.gof.behavioral.chainofresponsibility.occupation;

import portfolio.designpattern.gof.behavioral.chainofresponsibility.monster.DungeonMonster;
import portfolio.designpattern.gof.behavioral.chainofresponsibility.monster.Skeleton;

public class Warrior extends Occupation {
	public Warrior() {
		super("전사");
	}

	@Override
	public boolean hunting(DungeonMonster monster) {
		if(monster instanceof Skeleton) {
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
