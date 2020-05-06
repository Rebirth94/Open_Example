package portfolio.designpattern.gof.behavioral.templatemethod.occupation;

public class Wizard {
	private final String name = "마법사";
	
	public String getName() {
		return this.name;
	}
	public void potionDrinking() {
		System.out.println("마나 회복 물약 마시기");
	}

	public void attack() {
		System.out.println("원거리 마법 공격");
	}

	public void defend() {
		System.out.println("마나 쉴드");
	}

	public void activeSkil() {
		System.out.println("파이어볼");
	}
	
}
