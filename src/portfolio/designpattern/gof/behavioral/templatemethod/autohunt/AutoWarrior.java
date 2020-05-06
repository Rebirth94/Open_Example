package portfolio.designpattern.gof.behavioral.templatemethod.autohunt;

import portfolio.designpattern.gof.behavioral.templatemethod.occupation.Warrior;

public class AutoWarrior extends AutoHunt {
	private Warrior warrior;

	public AutoWarrior(Warrior warrior) {
		super(warrior.getName());
		this.warrior = warrior;
	}

	@Override
	protected final void battleFormExecution() {
		warrior.defend();
		warrior.activeSkil();
		warrior.potionDrinking();
		warrior.attack();
		warrior.attack();
		warrior.attack();
	}
}
