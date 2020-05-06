package portfolio.designpattern.gof.behavioral.chainofresponsibility.monster;

abstract public class DungeonMonster {
	protected String name;

	public DungeonMonster(String name) {
		this.name = name;
		System.out.println(name + " 이(가) 나타났습니다.");
	}
	
	public String getName() {
		return this.name;
	}
}
