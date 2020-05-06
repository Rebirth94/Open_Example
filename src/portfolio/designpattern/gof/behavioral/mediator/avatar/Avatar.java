package portfolio.designpattern.gof.behavioral.mediator.avatar;

import java.util.ArrayList;

import portfolio.designpattern.gof.behavioral.mediator.item.Item;
import portfolio.designpattern.gof.behavioral.mediator.mediator.ActionMediator;

abstract public class Avatar {

	private ActionMediator actionMediator;
	
	private final String name;
	private ArrayList<Item> inventory = new ArrayList<>();
	private int hp;
	private int power;
	
	public Avatar(String name, int hp, int power) {
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
	
	public ArrayList<Item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}

	public void move(String destination) {
		this.actionMediator.move(destination);
	}
	
	public void attack() {
		this.actionMediator.attack();
	}
	
	public void pickUpItem() {
		this.actionMediator.pickUpItem();
	}
	
}
