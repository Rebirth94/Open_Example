package portfolio.designpattern.gof.behavioral.command.shortcut.command;

import portfolio.designpattern.gof.behavioral.command.actions.Potion;
import portfolio.designpattern.gof.behavioral.command.shortcut.buttons.ShortcutCommand;

public class DrinkShortcutCommand implements ShortcutCommand {

	private Potion potion; 
	
	public DrinkShortcutCommand(Potion potion) {
		this.potion = potion;
	}
	
	@Override
	public void action() {
		potion.drink();
	}

}
