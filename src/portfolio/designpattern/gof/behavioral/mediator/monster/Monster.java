package portfolio.designpattern.gof.behavioral.mediator.monster;

import portfolio.designpattern.gof.behavioral.mediator.item.Item;
import portfolio.designpattern.gof.behavioral.mediator.mediator.ActionMediator;

abstract public class Monster {
	
	private ActionMediator actionMediator;
	
	private final String name;
	private Item[] inventory = new Item[10];
	private int hp;
	private int power;
	
	public Monster(String name, int hp, int power) {
		this.name = name;
		setHp(hp);
		setPower(power);
	}

	public ActionMediator getActionMediator() {
		return actionMediator;
	}

	public void setActionMediator(ActionMediator actionMediator) {
		this.actionMediator = actionMediator;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public Item[] getInventory() {
		return inventory;
	}

	public void setInventory(Item[] inventory) {
		this.inventory = inventory;
	}
	
	public void getDamage(int damage) {
		setHp( getHp() - damage );
	}
	
	public void move() {
		
	}
	
}
