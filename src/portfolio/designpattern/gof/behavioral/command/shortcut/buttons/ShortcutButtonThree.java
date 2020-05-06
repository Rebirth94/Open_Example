package portfolio.designpattern.gof.behavioral.command.shortcut.buttons;

public class ShortcutButtonThree implements ShortcutButton, ShortcutCommand{

	ShortcutCommand command;
	
	public ShortcutButtonThree() {}
	
	public ShortcutButtonThree(ShortcutCommand command) {
		setCommnad(command);
	}
	
	@Override
	public String getButtonName() {
		return "단축키3";
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
