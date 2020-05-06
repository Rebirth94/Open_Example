package portfolio.designpattern.gof.behavioral.mediator.mediator;

import portfolio.designpattern.gof.behavioral.mediator.avatar.Avatar;
import portfolio.designpattern.gof.behavioral.mediator.field.ExampleField;
import portfolio.designpattern.gof.behavioral.mediator.item.Item;
import portfolio.designpattern.gof.behavioral.mediator.monster.Monster;

abstract public class ActionMediator {

	private ExampleField currentField;
	private Avatar avatar;
	private Monster monster;
	
	public ExampleField getCurrentField() {
		return currentField;
	}
	public void registerCurrentField(ExampleField currentField) {
		this.currentField = currentField;
	}
	public Avatar getAvatar() {
		return avatar;
	}
	public void registerAvatar(Avatar avatar) {
		this.avatar = avatar;
	}
	public Monster getMonster() {
		return monster;
	}
	public void registerMonster(Monster monster) {
		this.monster = monster;
	}
	
	abstract public void move(String destination);
	abstract public Item pickUpItem();
	abstract public void attack();
}
