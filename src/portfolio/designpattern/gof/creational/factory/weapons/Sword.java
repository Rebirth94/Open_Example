package portfolio.designpattern.gof.creational.factory.weapons;

public class Sword implements Weapons {
	@Override
	public void make() {
		System.out.println("검을 제작하였습니다.");
	}
}
