package portfolio.designpattern.gof.behavioral.templatemethod.occupation;

public class Warrior {
	private final String name = "전사";

	public String getName() {
		return this.name;
	}

	public void potionDrinking() {
		System.out.println("공격력 증가 물약 마시기");
	}

	public void attack() {
		System.out.println("근거리 물리 공격");
	}

	public void defend() {
		System.out.println("방패 막기");
	}

	public void activeSkil() {
		System.out.println("기절시키기");
	}
	
}
