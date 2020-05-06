package portfolio.designpattern.gof.behavioral.command.shortcut.command;

import portfolio.designpattern.gof.behavioral.command.actions.Weapon;
import portfolio.designpattern.gof.behavioral.command.shortcut.buttons.ShortcutCommand;

public class AttackShortcutCommand implements ShortcutCommand {
	
	private Weapon weapon;

	public AttackShortcutCommand(Weapon weapon) {
		this.weapon = weapon;
	}
	
	@Override
	public void action() {
		weapon.attack();
	}
}
