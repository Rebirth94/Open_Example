package portfolio.designpattern.gof.behavioral.command.shortcut.buttons;

public class ShortcutButtonOne implements ShortcutButton, ShortcutCommand{

	ShortcutCommand command;
	
	public ShortcutButtonOne() {}
	
	public ShortcutButtonOne(ShortcutCommand command) {
		setCommnad(command);
	}
	
	@Override
	public String getButtonName() {
		return "단축키1";
	}

	@Override
	public void setCommnad(ShortcutCommand command) {
		this.command = command;
	}

	@Override
	public void action() {
		if(command != null) {
			command.action();
		}
	}
	
	


}
