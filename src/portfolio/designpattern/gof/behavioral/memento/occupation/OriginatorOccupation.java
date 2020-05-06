package portfolio.designpattern.gof.behavioral.memento.occupation;

import portfolio.designpattern.gof.behavioral.memento.savedata.SaveDataMemento;

abstract public class OriginatorOccupation {
	
	private final String name;
	private int hp;
	private String currentLocation;
	
	public OriginatorOccupation(String name, int hp) {
		this.name = name;
		setHp(hp);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getName() {
		return name;
	}
	
	public SaveDataMemento createMement() {
		return new SaveDataMemento(getName(), getHp());
	}
	
	public void loadSaveData(SaveDataMemento memento) {
		setHp( memento.getHp() );
	}
	
	public void sufferDamage(int damage) {
		setHp(getHp() - damage);
	}
}
