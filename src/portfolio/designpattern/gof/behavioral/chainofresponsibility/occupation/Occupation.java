package portfolio.designpattern.gof.behavioral.chainofresponsibility.occupation;

import portfolio.designpattern.gof.behavioral.chainofresponsibility.monster.DungeonMonster;

abstract public class Occupation {
	protected String name; 
	protected Occupation nextHunter;

	protected Occupation(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setNextHunter(Occupation hunter) {
		this.nextHunter = hunter;
	}
	
	protected void win(DungeonMonster monster) {
		System.out.println(this.name + " 이(가) " + monster.getName() + " 을(를) 잡았습니다.");
	}
	

	abstract public boolean hunting(DungeonMonster monster);
}
