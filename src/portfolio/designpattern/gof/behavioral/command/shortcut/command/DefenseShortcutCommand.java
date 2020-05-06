package portfolio.designpattern.gof.behavioral.command.shortcut.command;

import portfolio.designpattern.gof.behavioral.command.actions.Shield;
import portfolio.designpattern.gof.behavioral.command.shortcut.buttons.ShortcutCommand;

public class DefenseShortcutCommand implements ShortcutCommand {
	
	private Shield shield;
	
	public DefenseShortcutCommand(Shield shield) {
		this.shield = shield;
	}
	
	@Override
	public void action() {
		shield.Defense();
	}

}
