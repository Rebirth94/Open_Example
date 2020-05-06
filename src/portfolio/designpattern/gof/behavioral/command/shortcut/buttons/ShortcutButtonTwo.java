package portfolio.designpattern.gof.behavioral.command.shortcut.buttons;

public class ShortcutButtonTwo implements ShortcutButton, ShortcutCommand{

	ShortcutCommand command;
	
	public ShortcutButtonTwo() {};
	
	public ShortcutButtonTwo(ShortcutCommand command) {
		setCommnad(command);
	}
	
	@Override
	public String getButtonName() {
		return "단축키2";
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
