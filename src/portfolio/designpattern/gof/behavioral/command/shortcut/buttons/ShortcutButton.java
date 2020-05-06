package portfolio.designpattern.gof.behavioral.command.shortcut.buttons;

public interface ShortcutButton {
	void setCommnad(ShortcutCommand command);
	String getButtonName();
}
